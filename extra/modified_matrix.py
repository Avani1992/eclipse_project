"""Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true)
 then make all the cells of ith row and jth column as 1."""

r=input("Enter no. of rows:")
c=input("enter no. of column:")

l1=list()
l2=list()
for i in range(0,int(r)):
    l1 = list()
    for j in range(0,int(c)):
        l1.append(input("enter element:"))
    l2.append(l1)
print(l2)
row=0
column=0
l3=list()
for i in range(0,len(l2)):
    for j in range(0,len(l2[i])):
        if(l2[i][j]=='1'):
            row=i
            column=j
            l3.append((i,j))
print(l3)
for i in range(0,len(l2)):
    for j in range(0,len(l2[i])):
        for k in range(0,len(l3)):
            if(i==l3[k][0] or j==l3[k][1] ):
                    l2[i][j]='1'


print(l2)




