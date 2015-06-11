/*code*/
INSERT INTO property (property, desc1) VALUES ('price', 'price');
INSERT INTO property (property, desc1) VALUES ('sales', 'sales');

/*detail*/
INSERT INTO detail (member_id, key, value) VALUES (230165, 'price', '3000');
INSERT INTO detail (member_id, key, value) VALUES (230166, 'price', '3000');
INSERT INTO detail (member_id, key, value) VALUES (230167, 'price', '3000');
INSERT INTO detail (member_id, key, value) VALUES (230168, 'price', '3000');
INSERT INTO detail (member_id, key, value) VALUES (230165, 'sales', '7000');

/*member*/
INSERT INTO member (member_id, name, desc) VALUES (230165, '테스트name1', '테스트desc1');
INSERT INTO member (member_id, name, desc) VALUES (230166, '테스트name2', '테스트desc2');
INSERT INTO member (member_id, name, desc) VALUES (230167, '테스트name3', '테스트desc3');
INSERT INTO member (member_id, name, desc) VALUES (230168, '테스트name4', '테스트desc4');