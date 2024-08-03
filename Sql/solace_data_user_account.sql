create table if not exists solace_data_user_account(
solace_data_owner Integer not null,
solace_data_name varchar(255) null,
first_name varchar(255) null,
last_name varchar(255) null,
email_address varchar(255) null,
locale Integer null,
country_code varchar(255) null,
is_privileged varchar(255) null,
last_login varchar(255) null,
contact_id Integer null,
addres_id varchar(255) null,
user_grp varchar(255) null,
request_type varchar(255) null,
constraint solace_data_user_account_pk primary key(solace_data_owner));