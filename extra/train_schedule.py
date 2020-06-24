# The first line of input contains T, the number of test cases. For each test case, first line will contain an integer N, the number of trains.
# Next two lines will consist of N space separated time intervals denoting arrival and departure times respectively.

arrival=  [900,940,950,1100,1500,1800]
departure=[910,1200,1120,1130,1900,2000]
difference=list()
count=1

for i in range(1,len(arrival)):
    j=i-1

    if(arrival[i]<departure[j]):
        difference.append(departure[j])
        #print(difference)
        for k in range(0,len(difference)):
            if(arrival[i]<difference[k]):
                count=count+1
                #print("count=",count)
            break

print("Count of required platform=",count)