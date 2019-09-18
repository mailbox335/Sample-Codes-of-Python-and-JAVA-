'''
Created on ----年-月--日

@author: Admin
'''

    
print("Using the built-in routine of NumPy to solve the 3x4 metrix!")

import numpy as np

metrix=np.array([[-2,2,3,4],
                 [2,3,4,5],
                 [3,4,5,6]])

print(metrix)
print("!******************************!")

(row, column) = metrix.shape
a = np.delete(metrix, np.s_[column-1::], 1)
b = np.delete(metrix, np.s_[:column-1:], 1)
x = np.linalg.solve(a, b)
    
for i, ans in enumerate(x):
    print( 'x' + str(i),'=',  ans)
    













