"""Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element."""

for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().split()))
    #print(l1)
    count=0
    for i in range(len(l1)):
        for j in range(i+1,len(l1)):
            if(l1[i]+l1[j] in l1):
                count=count+1
    if(count>0):
        print(count)
    else:
        print("-1")

