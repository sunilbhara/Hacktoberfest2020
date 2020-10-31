#pragma once
#include<cmath>
extern int answer;
double Add(double a, double b)
{
	answer = a + b;
	return answer;
}
double Subtract(double a, double b)
{
	answer = a - b;
	return answer;
}
double Divide(double a, double b)
{
	answer = a / b;
	return answer;
}
double Multiply(double a, double b)
{
	answer = a * b;
	return answer;
}
double takeMod(int a, int b)
{
	answer = a % b;
	return answer;
}
double takePower(double a, double b)
{
	answer = pow(a, b);
	return answer;
}
double takeSquareRoot(double a)
{
	answer = sqrt(a);
	return answer;
}
void Sine(float x)
{
	float s;
	s = sin(x);
	cout<<"Sin: "<<s;
}

void Cos(float x) 
{
	float c;
	c = cos(x);
	cout<<"COS: "<<c;
}

void Tan(float x)
{
	float t;
	t = tan(x);
	cout<<"TAN: "<<t;
}
void fact(int n)
{	int i;
   	unsigned long long fact = 1;
    	// shows error if the user enters a negative integer
    	if (n < 0)
        	cout<<"Error! Factorial of a negative number doesn't exist.";
   	else {
        	for (i = 1; i <= n; ++i) {
            	fact *= i;
        	}
        cout<<"Fact: "<<fact;
    	}
    return 0;
}
	
