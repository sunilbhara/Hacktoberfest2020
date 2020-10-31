#Author: James Kirkby
#Date: 20/10/20

#Q6 - FizzBuzz
#Function
def fizzBuzz (number):
    if number % 3 == 0 and number % 5 == 0: 
        print("FizzBuzz")
    elif number % 5 == 0:
        print("Buzz")
    elif number % 3 == 0:
        print("Fizz")
    else: print(number)
    
#Ask user for number
number = int(input("Please enter a number:"))
#Call Function
fizzBuzz(number)
