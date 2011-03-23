/******************************************************************************
*******************************************************************************
*******************************************************************************
******* 	Table Defs     ************************************************
*******************************************************************************
*******************************************************************************
******************************************************************************/

DROP TABLE IF EXISTS r CASCADE;
DROP TABLE IF EXISTS s CASCADE;
DROP TABLE IF EXISTS t CASCADE;
DROP TABLE IF EXISTS u CASCADE;

CREATE TABLE r (
	a int
) WITH OIDS;

COPY r FROM '/Users/lord_pretzel/Documents/workspace/SF_PermTester/resource/testdb/wherecs_r.cpy' WITH OIDS CSV DELIMITER '|';

CREATE TABLE s (
	b int
) WITH OIDS;

COPY s FROM '/Users/lord_pretzel/Documents/workspace/SF_PermTester/resource/testdb/wherecs_s.cpy' WITH OIDS CSV DELIMITER '|';

CREATE TABLE t (
	c int
) WITH OIDS;

COPY t FROM '/Users/lord_pretzel/Documents/workspace/SF_PermTester/resource/testdb/wherecs_t.cpy' WITH OIDS CSV DELIMITER '|';

CREATE TABLE u (
	d text,
	e text
) WITH OIDS;

COPY u FROM '/Users/lord_pretzel/Documents/workspace/SF_PermTester/resource/testdb/wherecs_u.cpy' WITH OIDS CSV DELIMITER '|';