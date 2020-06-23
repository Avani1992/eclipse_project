

"""1) reverse a string S = "hhhhjsshdjddk" without using any lib or methods. write pure logic."""

S = "hhhhjsshdjddk"
print(S[::-1]) # one line code..
#2.
s1=''
c=-1
i=0
while(c<0 and i<len(S)):
    s1=s1+S[c]
    c=c-1
    i=i+1
print(s1)

"""L =['jdkd','dsdjakj','dskdhid',78,95,344]. reverse all elements of this list
    expected o/p: ['dkdj','jkajdsd',....,59,443]"""

L =['jdkd','dsdjakj','dskdhid',78,95,344]

l1=list()

for i in L:
    if(type(i)==int):
        j=str(i)
        l1.append(int(j[::-1]))
    else:
        l1.append(i[::-1])
print(l1)

"""3) L1 = [23,45,55,66], K1= [34,23,12,9] are already sorted. Produce new list which should be sorted in ascending manner."""

L1 = [23,45,55,66]
K1= [34,23,12,9]
l=L1+K1
print(l)

for i in range(0,len(l)):
    for j in range(i+1,len(l)):
        if(l[i]>l[j]):
            c=l[j]
            l[j]=l[i]
            l[i]=c

        else:
            pass
print(l)

""" T=[] given. Produce new list [[10,20,30],[40,50,60],[70,80,90]]."""

T=list()
l1=list()
for i in range(1,10):
    if(i%3==0):
        l1.append(i*10)
        T.append(l1)
        l1=list()
    else:
        l1.append(i*10)

print(T)

"""5) T=list() given. Produce [1,2,3,4,5,6,7,8]. only one line code is allowed"""

print([i for i in range(1,9)])

"""L=[[],[23,23],[45,45],[]]. Fill "Empty" into empty elements of this list and print L."""

L=[[],[23,23],[45,45],[]]

for i in L:
    if(len(i)==0):
        i.append('Empty')

print(L)
