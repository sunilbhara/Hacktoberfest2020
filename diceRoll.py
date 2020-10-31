#Author: James Kirkby
#Dice Rolling Simulator
import random
#Program to generate a number between 1-6
def diceRoll ():
    number = random.randint(1, 6)
    print("The number is:", number)

#Program to generate a number between 2-12
def diceRoll2 ():
    number2 = random.randint(2,12)
    print("The number is:", number2)

#User input
roll = input("Would you like to roll the singular die? ")
if roll in ['Y', 'y', 'Yes', 'yes', 'YES']:
    diceRoll()
    roll2 = input("Would you like to roll two dice? ")
    if roll2 in ['Y', 'y', 'Yes', 'yes', 'YES']:
        diceRoll2()
