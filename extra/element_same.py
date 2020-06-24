# # 1.
# l1=[10,10,10,10,10,10,10,0]
# c=1
# for i in range(0,len(l1)):
#     if(i+1<len(l1)):
#         if(l1[i]==l1[i+1]):
#             c=c+1
#         else:
#             break
#
# if(c==len(l1)):
#     print("Yes")
# else:
#     print("No")


#2.
l1=[10,10,10,10,10,10] # odd no. element

print(len(['Y' for i in l1 if l1[0]==i]) == len(l1))  # one line code.
