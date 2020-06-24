"""Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on..."""

for i in range(int(input())):
    s=int(input())
    l2=list()
    l1=list(map(int,input().split()))
    j=1
    for i in range(int(len(l1)/2)):
        l2.append(l1[len(l1)-j])
        l2.append(l1[i])
        j=j+1
    print(l2)