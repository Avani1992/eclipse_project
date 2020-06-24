"""Given a string S consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring."""

for i in range(int(input())):
    s=input()
    c=0
    i=0
    while(i<len(s)):
        if(i+1<len(s)):
            if(s[i]=='(' and s[i+1]==')'):
                c=c+2
                i=i+2
            else:
                i=i+1

        else:
            break
    print(c)