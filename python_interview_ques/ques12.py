#Li = [5, 7, 22, 97, 54, 62, 77, 23, 73, 61], filter out odd elements from list

li = [5, 7, 22, 97, 54, 62, 77, 23, 73, 61]

list1=list(filter(lambda x:(x%2!=0),li))

print(list1)