INSERT INTO user(email, username, password) VALUES ('daniel@gmail.com','daniel','haslo');
INSERT INTO user(email, username, password) VALUES ('kamil@gmail.com','kamil','haslo');
INSERT INTO user(email, username, password) VALUES ('grzesiek@gmail.com','grzesiek','haslo');

INSERT INTO follower(follower_id, followee_id) VALUES (1,3);
INSERT INTO follower(follower_id, followee_id) VALUES (2,3);
INSERT INTO follower(follower_id, followee_id) VALUES (3,2);
INSERT INTO follower(follower_id, followee_id) VALUES (3,1);

INSERT INTO message(content, poster_id, date) VALUES ('test message 1', 1, TIMESTAMP '2019-04-06 15:11:01');
INSERT INTO message(content, poster_id, date) VALUES ('test message 2', 2, TIMESTAMP '2019-04-06 15:14:01');
INSERT INTO message(content, poster_id, date) VALUES ('test message 3', 2, TIMESTAMP '2019-04-06 15:16:01');