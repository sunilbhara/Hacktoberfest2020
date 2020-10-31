#Author: James Kirkby
#Date: 20/10/20

#Leap Year
#Function to check for a leap year
def checkLeapYear (year_input):
    if year_input %400 == 0:
        print("This is a leap year")
    elif year_input %100 == 0:
        print("This is not a leap year")
    elif year_input %4 == 0:
        print("This is a leap year")
    else: print("This is not a leap year")

#Get a value from the user
year_input = int(input("Please enter a year:"))
#Call function
checkLeapYear(year_input)
