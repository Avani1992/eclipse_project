"""Given an array arr[] of N non-negative integers representing height of blocks at index i as Ai where the width of each block is 1.
Compute how much water can be trapped in between blocks after raining."""

for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().split()))
    water=0
    k=0
    for i in range(0,len(l1)):
        k=0
        for j in range(i+1,len(l1)):
            if(l1[i]<l1[j]):
                k=(l1[j]-l1[i])

            else:
                water=water+k

                break
        #print(k)


    print(water)