"""Given an integer array A of N elements. You need to find the sum of two elements such that sum is closest to zero."""

l1=list(eval(input("Enter element: ")))
print(l1)
def closest_zero(l1):
    l2=list()
    for i in range(0,len(l1)):
        for j in range(i+1,len(l1)):
            l2.append(l1[i]+l1[j])
    print(l2)
    print(max(l2))

closest_zero(l1)