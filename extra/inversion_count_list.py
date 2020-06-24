#For an array, inversion count indicates how far (or close) the array is from being sorted.
# If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
#Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

l1=[2,4,1,3,5]
count=0
for i in range(0,len(l1)):
    for j in range(i+1,len(l1)):
        if(l1[i] > l1[j]):
            count=count+1

print(count)