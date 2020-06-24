"""Given an array A of N elements. Find the majority element in the array.
 A majority element in an array A of size N is an element that appears more than N/2 times in the array."""


l1=list(eval(input("Enter Element:")))

print(l1)

def majority(l1):
    size=int(len(l1)/2)
    #print(size)
    d=dict()
    for i in l1:
        if(i in d):
            d[i]=d[i]+1
        else:
            d[i]=1
    print(d)
    max_value=max(d.values())
    if(max_value>=size):
        print(list(list(d.keys()))[(list(d.values()).index(max_value))])
    else:
        print("-1")


majority(l1)