import csv
import matplotlib.pyplot as plt

openfile=open("Emissions.csv","r")
r=csv.reader(openfile)
d=dict()
for i in r:
    d[i[0]]=i[1:]

# for i,v in d.items():
#     print(i,'=',v)

#2.. min_max_avg emission count regarding user entered year...

#year=input("Enter Year:")

#a=d['CO2 per capita'].index(year)
#print(a)

l1=list()
l2=list()
for i,v in d.items():
    l2.append(i)
    l1.append(float(v[0]))
#print(l1)
minimum=min(l1[1:])
maximum=max(l1[1:])
#print('In {} ,countries with minimum and maximum CO2 emission levels were:[{}] and [{}] respectively.'.format(year,l2[l1.index(minimum)],l2[l1.index(maximum)]))
#print('Average CO2 emissions in {} were {:.6f}'.format(year,(sum(l1[1:])/(len(l1)-1))))

#3.Plot the graph year vs. emission level for specific country
#
# country=input("Enter country name:")
#
#
# plt.plot(list(map(float,d['CO2 per capita'])),list(map(float,d[country])))
# plt.xlabel('Year')
# plt.ylabel('Emission/Year')
# plt.title('Year vs. Emission in Capita')
# plt.show()

#4. Plot the graph year vs. emission level for compering two country

# country1,country2=(input("Enter Two comma seperated country name:")).split(",")
#
#
# plt.plot(list(map(float,d['CO2 per capita'])),list(map(float,d[country1])),label=country1)
# plt.plot(list(map(float,d['CO2 per capita'])),list(map(float,d[country2])),label=country2)
# plt.xlabel('Year')
# plt.ylabel('Emission/Year')
# plt.title('Year vs. Emission in Capita')
# plt.show()

#5. You will extract data for up to three user-selected countries and save it to a new file Emissions_subset.csv.
#The new file should have the exact same format as the source file, i.e. first line of headers and then up to 3 lines for selected countries.

country=list(input("Enter three comma seperated country name:").split(","))
print(country)
if(len(country)>3 or len(country)<3):
    print("ERR: Enter Three country ")
else:
    filewriter=open("Subset_Three_country.csv","w")
    w=csv.writer(filewriter)
    w.writerow(['CO2 per capita',d['CO2 per capita']])
    for i in range(3):
        countryname=country[i]
        emissionlevel=d[country[i]]
        w.writerow([countryname,emissionlevel])
    print("Data sucessfully written...")





