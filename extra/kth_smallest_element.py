"""Given an array arr[] and a number K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct."""

for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().split()))
    l2=sorted(l1)
    k=int(input())
    print(l2[k-1])