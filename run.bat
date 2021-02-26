set projectLocation=D:\seleniumTrg_ws\Project FW
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml   