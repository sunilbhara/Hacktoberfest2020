import pyttsx3 
engine = pyttsx3.init() 

def fac(num):
    faco = 1
    for i in range(1, num+1):
        faco *= i
    return faco

print('Enter a number: ')
engine.say('Enter a number: ')
engine.runAndWait()
num = int(input())
temp = num
sum = 0
while temp != 0:
    dig = temp % 10
    sum += fac(dig)
    temp //= 10
if sum == num:
    print('Strong Number')
    engine.say('Strong Number')
    engine.runAndWait()
else:
    print('Not a strong number')
    engine.say('Not a Strong Number')
    engine.runAndWait()
