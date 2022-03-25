INSERT INTO tasks (tsk_name, tsk_note)
VALUES ('array list', 'create own implementation of array list'),
       ('linux x jenkins', 'install jenkins on pc and configure jenkins'),
       ('meet postgres', 'create simple CRUD servlet app which will interact with postgres'),
       ('REST vs SOAP', 'create app using REST and SOAP');

INSERT INTO trackings (tr_start_time, tr_end_time, tr_note, tr_u_chat_id, tr_task_id)
VALUES (1646156264000, 1646159864000, 'all done', 1, 1),
       (1646156264000, 1646159964000, 'done 1/3', 2, 1),
       (1646156264000, 1646158864000, 'text', 3, 1),
       (1646228264000, 1646239064000, 'my note', 1, 2),
       (1646228264000, 1646249064000, 'done', 2, 2),
       (1646228264000, 1646245064000, 'all fine', 3, 2);

INSERT INTO reports (rep_date, rep_full_time, rep_u_chat_id)
VALUES (1646159864000, 3600000, 1),
       (1646156264000, 3700000, 2),
       (1646245064000, 19400000, 3);

INSERT INTO reports_x_trackings (rxt_report_id, rxt_tracking_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (3, 6);