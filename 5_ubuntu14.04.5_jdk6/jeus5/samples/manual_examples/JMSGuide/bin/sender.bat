@setlocal
@set SRCDIR=..\src
@set CLASSESDIR=..\classes
@set JEUS_HOME=%JEUS_HOME%

@set CLASSPATH=..;.;..\classes;%JEUS_HOME%\lib\system\jeus.jar;%JEUS_HOME%\lib\system\jmxri.jar;%JEUS_HOME%\lib\system\jmxremote.jar;%JEUS_HOME%\lib\system\jmxtools.jar;%JEUS_HOME%\lib\system\jaxb-impl.jar;%JEUS_HOME%\lib\system\jaxb-libs.jar;%JEUS_HOME%\lib\system\jaxb-api.jar;%JEUS_HOME%\lib\system\relaxngDatatype.jar;%JEUS_HOME%\lib\system\xsdlib.jar;%JEUS_HOME%\lib\system\xml_resource.jar;%JEUS_HOME%\lib\system\jxml-impl.jar;%JEUS_HOME%\lib\system\jeusutil.jar;%JEUS_HOME%\lib\system\jeusjaxb.jar;%JEUS_HOME%\lib\system\jms.jar;.;%CLASSESDIR%;%CLASSPATH%

java -Djava.naming.factory.initial=jeus.jndi.JEUSContextFactory -Djeus.baseport=%JEUS_BASEPORT% sample.manual.sender

@endlocal
