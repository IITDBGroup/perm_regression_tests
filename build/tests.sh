#!/bin/bash
echo normal tests
cp resource/sqloptions.txt resource/options.txt 
ant -lib lib/ executeTests

echo tpch validation
cp resource/tpchoptions.txt resource/options.txt
ant -lib lib/ executeTPCHtests

