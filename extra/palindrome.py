# class palindrome:
#     def palindrome(self):
#         s=input("Enter String:").strip() # avoid space...
#         s1=s[::-1]
#         if(s==s1):
#             print(s+" is Palindrome String...")
#         else:
#             print(s + " is not Palindrome String...")
#
# p1=palindrome()
# p1.palindrome()

s="I am :IronnorI Ma, , i"

s1=s.lower()
print(s1)
s2=''
for i in range(0,len(s1)):
    if(s1[i].isalnum()):
        s2=s2+s1[i]
    else:
        pass

print(s2)

s3=s2[::-1]
print(s3)
c=0
for i in range(0,len(s2)):
    if(s2[i]==s3[i]):
        c=c+1

if(c==len(s2)):
    print("Yes")
else:
    print("No")
