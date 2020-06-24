"""Given an unsorted array of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array.
 Find these two numbers.eg. l=[1,3,3] and len=3 so missing no. from [1,2,3] is 2 and repeated no. is 3."""

l1=[1,3,3]
len1=len(l1)
print(len)
l2=list()
for i in range(1,len1+1):
    l2.append(i)
print(l2)

for i in l2:
    if(i not in l1):
        print("missing no= ",i)
for i in range(0,len(l1)):
    for j in range(i+1,len(l1)):
        if(l1[i]==l1[j]):
            print("Repeated no= ",l1[i])