\-- Main.OpeoluwaEweje - 14 Aug 2017

This page contains Github instructions to help new developers catch onto
getting the jUCMNav source code from Github. This Github instructions is
ordered in a step wise manner and should be followed sequentially.

### Connecting Eclipse with Github
### Steps to be taken:

1. Sign Up for Github
2. Installing EGit
3. Create a DSA Key in Eclipse
4. Register DSA Key with Github
5. Create Repository on Github
6. Import Github Repository into eclipse
7. Link Eclipse Project with Github Repository
8. Uploading Project Sources to Github
[](GitHub)

#### 

#### Step 1: Sign Up for Github

That’s the easiest part, just go to [https://github.com](https://github.com) and register!

#### Step 2: Installing EGit

You will need to install the Git plugin for eclipse, EGit, in order to
upload code from eclipse projects. 
In eclipse, go to Help / Install New Software

[[img/1.PNG]]

Open the eclipse Indigo repository

[[img/2.PNG]]

Select Collaboration / Eclipse EGit, Eclipse JGit, EGit Mylyn

[[img/3.PNG]]

Click \[Next\] 
Click \[Next\] and confirm the licence agreement
Restart eclipse and the EGit plugin should be installed

#### Step 3: Create a DSA Key in Eclipse

In order to be able to upload source code to github, you need to define
a secure key, which must be known both to your local eclipse
installation as well as the github service. Luckily, eclipse provides
all the tooling necessary to generate the appropriate key.
Open Menu Window/Preferences
In the preferences, go to General/Network Connections/SSH2
On the SSH2 page, open the tab ‘Key Management’

[[img/4.PNG]]


Click on \[Generate DSA Key …\]
At the bottom of the page, enter a passphrase of your choosing


[[img/5.PNG]]

Click \[Save Private Key …\]
Save the key at a location of your choosing (best in the location specified as your SSH2 home on under the tab General)

[[img/6.PNG]]

#### 

#### 

#### Step 4: Register DSA Key with [Github](GitHub)

Open the file you have saved in the previous step with a text editor
(e.g. Notepad on windows)
Select the contents of the file (Ctrl + A) and copy the complete text
Go to the Github website (<https://github.com>) and login
On the top right of the screen, click on ‘Account Settings’

[[img/7.PNG]]


On the left hand side of the account settings, click on
‘SSH Keys’

[[img/8.PNG]]

Click on \[Add SSH key\]
Provide an appropriate title for your key (e.g. ‘EGit 3' )
Paste the contents from the text file containing your DSA key into the text box ‘Key’

[[img/9.PNG]]

Click \[Add Key\]

#### 

#### Step 5: Create Repository on [Github](GitHub)

In order to upload source code from a project in eclipse to Github, you
will need to create a Github repository.
Go to Github homepage (<https://github.com/>) and log in
At the top right corner, click on ‘Create a New Repo’

[[img/10.PNG]]

Choose a repository name and description to your
liking and click \[Create Repository\]

[[img/11.PNG]]

#### 

#### Step 6: Import Github Repository into eclipse

Before you can link an existing eclipse project to a Github repository,
you must import the repository you have created on Github first. For
this:
In eclipse, open Menu / Window / Show View / Other …

[[img/12.PNG]]

Select Git / Git Repositories and click \[Ok\]

[[img/13.PNG]]


You might see a warning message such as the one
show below (even setting the environment variable did not help me to get
rid of the message, but everything seems to be working okay) – you can
confirm with \[Ok\]

[[img/14.PNG]]

You should have a new view ‘Git Repositories now’

Click on ‘Clone a Git repository’ within the new view

[[img/15.PNG]]


Now go back to <https://github.com> and to your newly
created Github repository
Under your repository description, you
can get the URI for your project. Copy the text starting with ‘git@’
(make sure that SSH is selected)

[[img/16.PNG]]

>Go back to eclipse. You can paste the URI you have
just copied into the field ‘URI’
Further select as Protocol
‘ssh’
Click \[Finish\]

[[img/17.PNG]]

If asked to select a branch, select the ‘master’ branch\
Git (in difference to subversion) allows storing a full blown
repository on your local machine rather than just a local copy of the
files. This requires to store all source you want to synchronize with
git at least twice on your local machine: one copy will be stored in the
clone of the remote git repository and another one will be stored in
your eclipse project.
Hence, when you close the git repository
from github, you should define a repository location, which lies outside
the eclipse project you want to upload:
Select one such location
and click \[Finish\]

[[img/18.PNG]]

Now you should have one ‘Git Repository’

[[img/19.PNG]]

#### 

#### Step 7: Link Eclipse Project with Github Repository

After you have created a local clone of the repository from Github, you
can link the eclipse project you would like to upload to this local
repository.
Right click your eclipse project and select Team /
Share Project …
Select ‘Git’ as Repository Type

[[img/20.PNG]]

Select under ‘Repository’ the repository you have cloned in the
previous step and click \[Finish\]

[[img/21.PNG]]

#### Step 8: Uploading Project Sources to [Github](GitHub)

After you have linked your project with the local clone of the Github
repository, you can ‘Commit’ all the source files in your existing
project to this repository. After you have committed the files to your
local repository, you can ‘Push’ them to the Github repository.

[[img/22.PNG]]

Write a beautiful commit message and click \[Commit\]

[[img/23.PNG]]

In the ‘Git Repositories’ view, open \<your repository\> /
Remotes / origin\
Right click on the second icon (with the red arrow) and select ‘Push’

[[img/24.PNG]]

You should receive the results of the push, click \[Ok\] to
confirm

[[img/25.PNG]]


You can now go to Github and your project sources
should be displayed in your repository

[[img/26.PNG]]

