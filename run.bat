set projloc=C:\Users\manoj\eclipse-workspace\Framework_test

cd %projloc%

set classpath=%projloc%\bin;%projloc%\lib\*

java org.testng.TestNG %projloc%.testng_groups.xml

pause