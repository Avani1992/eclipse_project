l1=[1,2,3,4,5,7,8,10]
for i in range(int(input())):
    size=int(input())
    l1=list(map(int,input().strip().split()))

    s1=0
    d=dict()
    for i in range(0,len(l1)):
        if(i+1 not in l1):
            s1=i+1

        if(l1[i] in d):
            d[l1[i]]=d[l1[i]]+1
        else:
            d[l1[i]]=1
    maximum=max(d.values())

    print(list(d.keys())[list(d.values()).index(maximum)],s1)

