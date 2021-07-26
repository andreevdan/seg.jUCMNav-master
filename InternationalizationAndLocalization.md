# Internationalization and Localization in Java

## Disclaimer

This is a big rip-off of Sun's website. All copyrigths belong to them.
Please see the Additional Reference section for the source.

## What is internationalization and localization?

Internationalization (abbreviated i18n) is the process of designing an
application that can be adapted to various languages and regions without
engineering changes. This process results in an application that can be
run worldwide with the appropriate localized data. This also means that
no strings are hard-coded in the program; they are retrieved by the
program at run-time. The format in which data (such as date and
currency) is displayed is not hard-coded and is culturally sensitive.

Localization (abbreviated l10n) is the process of adapting software for
a specific region and language by adding locale-specific components and
translating text. We can also localized things like sounds and images.

## How-to Internationalize a Java Application

Here is a sample program that we want to internationalize.

    public class NotI18N {
        static public void main(String[] args) {
            System.out.println("Hello.");
            System.out.println("How are you?");
            System.out.println("Goodbye.");
        }
    }

In order to internationalize this program, we must create a
`RessourceBundle` that contains key/value pairs. The key/value pairs are
stocked in a properties file. Suppose we create a resource bundle called
`MessagesBundle`, we'll need the following files:

  - `MessagesBundle.properties` containing the default value for the
    strings.
  - `MessagesBundle_fr_CA.properties` containing translated strings for
    the `fr_CA` locale.
  - Other translated `MessagesBundle`.

A sample `MessagesBundle` looks like this:

    greetings = Bonjour.
    farewell = Au revoir.
    inquiry = Comment allez-vous?

Then when we have our properties files, we can modify our sample class.
First, we need to get a `Locale` so we can load the appropriate
properties file. The `Locale` is comprised of two things, the language
and the country. Then, when we have a `Locale` object, we can use that
object to load the proper `RessourceBundle`.

To finish this example, here is the localized program.

    import java.util.*;
    
    public class I18NSample {
       static public void main(String[] args) {
          String language;
          String country;
    
          if (args.length != 2) {
              language = new String("fr");
              country = new String("DE");
          } else {
              language = new String(args[0]);
              country = new String(args[1]);
          }
    
          Locale currentLocale;
          ResourceBundle messages;
    
          currentLocale = new Locale(language, country);
    
          messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
    
          System.out.println(messages.getString("greetings"));
          System.out.println(messages.getString("inquiry"));
          System.out.println(messages.getString("farewell"));
       }
    }

## Dealing with compound message

A compound message is a string composed of static text and variable
output.

Consider the following example:\<br\> \<img
src="<http://java.sun.com/docs/books/tutorial/figures/i18n/i18n-2.gif>"\>

If we want to add this message into the sample program from the previous
example, we will need to create the following entries in our
`MessagesBundle` properties files.

    template = At {2,time,short} on {2,date,long}, we detected \
             {1,number,integer} spaceships on the planet {0}.
    planet = Mars

The template line describes a pattern which is used to display the
proper localized string. Here is a description of the arguments:

| Argument           | Description                                                                                                                                                                                                                             |
| :----------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| {2,time,short}     | The time portion of a `Date` object. The short style specifies the `DateFormat.SHORT` formatting style.                                                                                                                                 |
| {2,date,long}      | The date portion of a `Date` object. The same `Date` object is used for both the date and time variables. In the Object array of arguments the index of the element holding the Date object is 2. (This is described in the next step.) |
| {1,number,integer} | A `Number` object, further qualified with the integer number style.                                                                                                                                                                     |
| {0}                | The `String` in the `ResourceBundle` that corresponds to the planet key.                                                                                                                                                                |

The number after the opening bracket refers to the position of the
parameters in an `Object` array.

The next step in the localization process is to create an `Object` array
containing all the variables we want to use in the `String`. This is
done like that:

    Object[] messageArguments = {
        messages.getString("planet"),
        new Integer(7),
        new Date()
    };

Next we need to create a `MessageFormat` object. You must set the
`Locale` because the message contains `Date` and `Number` objects, which
should be formatted in a locale-sensitive manner.

    MessageFormat formatter = new MessageFormat("");
    formatter.setLocale(currentLocale);

Next, we just apply the template on the `MessageFormat` object.

    formatter.applyPattern(messages.getString("template"));
    String output = formatter.format(messageArguments);

## Handling Plurals

For instance, if we want to internationalize a function which produces
the following output:

    There are no files on XDisk.
    There is one file on XDisk.
    There are 2 files on XDisk.

We could take the coward way out and handle it like that, but it’s not a
good idea:

    There are {0,number} file(s) on {1}.

