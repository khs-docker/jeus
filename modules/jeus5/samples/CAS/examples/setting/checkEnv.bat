@echo off
rem  checkEnv.bat : Checks environment variables,
rem                 If variables are ok, errorlevel is set to 0.
rem                 Otherwise, it's set to 1.
rem

set errorlevel=1

:BEGIN
if "%1" == "" goto SUCCESS

if not "%1" == "JEUS_HOME" goto SKIP_JEUS_HOME
if defined JEUS_HOME goto NEXT
echo ERROR: Set JEUS_HOME to the path where the JEUS is installed.
goto END
:SKIP_JEUS_HOME

if not "%1" == "JAVA_HOME" goto SKIP_JAVA_HOME
if defined JAVA_HOME goto NEXT
echo ERROR: Set JAVA_HOME to the path where the J2SE (JDK) is installed.
goto END
:SKIP_JAVA_HOME

if not "%1" == "COMBRIDGE_HOME" goto SKIP_COMBRIDGE_HOME
if defined COMBRIDGE_HOME goto NEXT
echo ERROR: Set COMBRIDGE_HOME to the path where the J2EE CAS COM Bridge is installed
goto END
:SKIP_COMBRIDGE_HOME

echo ERROR: %1 is not a supported environment variable
goto END

:NEXT
shift
goto BEGIN

:SUCCESS
set COMBRIDGE_EX=%COMBRIDGE_HOME%\doc\guide\examples
set errorlevel=0

:END
