with open('demo.txt','r') as file1:
    str1=file1.read()  # return whole file as a string
    print(str1)
    list1=str1.split()  # split it and store it in list.
    print(list1)
    d1=dict()

    for i in list1:
        if(i in d1): # check it in dict.it is there or not.
            d1[i]=d1[i]+1  # take the value according to the key and increase it.
        else:
            d1[i]=1

print(d1)

