-----------------------------------------------------
LICENSE
-----------------------------------------------------

-----------------------------------------------------
DESCRIPTION
-----------------------------------------------------

PermTester is a Java JUnit (DBUnit) TestSuite that fulfills the purpose of the
 PostgreSQL regression tests for the Perm extensions. It's basically a generator for
 Perm Testcases. Testcases are defined in Java XML Property files
 and stored under resource/sql. PermTester reads these files and
 automatically generates JUnits tests from these files and organizes
 them into Suites according to the names of the XML files. Each XML file
 contains Properties if the form "qNUMBER.query" that contains an SQL 
 query with an associated "qNUMBER.result" that contains the expected 
 query result as outputted by psql. Each such combination of query + result
 is turned into a single test case which executes the query against 
 an test database and compares the actual result against the expected one). 
 PermTester comes with a SQL-script in resource/testdb/testdb.sql that
 can be used to create the test database. The connection options are
 read from "resource/options.txt". Adapt the options in this file to your local Perm 
 server parameters (e.g. username, name of the test database, ...). The grouping 
 of tests into suites is determined by the names of the test XML files. 
 
-----------------------------------------------------
INSTALL
----------------------------------------------------- 

Prerequisites
-----------------------------------------------------
You need the following packages to be able to build PermTester:

-ANT

Install Process
-----------------------------------------------------
1. cd into the main PermTester directory

2. run "ant" to generate and compile the test cases 

3. Adapt the connection parameters in resource/options.txt to your
	server settings
	
4. load the testdatabase from resource/testdb/testdb.sql. Either use ant to 
	handle this step (a) or do it manually (b)

	a) run "ant loadDBScript"

	b) You can use the standard commandline client of perm/postgres (psql). 
 		-Start the Perm server
 		-Start the psql client
 		-Create a new database for the tests or connect to an existing one.
 		-use "\i SCRIPT" to executes from the testdbscript  

Run Tests
-----------------------------------------------------
There are three possible ways of running the tests:

1) run "ant startServerAndRunTests"
	This starts the Perm server, runs the tests, and kill the Perm Server 

2) start the perm server manually and use "ant runTests" to run the tests. 

3) Run it from a IDE that supports JUnit (e.g., Eclipse). In this case you
	also have to start the Perm server manually.

This aforementioned commands run the complete suite of tests. To run a 
specific sub suite or single jUnit test class set the "TestName" in the ant call.
E.g.:

	ant -DTestName=AllTests_1 startServerAndRunTests
	
See the "Create your own Tests" section below for details of which tests
are generated and how they are organized in suites (JUnit term for groups
of tests).	

-----------------------------------------------------
TEST CASE GENERATION AND ADDING NEW TESTS
----------------------------------------------------- 

Test Case Generation and File Format
-----------------------------------------------------
The PermTester generates the JUnit test cases and suites automatically
from a set of Java XML Properties files found in directory "resource/sql" (directory
can be set as "Path" in the options.txt file). Java properties files store simple key-value
combinations. A key value pair is represented as an "<entry>" element in the XML property file.
The "key" attribute stores the key of the entry and the content of the element stores the
value. E.g.:

<entry key="key1">value1</entry>

The test case descriptions contain a list of test queries and the expected results for these
queries as entries with keys "qNUM.query" and "qNUM.result". As an example consider the 
property pair presented below:

<entry key="q1.query">
SELECT PROVENANCE sum(i) * null FROM r;
</entry>
<entry key="q1.result">
 ?column? | prov_public_r_i 
----------+-----------------
          |               1
          |               2
          |               3
</entry> 

The expected results use the same representation as the psql command line client which
makes it easy to generate a new test case by simply copying an query output from the psql
client. The PermTester parses such an test case description file (TDF) and generates a JUnit 
test case (Java class) for this file that contains a test method for each of the query-result
pairs in the TDF. If these JUnit tests is executed all the test  queries are send to the
perm server and the results are compared to the expected results. 

In addition to the generation of single JUnit tests cases from TDFs, the PermTester also (1) hierarchically
groups these tests cases into suites and (2) duplicates test cases for different perm server settings. 

	(1) Suites are combinations of JUnit tests that can be executed to run all the test cases 
	contained in the suites. The Perm Tester generates one top level suite called AllTestsOptions
	and adds all generated test cases to this suite. A hierarchy of additional suites is added
	below AllTestsOptions based on the names of the TDF files. The name is split into parts at "."
	characters and a new suite is generated for each name part. E.g., for a "simple.sql.perm.xml" TDF
	the additional suites "simple" and "sql" are generated. "perm" is used as the name for the test
	case generated from "simple.sql.perm.xml". The test case "perm" is added to suite "sql" which in
	turn is added to suite "simple" which is a child of the top level suite. Therefore, the TDF names
	can be used to hierarchically group tests into suites which can be executed to run only a certain 
	subset of the test cases. As an example have a look at the hierarchy defined for nested subquery
	tests (sublinks).
		
	(2) For some types of queries there are several possible ways to rewrite them to generate their
	provenance. Which types of rewrites are considered by the system is determined by setting
	configuration parameters of the perm server. A certain error may be caused by an error in one
	of the rewrite methods. To be able to detect errors that only show if a specific rewrite method
	is choosen the PermTester duplicates the test cases for different settings of the configuration
	parameters. The resource/sql/settings.xml defines a list of settings of the server configuration
	parameters. All test cases are duplicated for each setting given in settings.xml. The names of the
	test cases are generated by appending an number for the setting to the test case (or suite) name.
	If one of these settings specific test cases is executed the configuration parameters are
	set beforehand to the values that are specified in settings.xml for this setting.


Create your own Tests
-----------------------------------------------------
Either add a new "qNUMBER.query" and "qNUMBER.result" pair to an
existing XML properties file (ensure that NUMBER is the next free
integer number in this file) and run ant again to re-generate
the JUnit Test Cases. E.g., you could run a query in psql and copy
it and its result to the property file. 

The second option is to create a new XML property file. Be aware 
that the file name is used to determine the Test Suites hierarchy
in which the new tests are added. E.g., if the file is named 
"simple.sql.perm.xml", then the new tests cases will be added to
Test suite "perm" which is a child of test suite "sql" which in
turn is a child of test suite "simple". Test suites that do not
exists are created automatically by the ant build process.

If new relations are needed for your test case, then modify the 
testdb script to create them and run it again. Note that you should
add the DDL statements in such a way that the script can be run 
on an existing test database without causing problem. For instance,
before you create a new relation place a command that checks if this
relation already exists and if so drops it. Check out the existing
testdb.sql script to see how this works.







