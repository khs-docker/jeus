/*
	
	This sql script is for initializing the test database used by EJB samples.
*/

	drop table PRODUCT_BASBMP if exists;
 	create table PRODUCT_BASBMP(ID VARCHAR(255) NOT NULL PRIMARY KEY,NAME VARCHAR(255),PRICE DECIMAL(8,2));



	
