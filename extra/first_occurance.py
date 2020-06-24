"""Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the
string x in the string s. The function returns and integer denoting the first occurrence of the string x in s."""

def check(str,sub1):
    if(sub1 in str):
        print(str.index(sub1))
    else:
        print("-1")

check("GeeksForGeeks","Fr")