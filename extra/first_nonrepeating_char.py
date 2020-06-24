"""Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S."""

s="hellohe"

for i in range(0,len(s)):
    c=1
    for j in range(i+1,len(s)):
        if(s[i]==s[j]):
            break
        else:
            c=c+1


    if(c==len(s)-i):
        print(s[i])
        break
