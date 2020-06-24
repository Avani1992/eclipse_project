"""A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
 For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2]."""

l1=[1,2,3,4,5]
n=3

def rotLeft(l1,n):
    l2=list()
    c=0

    for i in l1:
        c=c+1
        if(c>n):
            for i in l2:
                if(i in l1):
                    l1.remove(i)

            break
        else:
            l2.append(i)


    return (l1 + l2)

total=rotLeft(l1,n)
print(total)