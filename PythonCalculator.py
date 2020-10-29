import sys
print("\t\tHello!  This Is A Calculator Application!")
choice = input("\n Please Type Either Addition, Subtraction, Multiplication, Division, or Exit!\n\n")
if choice == "Addition":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    additionAnswer = number1 + number2
    print(additionAnswer)
elif choice == "addition":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    additionAnswer = number1 + number2
    print(additionAnswer)
elif choice == "Subtraction":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    subtractionAnswer = number1 - number2
    print(subtractionAnswer)
elif choice == "subtraction":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    subtractionAnswer = number1 - number2
    print(subtractionAnswer)
elif choice == "Multiplication":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    multiplicationAnswer = number1 * number2
    print(multiplicationAnswer)
elif choice == "multiplication":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    multiplicationAnswer = number1 * number2
    print(multiplicationAnswer)
elif choice == "Division":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    DivisionAnswer = number1 / number2
    print(DivisionAnswer)
elif choice == "division":
    number1 = float(input("What Is Your First Number? "))
    number2 = float(input("What Is Your Second Number? "))
    DivisionAnswer = number1 / number2
    print(DivisionAnswer)
elif choice == "exit":
    sys.exit()
elif choice == "Exit":
    sys.exit()
input("\nThank You For Your Calculations!")
