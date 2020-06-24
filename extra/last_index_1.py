
c=0
for i in range(int(input())):
    s=input()
    if('1' not in s):
        print("-1")
    else:
        for i in range(0,len(s)):
            if(s[i]=='1'):
                c=i
        print(c)


