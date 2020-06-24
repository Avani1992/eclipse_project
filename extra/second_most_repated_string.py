"""Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence."""

s="geeks for geeks for geeks"

l1=s.split(' ')
d=dict()
for i in l1:
    if(i in d):
        d[i]=d[i]+1
    else:
        d[i]=1

print(d)

for k,v in d.items():
    if(v==2):
        print(k)