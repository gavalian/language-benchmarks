import numpy as np
import matplotlib.pyplot as plt

xaxis = ["C++","C++O2","Java","JShell","Groovy"]
#data2 = [42.8, 10.22, 11.29, 27.0]
data2 = [5, 4.68, 6.50, 8.42, 9.5]
data1 = [37.8, 5.54, 4.78, 5.33, 17.5]
#plt.ylim(0.0, 50)
plt.figure(figsize=(9,4))
plt.xlabel("Languages")
plt.ylabel("Execution Time (seconds)")
plt.bar(xaxis, data1, label='analysis')
plt.bar(xaxis, data2, bottom=data1, label='I/O')
plt.legend(loc="upper right")
plt.show()
