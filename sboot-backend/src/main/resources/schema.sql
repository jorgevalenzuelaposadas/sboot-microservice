CREATE TABLE IF NOT EXISTS public.persona (
	persona_id serial NOT NULL, 
	nombre varchar(100) NULL, 
	apellido varchar(100) NULL, 
	direccion varchar(150) NULL, 
	CONSTRAINT pk_persona PRIMARY KEY (persona_id));


CREATE SEQUENCE IF NOT EXISTS persona_seq;
