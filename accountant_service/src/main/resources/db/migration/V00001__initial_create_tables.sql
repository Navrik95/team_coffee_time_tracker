CREATE SCHEMA IF NOT EXISTS service_accountant;

DROP TABLE IF EXISTS reports_x_trackings;
DROP TABLE IF EXISTS trackings;
DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS reports;

CREATE TABLE tasks
(
    tsk_id serial NOT NULL,
    tsk_name character varying(50) NOT NULL,
    tsk_note character varying(500) NOT NULL,
    PRIMARY KEY (tsk_id),
    UNIQUE (tsk_name)
);

CREATE TABLE trackings
(
    tr_id serial NOT NULL,
    tr_start_time bigint NOT NULL,
    tr_end_time bigint,
    tr_note character varying(200),
    tr_u_chat_id bigint NOT NULL,
    tr_task_id integer NOT NULL,
    PRIMARY KEY (tr_id),
    FOREIGN KEY (tr_task_id)
        REFERENCES tasks(tsk_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);

CREATE TABLE reports
(
    rep_id serial NOT NULL,
    rep_date bigint NOT NULL,
    rep_full_time bigint NOT NULL,
    rep_u_chat_id bigint NOT NULL,
    PRIMARY KEY (rep_id)
);

CREATE TABLE reports_x_trackings
(
    rxt_report_id integer NOT NULL,
    rxt_tracking_id integer NOT NULL,
    PRIMARY KEY (rxt_report_id, rxt_tracking_id),
    FOREIGN KEY (rxt_report_id)
        REFERENCES reports(rep_id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT,
    FOREIGN KEY (rxt_tracking_id)
        REFERENCES trackings(tr_id)
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);