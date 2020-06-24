l1=[1,2,3,4,5,6,7,8,9]

l2=list();

l3=l1[0:int(len(l1)/2)]
l4=l1[int(len(l1)/2):]
l5=l4[::-1]
print(l5)
for i in  range(0,len(l5)):
    l2.append(l5[i])
    for j in range(i,len(l3)):

        l2.append(l3[j])
        break
print(l2)
