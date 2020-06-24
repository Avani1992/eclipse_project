import copy
s='7yr7y8rur9ruewiru90iiio'
sub='99ir'
l1=list(sub)
print(l1)
l2=list()
d=dict()
l3=l1
#print(l3)
for i in range(0,len(s)):
    if(s[i] in l1):
        l2.append((s[i],i))

l4=dict()

l3=l1
for i in range(0,len(l2)):
    size = list()
    l3 = copy.deepcopy(l1)

    for j in range(i,len(l2)):

        if(l2[j][0] in l1):
            if(l2[j][0] in l3):
                size.append((j,l2[j][1]))
                l3.remove(l2[j][0])
                if(len(l3)==0):
                    l4[size[0][1],size[-1][1]]=abs(size[0][1]-size[-1][1])
                    #print(l4)

                    break
            else:
                pass
print(l4)
print(l2)
if(len(l4)==0):
    print("-1")
else:
    mini=min(l4.values())

    print(list(l4.keys())[list(l4.values()).index(mini)])
