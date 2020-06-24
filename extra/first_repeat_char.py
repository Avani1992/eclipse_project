"""Given a string - "str", find the repeated character present first in the string.

Example :
Input  :  geeksforgeeks
Output :  g
          (mind that it will be g, not e.)
"""

s="Morning"
c=0
for i in range(0,len(s)):
    for j in range(i+1,len(s)):
        if(s[i]==s[j]):
            c=1
            break
    if(c==1):
        print(s[i])
        break
    else:
        pass

if(c==0):
    print("-1")

