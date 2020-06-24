#  i/p:a[]={2,1,6}
#  * b[]={1,5}
#  * now 2^1 >1^2, 2^5 >5^2 , 1^1 !> 1^1 , 6^1 >1^6 and 6^5 !> 5^6.
#  * so count of greater than is 3.

l1=[2,1,6]
l2=[1,5]
count=0
for i in range(0,len(l1)):
    for j in range(0,len(l2)):
        if(pow(l1[i],l2[j]) > pow(l2[j],l1[i])):

            count=count+1

print(count)