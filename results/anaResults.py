import numpy as np
import matplotlib.pyplot as plt

xaxis = ["C++","C++O2","Java","Groovy"]
data2 = [42.8, 10.22, 11.29, 27.0]
data1 = [37.8, 5.54, 4.78, 17.5]
#plt.ylim(0.0, 50)
plt.xlabel("Languages")
plt.ylabel("Execution Time (seconds)")
plt.bar(xaxis, data1)
plt.bar(xaxis, data2, bottom=data1)
plt.show()
