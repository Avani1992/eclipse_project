"""Given an unsorted array of size N. Find the first element in array such that all of its left elements are
smaller and all right elements to it are greater than it.
"""

for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().strip().split()))
    left=l1[0]
    for i in range(1,len(l1)):
