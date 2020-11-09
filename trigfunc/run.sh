#!/bin/sh

javac BenchmarkTrig.java >& /dev/null
java -cp . BenchmarkTrig

rm -rf *class a.out*

