@echo off
rem  createcomAccountTypeLibs.bat : Creates type libraries for comaccount Bean's home and remote interfaces
rem
rem  Usage: createcomAccountTypeLibs
rem
rem

rem set COMBRIDGE_HOME=C:\j2ee-cas-com-bridge
rem set JAVA_HOME=C:\jdk1.4
rem set JEUS_HOME=C:\jeus

call checkEnv.bat COMBRIDGE_HOME JAVA_HOME JEUS_HOME

if not %errorlevel% == 0  goto END

setlocal

set PACKAGER=%COMBRIDGE_HOME%\bin\gentypelib.exe
set CLASSPATH=%JEUS_HOME%\lib\system\jeus.jar;%COMBRIDGE_EX%\lib;%EJB_HOME%;%JEUS_HOME%\samples\CAS\examples\classes\deployexample\build

"%PACKAGER%" -n java.util.Collection -o "%COMBRIDGE_EX%\typelib"
"%PACKAGER%" -n java.util.Iterator -o "%COMBRIDGE_EX%\typelib"
"%PACKAGER%" -n comaccount.AccountHome -o "%COMBRIDGE_EX%\typelib"
"%PACKAGER%" -n comaccount.Account -o "%COMBRIDGE_EX%\typelib"

endlocal


:END

