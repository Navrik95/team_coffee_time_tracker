CREATE SCHEMA IF NOT EXISTS service_command;

DROP TABLE IF EXISTS roles;
CREATE TABLE roles
(
    r_id serial NOT NULL,
    r_name character varying(50) NOT NULL,
    PRIMARY KEY (r_id),
    UNIQUE (r_name)
);

DROP TABLE IF EXISTS teams;
CREATE TABLE teams
(
    t_id serial NOT NULL,
    t_name character varying(50) NOT NULL,
    t_color character varying(50) NOT NULL,
    PRIMARY KEY (t_id),
    UNIQUE (t_name, t_color)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    u_chat_id bigint NOT NULL,
    u_nickname character varying(50) NOT NULL,
    u_name character varying(50) NOT NULL,
    u_surname character varying(50) NOT NULL,
    u_teams_id integer,
    u_roles_id integer NOT NULL,
    PRIMARY KEY (u_chat_id),
    UNIQUE (u_nickname),
    FOREIGN KEY (u_teams_id)
        REFERENCES teams(t_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT,
    FOREIGN KEY (u_roles_id)
        REFERENCES roles(r_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);