INSERT INTO roles(r_name)
VALUES ('student'),
        ('lead'),
        ('lecturer'),
        ('admin');

INSERT INTO teams(t_name, t_color)
VALUES ('team coffee', 'yellow'),
       ('team Philip', 'purple'),
       ('team third', 'red');

INSERT INTO users(u_chat_id, u_nickname, u_name, u_surname, u_teams_id, u_roles_id)
VALUES (1, 'kruz uzdyak', 'Evgeny', 'Volodko', 1, 2),
       (2, 'Cyril', 'Kirill', 'Ananyev', 1, 1),
       (3, 'Philip', 'Philip', 'Raevsky', 2, 2);