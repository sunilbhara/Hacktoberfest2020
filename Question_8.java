package questions;

import java.util.Scanner;

public class Question_8 {
	
	char [] stack;
	int size ;
	int top=-1;
	void set_Size(int size)
	{
		this.size = size;
		stack = new char[size];
	}
	
	void push(char data)
	{
		if(top==-1 )
		{
			top =0;
			stack[top] = data;
		}
		else if(top == size-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			top++;
			stack[top] = data;
		}
	}
	
	char pop()
	{
		char s;
		if(top==-1)
		{
			System.out.println("Underflow");
			return 0;
		}
		else
		{
			s = stack[top];
			top--;
			return s;
		}
	}
	
	void palindrome(char [] stack)
	{
		if(top==-1)
		{
			return ;
		}
		
		char s = stack[top];
		pop();
		 palindrome(stack);
		 push(s);
	}
	String stringOfStack()
	{
		String temp="";
		for(int i=top;i>-1;i--)
		{
			temp = temp + stack[i]; 
		}
		return temp;
	}
	
	
	public static void main(String... args)
	{
		System.out.println("Enter the string you want to check whether it is palindrome or not:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Question_8 stack = new  Question_8();
		stack.set_Size(s.length());
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i))) {
				temp = temp + s.charAt(i);	
				stack.push(s.charAt(i));
			}
		}
		
		stack.palindrome(stack.stack);
		System.out.println(temp.equals(stack.stringOfStack()));
		
	scan.close();}
}
