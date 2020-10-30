#Objective
#In this challenge, we go further with binomial distributions. We recommend reviewing the previous challenge's Tutorial before attempting this problem.

#Task
#A manufacturer of metal pistons finds that, on average, 12% of the pistons they manufacture are rejected because they are incorrectly sized. 
#What is the probability that a batch of 10 pistons will contain:
#No more than 2 rejects?
#At least 2 rejects?

#Input values Format:
#(12 10)

from itertools import combinations

p,l = list(map(int, input().split(" ")))
p = p/100
q = 1-p

def binomial(x):
    result=0
    for i in range(x+1):
        result+=len(list(combinations(list(range(1,l+1)), i))) * (p**i) * (q**(l-i))
    return result

print(round(binomial(2),3))
print(round(binomial(10)-binomial(1),3))
