/*Q2. build a JAVA program from scratch that reverses the words in a sentence.*/


package questions;
import java.util.*;

public class Question_2 {	
	
	void reverse_Sentence_Brute(String s)
	{
		String reverse= "" ;
		
		
		for(String temp : s.split(" ") )
		{
			for(int i=temp.length()-1;i>-1;i--)
			{
				reverse = reverse + temp.charAt(i);
			}
			reverse = reverse + " ";
			
		}
		System.out.println(reverse);
	}
	
	


	
	
	
	
	
	void reverese_Sentence_stack(String s)
	{
		Stack <String>stack = new Stack<String>();
		
			String[] a = s.split(" ");
			
			for(int i=0;i<a.length;i++)
			{
				stack.push(a[i]);
			}
			String reverse = "";
			for(int i=0;i<a.length;i++)
			{
				reverse = reverse + stack.pop() +" ";
			}
			
			System.out.println (reverse);
		
	}
	
	int top = -1;
	String [] stack ;
	int max ;
	public Question_2(int n )
	{
		max = n;
		stack = new String[n];
	}
	
	
	void push(String enter)
	{
		if(top==-1)
		{
			top = 0;
			stack[top] = enter;
		}
		else if(top == max-1)
		{
			System.out.print("Overflow!!!!!!");
		}
		else
		{
			top ++;
			stack[top] = enter;
		}
	}
	String pop()
	{
		String element;
		if(top==-1)
		{
			System.out.println("Underflow");
			return "";
		}
		else
		{
			element = stack[top];
			top --;
			return element;
		}
	}
	
	
	String reverse(String s )
	{
		for(String temp : s.split(" "))
		{
			push(temp);
		}
		String reverse_string = ""; 
		for(int i=s.split(" ").length-1;i>-1;i--)
		{
			reverse_string= reverse_string +pop() + " ";
		}
		return reverse_string;
	}
	
	
	
	public static void main(String... args)
	{			
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the string you want to enter: ");
				String sentence = scan.nextLine();
				Question_2 reverse_sentence = new Question_2(sentence.length());
				System.out.println(reverse_sentence.reverse(sentence));
				
				reverse_sentence.reverese_Sentence_stack(scan.nextLine());
	scan.close();}
}
