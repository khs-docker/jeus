@echo off

CALL jeus-example.properties.cmd

appletviewer  -J-Djava.security.policy=policy  -J-Djava.naming.factory.initial=jeus.jndi.JEUSContextFactory -J-Djeus.baseport=%JEUS_BASEPORT% -J-Djeus.tm.version=client AppletClient.html

