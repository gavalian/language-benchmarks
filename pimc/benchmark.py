#******************************************************
# SCRIPT is written for benchmarking pi calculation
# in python. Should run with python>3.0
#******************************************************
import random
import time
import math

nThrows,nSuccess = 0,0
then = time.time()
events=int(1e8)
for i in range(events):
    x,y = random.random(),random.random();      # Throw a dart
    nThrows +=1
    if ( (x*x + y*y) <= 1 ):  nSuccess+=1
itime = time.time() - then
print ("PYTHON : pi value = ", 4*nSuccess/float(nThrows) , "  time (sec) = ",itime)

