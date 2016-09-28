keytool -genkey -alias JEUS_SERVER -keyalg rsa -keypass key_password -keystore server-keystore.jks -storepass keystore_password 
call keytool -genkey -alias JEUS_CLIENT -keyalg rsa -keypass key_password -keystore client-keystore.jks -storepass keystore_password 
call keytool -export -alias JEUS_SERVER -storepass keystore_password -keystore server-keystore.jks -file jeus_server.cert
call keytool -export -alias JEUS_CLIENT -storepass keystore_password -keystore client-keystore.jks -file jeus_client.cert
call keytool -import -file jeus_server.cert -keystore client-keystore.jks -storepass keystore_password -alias JEUS_SERVER
call keytool -import -file jeus_client.cert -keystore server-keystore.jks -storepass keystore_password -alias JEUS_CLIENT
del jeus_server.cert
del jeus_client.cert