First, we need to identify the variable in this string.\<br\> \<img
src="<http://java.sun.com/docs/books/tutorial/figures/i18n/i18n-3.gif>"\>

We can clearly see that we have two variables; therefore we can use the
following pattern:

    There {0} on {1}.

The argument for the disk name, which is represented by {1}, is easy
enough to deal with. You just treat it like any other `String` variable
in a `MessageFormat` pattern.

In order to deal with the first variable, we need to use a
`ResourceBundle` containing all the translation in separate key/value
pairs. For instance, we need the following `ResourceBundle` file:

    pattern = There {0} on {1}.
    noFiles = are no files
    oneFile = is one file
    multipleFiles = are {2} files

Then once we have the proper `ResourceBundle`, we need to create a
message formatter with the `MessageFormat` class and set its `Locale`.

    MessageFormat messageForm = new MessageFormat("");
    messageForm.setLocale(currentLocale);

The `ChoiceFormat` object allows you to choose, based on a `Double`
number, a particular `String`. The range of `Double` numbers, and the
`String` objects to which they map, are specified in arrays:

    double[] fileLimits = {0,1,2};
    String [] fileStrings = {
        bundle.getString("noFiles"),
        bundle.getString("oneFile"),
        bundle.getString("multipleFiles")
    };

`ChoiceFormat` maps each element in the `Double` array to the element in
the `String` array that has the same index. In the sample code the 0
maps to the `String` returned by calling `bundle.getString("noFiles")`.
By coincidence the index is the same as the value in the `fileLimits`
array. You specify the `Double` and `String` arrays when instantiating
`ChoiceFormat`:

    ChoiceFormat choiceForm = new ChoiceFormat(fileLimits,
                                               fileStrings);

Once we have the `ChoiceFormat` object, we can apply the pattern.

    String pattern = bundle.getString("pattern");
    messageForm.applyPattern(pattern);

Once the pattern is applied, we need to assign the formats to the
`MessageFormat` object.

    Format[] formats = {choiceForm, null,
                        NumberFormat.getInstance()};
    messageForm.setFormats(formats);

The `setFormats` method assigns `Format` objects to the arguments in the
message pattern. You must invoke the `applyPattern` method before you
call the `setFormats` method. The following table shows how the elements
of the `Format` array correspond to the arguments in the message
pattern:

| Array Element                | Pattern Argument |
| :--------------------------- | :--------------- |
| `choiceForm`                 | `{0}`            |
| `null`                       | `{1}`            |
| `NumberFormat.getInstance()` | `{2}`            |

The last step is to set the Arguments before formatting the message. In
this example, the object argument look like this:

    Object[] messageArguments = {null, "XDisk", null};

You can use the following code to test the output of the function.

    for (int numFiles = 0; numFiles < 4; numFiles++) {
        messageArguments[0] = new Integer(numFiles);
        messageArguments[2] = new Integer(numFiles);
        String result = messageForm.format(messageArguments);
        System.out.println(result);
    }

## Excluding Strings from Internationalization

To exclude a Sring from internationalization, you must include `//
$NON-NLS-1$` after the String. For example, consider the following code:

    System.out.println("This will not get translated."); //$NON-NLS-1$

In the case you have a function call containing multiple strings but
only one string is not meant to be translated, you must change the index
number. For example, consider the following code:

    myMethod("Param 1", "Param 2", "Param 3"); //$NON-NLS-2$

In this case, the String "Param 2" will not get translated.

# Internationalization in Eclipse

## Create Warnings in Eclipse for String that are not Internationalized

You can set an option in the Java compiler to generate warnings when you
have strings that are not internationalized. You can specify this
settings at the project level or at the workspace level. However, I
recommend setting this at the project level. Here is how to do it:

1.  Right-click the project and choose **Properties**.
2.  Click on **Java Compiler**.
3.  Select Use **projet settings**.
4.  Go to the **Advanced** tab.
5.  Change **Usage of non-externalized strings** to **Warning** or
    **Error**.

%ATTACHURL%/EclipseStringExternalizedWarning.png

# Pitfalls

  - GTK does not support well complex script languages. (Thai and
    arabic)
  - Fonts issue can arrise. (MS Arial Unicode rotate chinese characters)

# Additional Reference and Sources

  - <http://eclipse.org/articles/Article-Internationalization/how2I18n.html>
  - <http://java.sun.com/docs/books/tutorial/i18n/intro/index.html>
  - Eclipse Help -\> Java Development User Guide -\> Concepts -\> String
    externalization

\-- Main.OlivierCliftNoel - 12 Feb 2005
