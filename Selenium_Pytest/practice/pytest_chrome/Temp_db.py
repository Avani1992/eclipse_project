from mysql import connector

db=connector.connect(host='localhost',username='root',password='user123',database='gec_rajkot')
cursor=db.cursor()
q1=("insert into student_info (rollno,name,branch,year) values(%s,%s,%s,%s)")
values=[('1','ABC','EC','2018'),('2','BCD','EC','2017'),('3','ASD','EC','2019')]
cursor.executemany(q1,values)
db.commit()
print("Data entered sucessfully......")
cursor.close()