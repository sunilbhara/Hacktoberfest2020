#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#define MAX 100
float st[MAX];
int top=-1;
void push(float st[],float val);
float pop(float st[]);
float evaluatePostfixExp(char exp[]);
int isDigit(char c);

int main()
{
	float val;
	char exp[MAX];
	printf("\nEnter any postfix expression:");
	scanf("%[^\n]",exp);
	val = evaluatePostfixExp(exp);
	printf("\nValue of the postfix expression = %.2f",val);
	return 0;
}

float evaluatePostfixExp(char exp[])
{
	int i=0;
	float op1,op2,value;
	while(exp[i]!='\0')
	{
		if(exp[i]==' ')
		{
			i++;
			continue;
		}
		else if(isDigit(exp[i])==1)
		{
			push(st,(float)(exp[i]-'0'));
		}
		else
		{
			op2 = pop(st);
			op1 = pop(st);
			switch(exp[i])
			{
				case '+':
				{
					value = op1+op2;
					break;
				}
				case '-':
				{
					value = op1-op2;
					break;
				}
				case '*':
				{
					value = op1*op2;
					break;
				}
				case '/':
				{
					value = op1/op2;
					break;
				}
			}
			printf("Value:%.2f",value);
			push(st,value);
		}
		i++;
	}
	return (pop(st));
}

void push(float st[], float val)
{
	if(top==MAX-1)
	{
		printf("\n STACK OVERFLOW");
	}
	else
	{
		top++;
		st[top]=val;
	}
}

float pop(float st[])
{
	float val=-1;
	if(top==-1)
	{
		printf("\n STACK UNDERFLOW");
	}
	else
	{
		val = st[top];
		top--;
	}
	return val;
}

int isDigit(char c)
{
	if((c>='0')&&(c<='9'))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}