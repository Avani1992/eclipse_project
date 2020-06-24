# def double(function):
# 	def wrapper(a,b):
#             if(a!=0 and b!=0):
#                 return function(a,b)
#             else:
#                 print("Not possible")
# 	return wrapper
#
# @double
# def mul(x,y):
# 	return x * y
#
# print (mul(2,0))
#--------------------------------------------
# num = 1
# def func():
#     num = 1
#     num = num + 3
#     print(num)
#
# func()
# print(num)
# #---------------------------------------------
# def f():
#     pass
# print(type(f()))
# print('abc')
# #----------------------------------------
# tinytuple = (123, 'techbeamers')
# print (tinytuple * 2)
# #-----------------------------------------------
# l1=[1,2,3]
# l1.reverse()
# print(l1)
# #---------------------------------------------
# a = [1,2,3,None,(),[],]
# print (len(a))
# #------------------------------------------------
# for n in range(1,6,1):
#     print(str(n)*5)
# #--------------------------------------------------------
# class A:
#     def __init__(self):
#         self.a = 1
#         self.__b = 1
#
#     def getY(self):
#         return self.__b
# obj = A()
# obj.a = 45
# print(obj.a)
# #----------------------------------------------------
# num1, num2 = eval(input("Enter two numbers: "))
# #-----------------------------------------------------
# def test():
#  try:
#   return 1
#  finally:
#   return 2
# result = test()
# print(result)
#--------------------------------------
# mylist=['a', 'aa', 'aaa', 'b', 'bb', 'bbb']
# print(mylist[:-1])
# #--------------------------------
# ints = set([1,1,2,3,3,3,4])
# print(len(ints))
# #------------------------------------
# x = 1
# print(++++x)
# #-----------------------------
# var1 = 4.5
# var2 = 2
# print(var1//var2)
# #-----------------------------------
# for i in range(1, 6):
#  print(i, i, i, i, i)
#  #---------------------------------
# import random
#
# mylist = [10, 20, 30]
# random.shuffle(mylist)
# print(mylist)
#--------------------------------------
# class A:
#     def __str__(self):
#         return"A"
# class B(A):
#     def __init__(self):
#         super().__init__()
# class C(B):
#     def __init__(self):
#         super().__init__()
# def main():
#     b = B()
#     a = A()
#     c = C()
#     print(a, b, c)
# main()
#--------------------------------------------
# number=202
# even = True if number % 2 == 0 else False
# print ("Code2: even := {}".format(even))
# even = number % 2 == 0
# print ("Code3: even := {}".format(even))
#------------------------------------------------
# list1 = [1, 3]
# list2 = list1
# list1[0] = 4
# print(list2)
#--------------------------------------
#class parent:
#     def __init__(self, param):
#         self.v1 = param
#
# class child(parent):
#     def __init__(self, param):
#         self.v2 = param
#
# obj = child(11)
# print ("%d %d" % (obj.v1, obj.v2))
#-------------------------------------------
# counter = 1
#
#
# def doLotsOfStuff():
#     global counter
#
#     for i in (1, 2, 3):
#         counter += 1
#
#
# doLotsOfStuff()
#
# print(counter)
#---------------------------------
# x, y = eval(input("Enter two numbers: "))
# print(x)
# print(y)
#---------------------------------
# str='example'
# print  (str.center(2,'*'))
# print ('Tech' + 'Beamers')
# str='Hello World'
# print (str.find('o'))
#------------------------------------
# str='Tech Beamers'
# str[4]='-'
# print (str)
#---------------------------------
# str='PYTHON\nString\nConcepts'
# print  (str.splitlines())
# #--------------------------------
# str='Welcome\tTo\tPython\tProgramming'
# print  (str.expandtabs(4))
# #---------------------------------
# print  (u'2.15'.isnumeric())
# #----------------------------------
# str='abcdefcdyz'
# print  (str.partition('cd'))
#----------------------------------
# class Person:
#     def __init__(self, id):
#         self.id = id
#
# sam = Person(100)
#
# sam.__dict__['age'] = 40
# print(sam.age)
# print((sam.__dict__))
# print (sam.age + len(sam.__dict__))
#---------------------------------------------------
nums = range(2, 50)
for i in range(2, 8):
    nums = list(filter(lambda x: x == i or x % i, nums))
print (nums)