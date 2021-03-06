import numpy as np
import matplotlib.pyplot as plt

xaxis = ["CINT","C++","C++O2","Fortran","Java","Groovy"]
data1 = [1.348, 2.096, 1.474, 1.65, 0, 1.472]
data2 = [0, 0, 0, 0.0, 1.211, 0]
plt.figure(figsize=(9,4))
plt.ylim(0.0, 2.4)
plt.xlabel("Languages")
plt.ylabel("Execution Time (seconds)")
plt.bar(xaxis, data1)
plt.bar(xaxis, data2, bottom=data1)
plt.show()
