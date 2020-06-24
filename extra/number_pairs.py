"""Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of)
where x is an element from X and y is an element from Y."""

for i in range(int(input())):
    m,n=input().split()
    l1=list(map(int,input().split()))
    l2=list(map(int,input().split()))
    c=0
    for i in l1:
        for j in l2:
            if((i**j)>(j**i)):
                c=c+1
    print(c)