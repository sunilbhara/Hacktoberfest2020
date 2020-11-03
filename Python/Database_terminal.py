import mysql.connector

#connection
mydb = mysql.connector.connect(
  host="database",
  user="username",
  password="password",
  database="database name",
)

mycursor = mydb.cursor()

code = input("Input SQL code here ")
sql = code
mycursor.execute(sql)

mydb.commit()

print(mycursor.rowcount, "record inserted.")
