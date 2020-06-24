"""Given N leaves numbered from 1 to N . A caterpillar at leaf 1, jumps from leaf to leaf in multiples of Aj (Aj, 2Aj, 3Aj).
j is specific to the caterpillar. Whenever a caterpillar reaches a leaf, it eats it a little bit..
 You have to find out how many leaves, from 1 to N, are left uneaten after all K caterpillars have reached the end.
 Each caterpillar has its own jump factor denoted by Aj, and each caterpillar starts at leaf number 1."""

n=10
l1=[2,3,5]
l2=list()
for i in range(0,len(l1)):
    j=l1[i]
    p=j
    while(p<=10 ):
        l2.append(p)
        p = p + j


print(l2)
c=0
for i in range(1,n+1):
    if(i not in l2):
        c=c+1
print(c)