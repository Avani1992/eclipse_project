"""Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements."""

for i in range(int(input())):
    n,m=input().split()
    l1=list(input().split())
    c=0
    l2=list()
    for i in range(0,len(l1)):
        c=c+1
        l2.append(l1[i])
        if(c==int(m)):
            l2=l2[::-1]
            print(l2,end=' ')
            c=0
            l2=list()