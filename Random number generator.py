import random
choice = input('enter your choice H OR T \n ')
x= random.choice('TH')
print ('the toss is ', x)
sum = 0
m = 0
s = 0
m1 = 0
s1 = 0
if choice is x:
    print('you won the toss')
    while sum <100:
        print('its your choice')
        m = int(input('enter the no between 1 and 9\t'))
        if m <= 100-sum:
            m1 = m1 + 1
            sum = sum + m
            print ('total sum is\t ', sum )
            if sum < 100:
                print('its system turn')
                s = random.randrange(1,10,1)
                if  s <= 100-sum:
                    s1 = s1 +1
                    print('system choice is \t',s)
                    sum = sum + s
                    print ('total sum is \t', sum )
                else :
                    s = random.randrange(1, (100-sum)+1, 1)
                    s = random.randrange(1, 10, 1)
                    s1 = s1 + 1
                    print('system choice is \t', s)
                    sum = sum + s
                    print('total sum is \t', sum)
        else:
            print('please enter the number less the ', 100-sum )
            m = int(input('enter the no between 1 and 9\t'))
            m1 = m1 + 1
            sum = sum + m
            print ('total sum is\t ', sum )
            if sum < 100:
                print('its system turn')
                s = random.randrange(1,10,1)
                if  s <= 100-sum:
                    s1 = s1 +1
                    print('system choice is \t',s)
                    sum = sum + s
                    print ('total sum is \t', sum )
                else :
                    s = random.randrange(1, (100-sum)+1, 1)
                    s = random.randrange(1, 10, 1)
                    s1 = s1 + 1
                    print('system choice is \t', s)
                    sum = sum + s
                    print('total sum is \t', sum)

    if m1 != s1 :
        print ('you won')
    else:
        print('you lost')

else :
    print('you lost the toss')
    while sum < 100:
        print('its system turn')
        s = random.randrange(1, 10, 1)
        if s <= 100 - sum:
            s1 = s1 + 1
            print('system choice is \t', s)
            sum = sum + s
            print('total sum is \t', sum)
            if sum < 100:
                print('its your choice')
                m = int(input('enter the no between 1 and 9\t'))
                if m <= 100-sum:
                    m1 = m1 + 1
                    sum = sum + m
                    print('total sum is \t', sum)
                else:
                    print('please enter the number less the ', 100 - sum)
                    m = int(input('enter the no between 1 and 9\t'))
                    m1 = m1 + 1
                    sum = sum + m
                    print('total sum is \t', sum)
        else:
            s = random.randrange(1, (100 - sum)+1, 1)
            s1 = s1 + 1
            print('system choice is \t', s)
            sum = sum + s
            print('total sum is \t', sum)
            if sum < 100:
                print('its your choice')
                m = int(input('enter the no between 1 and 9\t'))
                if m <= 100 - sum:
                    m1 = m1 + 1
                    sum = sum + m
                    print('total sum is \t', sum)
                else:
                    print('please enter the number less the ', 100 - sum)
                    m = int(input('enter the no between 1 and 9\t'))
                    m1 = m1 + 1
                    sum = sum + m
                    print('total sum is \t', sum)
    if s1 != m1:
        print('you lost')
    else:
        print('you won')



