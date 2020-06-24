"""Given a sorted array with possibly duplicate elements.
The task is to find indexes of first and last occurrences of an element X in the given array."""

for i in range(int(input())):
    n=int(input())
    l1=list(map(int,input().strip().split()))
    k=int(input())
    l2=list()
    for i in range(0,len(l1)):
        if(l1[i]==k):
               l2.append(i)
    print(l2[0],l2[len(l2)-1])

m,n1=input().split()
print(m,n1)