"""Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2."""
import math
for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().split()))
    l2=list()
    c=0
    for i in l1:
        l2.append(i*i)
    #print(l2)
    for i in range(0,len(l2)):
        for j in range(i+1,len(l2)):
            if(l2[i]+l2[j] in l2):
                c=c+1


    if(c>0):
        print("Yes")
    else:
        print("No")