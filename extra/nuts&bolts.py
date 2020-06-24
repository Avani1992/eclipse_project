"""Given a set of N nuts of different sizes and N bolts of different sizes.
 There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.
Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared with bolt and bolt can
only be compared with nut to see which one is bigger/smaller.

output:For each test case, output the matched array of nuts and bolts in separate lines, where each element in the array is separated by a space.
 Print the elements in the following order ! # $ % & * @ ^ ~
"""

nuts=['@','%','$','#','^']
bolts=['%','@','#','$','^']
pattern=['!','#','$','%','&','*','@','^','~']
l1=list()
for i in pattern:
    if(i in nuts):
        l1.append(i)
l2=list()
l3=list()
for i in l1:
    if(i in bolts):
        l2.append(i)
        l3.append(i)
print(l2)
print(l3)
