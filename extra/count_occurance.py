"""Given an array containing N words consisting of lowercase characters. Your task is to find the most frequent word in the array. If multiple words
have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency."""

l1=["Good","Morning"]

d=dict()
for i in l1:
    if(i in d):
        d[i]=d[i]+1
    else:
        d[i]=1

l2=list()
max_value=max(d.values())  # find max value eg.2
print(d)

l2=list(d.keys())  # key list
l3=list(d.values()) # value list
l2=l2[::-1] # reverse keylist
l3=l3[::-1] # reverse value list
i=l3.index(max_value)   # find index of max_value
print(l2[i]) # print key of that max_value.

# We have to reverse it if value of more than one key is same. we want last key from that same value.
# eg.["Good","Morning"] both have same value 1. so we want "Morning" as output bcz it is last.
