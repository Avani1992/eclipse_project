"""Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S."""

sum=15
l1=[1,2,3,4,5,6,7,8,9,10]
add=l1[0]
for i in range(0,len(l1)):
    j=i+1
    if(j<len(l1)):
        print(j)
        add=add+l1[j]
        if(add==sum):
            print(i,j)

