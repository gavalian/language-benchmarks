# Introduction

This repository was set up to test performance of different
languages. The test contains mix of things including compiled
languages, interpreted languages and scripting laguages.
The purpose is to have a clear understanding of advantages
and diadvantaged of using one or the other language for data
analysis. There is prevailing opinion (belief, faith) in our
collaboration that Java is 15 times slower than C++. This
might have been true 20 years ago, but Java compilers and
interpreters came a long way to optimize and speed up the code.
We wanted to test all popular solutions in our field (Nuclear
Physics) to get som insight if those believes are true or false.

*Disclaimer: I (author of this repository) do not consider myself a C++ expert.
Neither I consider myself expert in any particular language. So before critisizing 
any of the codes in this repository, please feel free to edit/modify any of the
codes and benchmarks.*

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

## Benchmarking Map evaluations

