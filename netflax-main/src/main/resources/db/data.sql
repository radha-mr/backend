CREATE TABLE content (
  id int NOT NULL AUTO_INCREMENT,title varchar(30) DEFAULT NULL,type_id int DEFAULT NULL,category_id int DEFAULT NULL,
  summary varchar(255) NOT NULL,logo_url varchar(50) DEFAULT NULL,banner_url varchar(50) DEFAULT NULL,
  thumbnail_url varchar(50) DEFAULT NULL,status varchar(45) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY type_id (type_id),
  KEY category_id (category_id),
  CONSTRAINT category_id FOREIGN KEY (category_id) REFERENCES content_category (id) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT type_id FOREIGN KEY (type_id) REFERENCES content_type (id) ON DELETE RESTRICT ON UPDATE RESTRICT);
CREATE TABLE content_category (
  id int NOT NULL AUTO_INCREMENT,
  category varchar(30) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY category (category);
);
CREATE TABLE content_type (
  id int NOT NULL AUTO_INCREMENT,
  type varchar(30) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY type (type)
)

CREATE TABLE details_content (
  id int NOT NULL,
  content_id int DEFAULT NULL,
  video_code varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY content_id_idx (content_id),
  CONSTRAINT content_id FOREIGN KEY (content_id) REFERENCES content (id) ON DELETE RESTRICT ON UPDATE RESTRICT
);

INSERT INTO content_category VALUES (2,Action),
(3,Comedy),
(4,Drama),
(1,Horror),
(5,Other);

INSERT INTO content_type VALUES (3,documentary),
(2,movies),
(1,tv-series);
INSERT INTO details_content VALUES (1,1,ENr5nwHWnJE),
(2,10,nVYAxJXza34),(3,11,4x8ptoX4r2o),(4,12,n4uB9hdzwjc),
(5,13,6wwRatzY9-8),(6,14,d9xABu3ApIQ),(7,6,xgeY6rHJL9A),
(8,7,BvBTcySEj4A),(9,9,Uafg97czxeQ);


INSERT INTO content VALUES (1,PS,2,2,This movie is historic scene of Raja in 19 th centurary,/api/logo1.png,/api/logo1.png,/api/logo1.png,I),
(2,Roja,1,1,This movie is romantic story between local boy and girl,/api/logo.png,/api/logo.png,/api/logo.png,A),
(3,Seinfield,1,3,The show about nothing is a sitcom landmark, with comic Jerry and his three sardonic friends finding laughs in both the mundane and the ridiculous,/api/1.png,/api/1.png,/api/1.png,A),
(4,Gundam II,1,2,Amet commodo nulla facilisi nullam vehicula ipsum. Sit amet luctus venenatis lectus magna fringilla urna. Felis bibendum ut tristique et egestas quis ipsum.,/api/2.png,/api/2.png,/api/2.png,A),
(5,Uncoupled,1,3,Ipsum dolor sit amet consectetur adipiscing elit ut. ,/api/3.png,/api/3.png,/api/3.png,A),
(6,Archer,2,3,Pellentesque habitant morbi tristique senectus et netus et malesuada fames. Mauris rhoncus aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque.,/api/4.png,/api/4.png,/api/4.png,A),
(7,Ghost in the Shell SAC 2045,2,2,At erat pellentesque adipiscing commodo.,/api/5.png,/api/5.png,/api/5.png,A),
(8,Cowboy Bebop,1,2,Tincidunt eget nullam non nisi est sit.,/api/6.png,/api/6.png,/api/6.png,A),
(9,Money Heist,2,2,Sem nulla pharetra diam sit amet nisl. ','/api/7.png','/api/7.png','/api/7.png','A'),
(10,The last dance,3,5,Directed by Jason Heir','/api/22.png','/api/22.png','/api/22.png','A'),
(11,Blackfish,3,5,Ipsum dolor sit amet consectetur adipiscing elit ut.','/api/23.png','/api/23.png','/api/23.png','A'),
(12,Groundhog Day,2,4,Iaculis eu non diam phasellus vestibulum lorem sed risus.','/api/20.png','/api/20.png','/api/20.png','A'),
(13,Servant of the people,2,2,A political satire comedy about a high-school history teacher in his thirties who is unexpectedly elected President after a viral video filmed by one of his students shows him making a profane rant against government corruption','/api/16.png','/api/16.png','/api/16.png','A'),
(14,Mission Impossible Fallout,2,2,Sem nulla pharetra diam sit amet nisl. Sed risus pretium quam vulputate. Massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin','/api/17.png','/api/17.png','/api/17.png','A');
