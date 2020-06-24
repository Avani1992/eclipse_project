s=input("Enter String:")
#1.
print(s[::-1])
#2.
s1=''.join(reversed(s))
print(s1)

#3.
l=len(s)
i=-1
s2=""
while(i>=(-l)):
    s2=s2+s[i]
    i=i-1
print(s2)
#4.
s3=""
for i in range(1,(len(s)+1)):
    s3=s3+s[-i]
print(s3)
