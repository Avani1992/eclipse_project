"""Given two strings s1 and s2. Modify string s1 such that all the common characters of s1 and s2 is to be removed and the
 uncommon characters of s1 and s2 is to be concatenated."""

s1="aacdb"
s2="gafd"

s3=s1+s2
print(s3)

d=dict()
for i in range(0,len(s3)):
    if(s3[i] in d):
        d[s3[i]]=d[s3[i]]+1
    else:
        d[s3[i]]=1

print(d)
s1=''
for i,j in d.items():
    if(j==1):
        s1=s1+i

print(s1)
