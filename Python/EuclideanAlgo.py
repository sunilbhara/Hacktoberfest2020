# Python program to find gcd of two numbers  
  
# Function to return gcd of a and b 
def gcd(a, b):  
    if a == 0 : 
        return b  
      
    return gcd(b%a, a) 
  
a = 10
b = 15
print("gcd(", a , "," , b, ") = ", gcd(a, b)) 
