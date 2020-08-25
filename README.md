# Introduction

This repository was set up to test performance of different
languages. The test contains mix of things including compiled
languages, interpreted languages and scripting laguages.
The purpose is to have a clear understanding of advantages
and diadvantaged of using one or the other language for data
analysis. 

There is prevailing opinion (belief, faith mostly held by people who never used Java) in our
collaboration that Java is 15 times slower than C++. This
might have been true 20 years ago, but Java compilers and
interpreters came a long way to optimize and speed up the code.
We wanted to test all popular languages in our field (Nuclear
Physics) to get some insight if those believes are true or false.
Hopefully this benchmarks will be useful for some users when considering one or another
language for their daily use.

*Disclaimer: I (author of this repository) do not consider myself a C++ expert.
Neither do I consider myself expert in any particular language. So before critisizing 
any of the codes in this repository, please feel free to edit/modify any of the
codes and benchmarks. Users are encouraged to form their own opinions, different from the author's.*

## Benchmarking different languages (simple calculations)

To run examples go the the appropriate folder and
type "sh run_all.sh". In order to run all the tests
you need to have CERN/ROOT installed (for CINT test),
Java JDK, and Groovy. 
Simple pi value calculations using monte carlo method:

```bash

 CINT   : pi value =  3.141633 time (sec) = 1.3480
 C++    : pi value =  3.141698 time (sec) = 2.0960
 C++    : pi value =  3.141698 time (sec) = 1.4741
 JAVA   : pi value =  3.141518 time (sec) = 1.2111
 GROOVY : pi value =  3.141373 time (sec) = 1.4722
 ('PYTHON : pi value = ', 3.14170084, '  time (sec) = ', 47.20268702507019)

```
The unexpected result of this benchmark was how slow is python for simple calculations.
The authors are aware that this is not real benchmark of pythons ability to crunch numbers
but they did not know how to use numpy for this simple example. The python benchmark is 
removed from the reults graph since it makes all other results to look very small.

![Benchmark for PI calculation](results/piBenchmarkResult.png?raw=true "PI Monte-Carlo Benchmark")

As can be seen from the plot, Java performs better for this task than C++. The C++ codes were run
once to get the time (in the future we will include in the code, running several times and
taking the average), as for Java, the code runs the calculation 3 times in the silent mode
as a warmup for JIT to kick in, then a run is made to measure excution time.

However, this is just a test of how simple computations compare in each language, the next stage
is to test ability of object orianted languages to deal with heavy object creation and destruction
and testing the standard libraries of each language.

## Benchmarking Analysis

![Benchmark for Analysis](results/anaBenchmarkResult.png?raw=true "Analysis Benchmark")



