"""Given a dictionary of words where each word follows CamelCase notation,
print all words in the dictionary that match with a given pattern consisting of uppercase characters only."""

l1=["WelcomeGeek", "WelcomeToGeeksForGeeks","GeeksForGeeks"]
s1="WTG"


for i in l1:
    # if(s1[0]in i and s1[1] in i and s1[2] in i):
    #     print(i)
    k=0
    c=0
    for j in range(0,len(i)):
        if (i[j].isupper()):
            if(k<len(s1)):
                if(s1[k]==i[j]):
                    c=c+1
                    k=k+1
            else:
                break

    if(c==len(s1)):
        print(i)
