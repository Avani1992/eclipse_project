"""Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j]."""

l1=[34,8,10,3,2,80,30,33,1]
""" In the given array A[1] < A[7] satisfying the required condition(A[i] <= A[j]) thus giving the maximum difference of j - i which is 6(7-1)."""
for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().split()))
    l3=list()
    difference=0
    for i in range(0,len(l1)):
        l2 = len(l1)
        while(l2>1):
            if(l1[i]>l1[l2-1]):
                l2=l2-1
            else:
                difference=(l2-1)-i
                l3.append(difference)
                break

    #print(l3)
     if (len(l3)>0):
         print(max(l3))
