"""Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.
 Output your answer mod 10^9 + 7.  without consecutive 1 means without 11(two 1 together)"""

s=3

l1=['0','1']

l2=['0','1']

l3=list()
l4=list()
for i in l1:
    for j in l2:
        if((i+j).endswith('0')):
            l3.append(i+j)
        if((i+j).endswith('1') and (i+j)!='11'):
            l4.append(i+j)
print(l3)
print(l4)
l5=list()

for i in l3:
    l5.append(i+'0')
    l5.append(i+'1')

print(l5)
l6=list()
for i in l4:
    l6.append(i+'0')
print(l6)

l7=l5+l6
print(l7)



