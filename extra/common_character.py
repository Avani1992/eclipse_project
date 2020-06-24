"""Given a array of N strings, find the longest common prefix among all strings present in the array."""

l1=["apple","api","april"]
def prefix(l1):
    l2=min(l1) # "api"

    j=0
    s1=''
    for j in range(0,len(l2)):
        for i in range(1,len(l1)):
            if((i==len(l1)-1) and (l2[j]==l1[i][j])):
                s1=s1+l2[j]


            elif(l2[j]==l1[i][j]):
                pass
            else:
                if(len(s1)>0):
                    print(s1)
                else:
                    print("-1")
                    break




prefix(l1)