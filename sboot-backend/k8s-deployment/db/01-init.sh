#!/bin/bash
set -e
export PGPASSWORD=$POSTGRES_PASSWORD;
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
  CREATE USER $APP_DB_USER WITH PASSWORD '$APP_DB_PASS';
  CREATE DATABASE $APP_DB_NAME;
  GRANT ALL PRIVILEGES ON DATABASE $APP_DB_NAME TO $APP_DB_USER;
  \connect $APP_DB_NAME $APP_DB_USER
  BEGIN;
    CREATE TABLE IF NOT EXISTS public.persona
	(persona_id serial NOT NULL, nombre varchar(100) NULL, apellido varchar(100) NULL, direccion varchar(150) NULL, CONSTRAINT pk_persona PRIMARY KEY (persona_id));
    alter sequence persona_persona_id_seq rename to persona_seq;
    insert into public.persona (nombre, apellido, direccion) values ('juan', 'lopez', 'Av. brasil 123'); 
    insert into public.persona (nombre, apellido, direccion) values ('maria', 'perez', 'Av. chile 123'); 
    insert into public.persona (nombre, apellido, direccion) values ('carlos', 'castro', 'Av. venezuela 123');
  COMMIT;
EOSQL
