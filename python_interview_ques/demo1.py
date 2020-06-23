"""One tupple is given T=(2,3,5). Add a new item 4 into T and print."""

T=(2,3,5)
l=list(T)
l.append(4)
T=tuple(l)
print(T)

T=(2,3,5)
print(T+(4,))

"""T=("A","B","C") , Q=("D","E","F"), generate S=("AD","BE","CF") tupple."""
#
# T=("A","B","C")
# Q=("D","E","F")
# l=list()
#
# for i in range(0,len(T)):
#     l.append(T[i]+Q[i])
# s=tuple(l)
# print(s)

""" S = {3,6,7,"hello",True} given, reverse it."""
S = {3,6,False,7,"hello",True}
print(S)
#Not possible...

"""4) L=[23,45,66,77,22,21,24,22], sort it in descending order. No lib should be used."""
L=[23,45,66,77,22,21,24,22]

for i in range(0,len(L)):
    for j in range(i+1,len(L)):
        if(L[i]<L[j]):
            k=L[i]
            L[i]=L[j]
            L[j]=k

        else:
            pass
print(L)

"""5) L= [32,55,67,88,99,"hello"] copy hello to 1st and 2nd index and print L again after change."""

L= [32,55,67,88,99,"hello"]

k=L[len(L)-1] # hello
l1=list()
for i in range(0,len(L)):
    if(i==1 or i==2):
        l1.append(k)

    else:
        if(i>1 and i>2 and i<=3):
            l1.append(L[1])
            l1.append(L[2])
            l1.append(L[3])
        else:
            l1.append(L[i])
print(l1)

"""6) W = [32,32,32,32,32,33,55,55,33,32,55] , get maximum numbers of occurrence list. i.e. [32,32,32,32,32,32]"""

W = [32,32,32,32,32,33,55,55,33,32,55]
d=dict()
for i in W:
    if(i in d):
        d[i]=d[i]+1
    else:
        d[i]=1
print(d)
c=max(d.values())
l=list()
for i in range(0,c):
    l.append(list(d.keys())[list(d.values()).index(c)])
print(l)

"""7) T = ("A","A","A","b"), check all elements are same or not.  No lib should be used."""

T = ("A","A","A","b")
c=1
if(T[0]==T[-1]):
    for i in range(0,len(T)):
        if(i+1<len(T)):
            if(T[i]==T[i+1]):

                c=c+1
            else:
                break
if(c==len(T)):
    print("Same")
else:
    print("not Same")


print(len([ 'Y' for i in T if T[0]==i])==len(T))

"""8) M=[(2,3),(3,2),(3,2),(2,3)] find out whether all tuple's element sum is equal or not. i.e (2,3) so 2+3 = 5. (3,2) so 3+2=5. So 5==5."""

M=[(2,3),(3,2),(3,2),(2,3)]
l=list()
for i in M:
    for j in range(0,len(i)):
        if(j+1<len(i)):
            l.append(i[j]+i[j+1])
print(l)
print(len([ 'Y' for i in l if l[0]==i])==len(l))

c=1
for j in range(0,len(M)):
    if (j + 1 < len(M)):
        if(M[j][0]+M[j][1]==M[j+1][0]+M[j+1][1]):
            c=c+1
        else:
            break

if(c==len(M)):
    print("Same")
else:
    print("Not Same")
"""9) L = [1,2,3,4], M = [0,0,3,9]. Generate one to one pairs i.e. [(1,0),(2,0),(3,3),(4,9)]"""

L = [1, 2, 3, 4]
M = [0, 0, 3, 9]

l1=list()
for i in range(0,len(L)):
    l1.append((L[i],M[i]))

print(l1)
print([ (L[i],M[i]) for i in range(0,len(L)) ]) # one line solution.

"""given array = [1,2,3,4,5], revert it without using any library functions."""

l=[1,2,3,4,5]
print(l[::-1]) # one line solution.

""" B=["Hi", "I am", "Lazy"], make a full string from B.
     o/p S = 'Hi I am Lazy' and print"""

B=["Hi", "I am", "Lazy"]
s=' '.join(B)
print(s)

""" Given a string 'I am strong enough', prepare a list K= ["I","am","strong","enough"]"""

s='I am strong enough'
l=s.split()
print(l)

""" Li = [20,60,60,40,80,80,30,40,80,20].  Count all occurrence of a number like 20 is 2 times in the list. """

Li = [20,60,60,40,80,80,30,40,80,20]

d=dict()
for i in Li:
    if(i in d):
        d[i]=d[i]+1
    else:
        d[i]=1

print(d)