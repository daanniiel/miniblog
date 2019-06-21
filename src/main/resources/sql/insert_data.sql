INSERT INTO user(email, username, password) VALUES ('daniel@gmail.com','daniel','haslo');
INSERT INTO user(email, username, password) VALUES ('kamil@gmail.com','kamil','haslo');
INSERT INTO user(email, username, password) VALUES ('grzesiek@gmail.com','grzesiek','haslo');

INSERT INTO follower(follower_id, followee_id) VALUES (100,101);
INSERT INTO follower(follower_id, followee_id) VALUES (100,102);
INSERT INTO follower(follower_id, followee_id) VALUES (101,100);
INSERT INTO follower(follower_id, followee_id) VALUES (102,101);

INSERT INTO message(content, poster_id, date) VALUES ('test message 1', 100, TIMESTAMP '2019-04-06 15:11:01');
INSERT INTO message(content, poster_id, date) VALUES ('test message 2', 101, TIMESTAMP '2019-04-06 15:14:01');
INSERT INTO message(content, poster_id, date) VALUES ('test message 3', 102, TIMESTAMP '2019-04-06 15:16:01');