drop table comaccount;

create table comaccount  
(comaccount_id varchar(3) constraint pk_comaccount primary key,  
first_name varchar(24),  
last_name varchar(24),  
type varchar(24),  
balance double precision,
credit_limit double precision);

exit;
