import random
minNumber = 1
maxnumber = 6

emptyString = ""

while emptyString == "":
    print ("the number is:");
    print (random.randint(minNumber,maxnumber));
    emptyString = input("would you like to roll the dice again? Press enter")