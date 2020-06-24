#l1=[23 ,13 ,25 ,29 ,33 ,19 ,34 ,45 ,65 ,67]
# for i in range(int(input())):
#     s=int(input())
#     l1=list(map(int,input().strip().split()))
#     l2=list()
#     l3=list()
#
#     for i in range(0,len(l1)):
#         if(i+1<len(l1)):
#             if(l1[i]>l1[i+1]):
#
#                 l2.append(i+1)
#                 if(len(l2)>1):
#                     l3.append(i)

#
#
#             if(i+1==len(l1)-1):
#                 l3.append(i+1)
#
#     for i in range(0,len(l2)):
#         print((l2[i],l3[i]),end=' ')


for i in range(int(input())):
    s=int(input())
    l1=list(map(int,input().strip().split()))
    l2=list()
    l3=list()
    l4=list()
    if(l1[0]>l1[1]):
        k=1
    else:
        k=0
    for i in range(k,len(l1)):
        if(i+1<len(l1)):
            if(l1[i+1]>l1[i]):
                l2.append(i)
                if(len(l2)==1):
                    l3.append(i)
            else:
                l4.append(i)
                l2=list()
            if(i+1==len(l1)-1):
                l4.append(i+1)
    for i in range(0, len(l3)):
         print((l3[i],l4[i]),end=' ')

