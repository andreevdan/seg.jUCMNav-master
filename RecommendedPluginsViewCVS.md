# Recommended Plugins for ViewCVS

ViewCVS is fairly limited in what it can do, but we can improve it with the following applications:

 -   Enscript can add syntax highlighting when we look at the source online. Win32 version can be found here: http://gnuwin32.sourceforge.net/packages/enscript.htm
 -   Don't forget to set use_enscript to 1 and enscript_path in the config file
 -   Cvsgraph can add version graph. Usefull if the code is splitted between multiple branches. Example. Win32 version can be found here: http://www.akhphd.au.dk/~bertho/cvsgraph/
 -   Don't forget to set use_cvsgraph to 1 and cvsgraph_path in the config file.
 -   Also, assuming that tar and gzip are in the path, ViewCVS can create archive of the repository that are easy to download. Usefull if you can't access the CVS server (such as in the labs at SITE). To enable that feature, set allow_tar to 1 in the config file. 

-- Olivier Clift Noel? - 31 Jan 2005 