DROP TABLE building;

CREATE TABLE building (
  id varchar(6),
  building_name varchar(96), 
  building_detail varchar(255)
);

DROP TABLE room;

CREATE TABLE room (
  id varchar(16),
  room_name varchar(30),
  room_detail varchar(128)
);