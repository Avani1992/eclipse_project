"""Given strings s1 and s2, you need to find if s2 is a rotated version of the string s1. The strings are lowercase."""

s1="geeksforgeeks"
s2="forgeeksgeeks"

s3=s1+s1
print(s3)

if(s2 in s3):
    print("1")
else:
    print("0")
