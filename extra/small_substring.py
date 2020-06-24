"""Given a string S and text T. Output the smallest window in the string S having all characters of the text T.
Both the string S and text T contains lowercase english alphabets.
eg. s="timetopractice" t="toc". "toprac" is the smallest substring in the given string S which contains every characters of T."""

s="timetopractice"
t="toc"
l1=list()
d=dict()
for i in t:
    l1.append(i)
print(l1)
l2=list()
for i  in l1:
    for j in range(0,len(s)):
        if(i==s[j]):
           d[i]=j
           print(d)