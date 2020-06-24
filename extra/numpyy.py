import numpy as np

arr=np.arange(10)
print(arr)  # [0 1 2 3 4 5 6 7 8 9]
print(type(arr))  # <class 'numpy.ndarray'>

arr1=arr.reshape(5,2).shape
print(arr1) # (5,2)

max=arr.max()
print("Max=",max) # 9
min=arr.min()
print("Min=",min) # 0

arg1=np.random.randint(0,20,10)
print("Random=",arg1)
minarg=arg1.argmin()
print("Min arg=",minarg)
maxarg=arg1.argmax()
print("Max arg=",maxarg)

matrix=np.zeros((5,5))
print("Matrix=",matrix)

identitymatrix=np.eye(4)
print("Matrix=",identitymatrix)

arr[0:5]=100
print(arr)  # [100 100 100 100 100   5   6   7   8   9]  broadcasting...

print(np.linspace(0,10,3)) # [ 0.  5. 10.]

arr2=np.arange()
print(arr2)