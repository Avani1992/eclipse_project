"""list1 = ['s', 'r', 'a', 's'] and list2 = ['a', 'a', 'n', 'h'], what is the output of ["".join([i, j]) for i, j in zip(list1, list2)]?"""

l1=['s','r','a','s']
l2=['a','a','n','h']

l3=list(zip(l1,l2))
print(l3)
for i ,j in l3:
    print(''.join([i,j]))