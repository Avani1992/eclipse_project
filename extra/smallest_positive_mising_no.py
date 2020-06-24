"""You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array."""

l1=[1,2,0,4,-10]

for i in l1:
    if(i<=0):
        l1.remove(i)
print(l1)

max=max(l1)
min=min(l1)
c=0
for i in range(min,max+1):
    if(i not in l1):
        print(i)

    else:
        c=c+1
if(c==max):
    print(max+1)