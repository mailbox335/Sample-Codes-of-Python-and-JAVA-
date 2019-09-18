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
    














'''
print("!******************************!")


if __name__ == '__main__':
    print('Hello World')
    
    
    
print(np.s_[2::])
print(np.s_[:2:])
print(np.s_[::2])


print(metrix.shape)
(row, column) = metrix.shape
print(row)
print(column)

a = np.delete(metrix, np.s_[column-1::], 1)
print(a)

b = np.delete(metrix, np.s_[:column-1:], 1)
print(b)

c = np.delete(metrix, np.s_[::column], 1)
print(c)
print("!******************************!")

mtrix = metrix[0:1]

print(metrix)

metrix = np.delete(metrix, 1, 1)

print(metrix)

print(metrix[0,1])
print(metrix[:,2:3])

for mx in np.nditer(metrix, flags=['external_loop']):
    print(mx, end=" ")

    
print(len(metrix[0]))



print("!******************************!")

for mx in metrix:
    mx=mx/2
    metrix=mx
    print(len(mx))
    print(mx)


print()
print(metrix)

print()
print("!******************************!")
print()

print(metrix)
'''