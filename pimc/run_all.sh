#!/bin/sh

g++ -o a.out benchmark.cc -std=c++11 >& /dev/null
g++ -o a.out.o2 -O2 benchmark.cc -std=c++11 >& /dev/null
javac Benchmark.java >& /dev/null

root -l -b -q benchmark.C
./a.out
./a.out.o2
java -cp . Benchmark
groovy benchmark.groovy
python3 benchmark.py

rm -rf *class a.out*

