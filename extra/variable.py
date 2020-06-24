# how class variable are shared between same class objects.one instance variable changed by one object should be visible by another object.

class A:
    t=50 # access

    def __init__(self):
        self.r=10

obj=A()

obj.t=90
print(obj.t)

print(A.t)
A.t=80
print("A.t=",A.t)
#1.
obj1=A()
obj1.t=70
print("obj.t=",obj.t)
print("obj1.t=",obj1.t)
#2.
A.t=40
print("obj.t=",obj.t)
print("obj1.t=",obj1.t)
print("A.t=",A.t)

#3. change instance variable by one object

obj.r=50
print("obj.r=",obj.r)
print("obj1.r=",obj1.r)




# multiply
li=[5,7,8,9,3,4]

l2=[i*10 for i in li ]
print(l2)

# set
s1={"skillful","india","is","healthy","india"}


str1=" ".join(s1)
print(str1)