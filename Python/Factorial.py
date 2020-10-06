# Python program to find the factorial of a number provided by the user.

f = int(input("Enter the number to find factorial: "))

factorial = 1

# check if the number is negative, positive or zero
if f < 0:
   print("Factorial does'nt exist for negative numbers!")
elif f == 0:
   print("Factorial of 0 is 1")
else:
   for i in range(1,f + 1):
       factorial = factorial*i
   print("The factorial of",f,"is",factorial)
