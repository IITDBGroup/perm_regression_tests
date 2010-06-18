DROP DATABASE integration;

CREATE DATABASE integration;

CREATE TABLE department (
	did int8,
	location TEXT,
	PRIMARY KEY (did)
);

CREATE TABLE employee (
	eid int8,
	name TEXT,
	did int8,
	PRIMARY KEY (eid),
	FOREIGN KEY (did) REFERENCES department (did)
);

CREATE TABLE manager (
	mid int8,
	name TEXT,
	did int8,
	PRIMARY KEY (mid),
	FOREIGN KEY (did) REFERENCES department (did)
);

INSERT INTO department VALUES (1, 'Zuerich');
INSERT INTO department VALUES (2, 'Basel');
INSERT INTO department VALUES (3, 'Luzern');
INSERT INTO department VALUES (4, 'Lugano');

INSERT INTO manager VALUES (1, 'Nina', 1);
INSERT INTO manager VALUES (2, 'Sopie', 3);
INSERT INTO manager VALUES (3, 'Igor', 2);

INSERT INTO employee VALUES (1, 'Peter', 1);
INSERT INTO employee VALUES (2, 'Paul', 2);
INSERT INTO employee VALUES (3, 'Helga', 1);

CREATE VIEW persons AS
	SELECT pid, name, location
	FROM
		(SELECT 'SK_1' || e.name || d.location AS pid, e.name, d.location, 'M1' AS mapsource
		FROM employee e, department d
		WHERE e.dId = d.dId) AS m1
UNION
	SELECT pid, name, location
	FROM 
		(SELECT 'SK_2' || m.name || d.location AS pid, m.name, d.location, 'M3' AS mapsource
		FROM manager m, department d
		WHERE m.dId = d.dId) AS m3
UNION
	SELECT pid, name, location 
	FROM
		(SELECT 'SK_3' || d.location AS pid, 'SK_4' || d.location AS name, d.location, 'M2' AS mapsource
		FROM department d) AS m2;

CREATE VIEW personsalt AS
	SELECT pid, name, location
	FROM
		(SELECT 'SK_1' || e.name || d.location AS pid, e.name, d.location, mapsource
		FROM employee e, department d, (SELECT 'M1' AS mapsource) PROVENANCE (mapsource) AS ms1
		WHERE e.dId = d.dId) AS m1
UNION
	SELECT pid, name, location
	FROM 
		(SELECT 'SK_2' || m.name || d.location AS pid, m.name, d.location, mapsource
		FROM manager m, department d, (SELECT 'M3' AS mapsource) PROVENANCE (mapsource) AS ms2
		WHERE m.dId = d.dId) AS m3
UNION
	SELECT pid, name, location 
	FROM
		(SELECT 'SK_3' || d.location AS pid, 'SK_4' || d.location AS name, d.location, mapsource
		FROM department d, (SELECT 'M2' AS mapsource) PROVENANCE (mapsource) AS ms3) AS m2;


CREATE VIEW personsalt2 AS
	SELECT 'SK_1' || e.name || d.location AS pid, e.name, d.location
	FROM employee e, department d, (SELECT 'M1' AS mapsource) PROVENANCE (mapsource) AS ms1
	WHERE e.dId = d.dId
UNION
	SELECT 'SK_2' || m.name || d.location AS pid, m.name, d.location
	FROM manager m, department d, (SELECT 'M3' AS mapsource) PROVENANCE (mapsource) AS ms2
	WHERE m.dId = d.dId
UNION
	SELECT 'SK_3' || d.location AS pid, 'SK_4' || d.location AS name, d.location
	FROM department d, (SELECT 'M2' AS mapsource) PROVENANCE (mapsource) AS ms3;
		
-- SELECT PROVENANCE * FROM persons;

-- SELECT PROVENANCE * FROM 
	-- (SELECT pid, name, location
	-- FROM
		-- (SELECT 'SK_1' || e.name || d.location AS pid, e.name, d.location, 'M1' AS mapsource
		-- FROM employee e, department d
		-- WHERE e.dId = d.dId) AS m1
-- UNION
	-- SELECT pid, name, location
	-- FROM 
		-- (SELECT 'SK_2' || m.name || d.location AS pid, m.name, d.location, 'M3' AS mapsource
		-- FROM manager m, department d
		-- WHERE m.dId = d.dId) AS m3
-- UNION
	-- SELECT pid, name, location 
	-- FROM
		-- (SELECT 'SK_3' || d.location AS pid, 'SK_4' || d.location AS name, d.location, 'M2' AS mapsource
		-- FROM department d) AS m2) AS m;
