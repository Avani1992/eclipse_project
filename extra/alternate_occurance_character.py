"""Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character
 dropped(including space and consider upper and lowercase as same).
 eg.s="It is a long day dear." Print first "I" and then ignore next "i". Similarly print first space then ignore next space. and so on."""

s="geeks for geeks"
s1=s.lower()
print(s1)
d=dict()

s2=''
for i in s1:
    for j in range(0,len(i)):
        if(i[j] in d):
            d.pop(i[j])

        else:
            d[i[j]]=1

            s2=s2+i[j]

print(d)
print(s2)
