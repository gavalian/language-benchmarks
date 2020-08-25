# Benchmarking different languages

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

#Benchmarking Map evaluations

