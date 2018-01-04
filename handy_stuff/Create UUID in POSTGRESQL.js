CREATE EXTENSION "uuid-ossp";
select CAST(uuid_generate_v4() AS varchar(36))