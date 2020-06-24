# find the no. in which left size elements are smaller than no. and right side elements are greater than no.
l1=[4 ,3 ,2 ,7 ,8 ,9]
l2=list()
for i in range(0,len(l1)):
        j=i+1
        if(j< len(l1)):
            if(l1[i]>l1[j]):
                pass
            else:
                l2.append(l1[j])
                i=j
                for k in l2:
                    if(l1[j]>k):
                        l2.remove(l1[j])

for i in  l2:
    print(i)
