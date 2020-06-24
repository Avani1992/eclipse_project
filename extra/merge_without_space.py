"""Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m.
The task is to merge the two sorted arrays into one sorted array (in non-decreasing order)."""

for i in range(int(input())):
    l1=list(input().split())
    #print(len(l1))
    l2=list()
    for i in range(len(l1)):
        s=input().split()

        l2=l2+s
    print(sorted(l2))



