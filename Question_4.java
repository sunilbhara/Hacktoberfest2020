/*Q4. Write the function transforming a decimal number into a binary number by using stack*/
package questions;
import java.util.*;
 class Node
{
	 Node next;
	 int data;
	 
	 public Node()
	 {
		 this.next = null;
		 this.data = 0; 
	 }
	 
	 void set_Data(int data)
	 {
		 this .data = data;
	 }
	 void set_Link(Node next)
	 {
		 this.next = next;
	 }
	 int get_Data()
	 {
		 return data;
	 }
	 Node get_Link()
	 {
		 return next;
	 }
	 
}
 
 class Stack_Implement
 {
	 Node top = null;
	 
	
	 void push(int data)
	 {
		 Node node = new Node();
		if(top==null)
		{
			top = node;
			node.set_Data(data);
		}
		else
		{
			node.set_Link(top);
			node.set_Data(data);
			top = node;
		}
	 }
	 
	 int pop()
	 {
		 int element;
		 if(top==null)
		 {
			 System.out.println("Underflow");
			 element = -1;
		 }
		 else
		 {
			 element = top.get_Data();
			 top = top.next;
		 }
		 return element;
	 }
 }

public class Question_4 {
	String binary(int decimal)
	{	
		String binary ="";
		int size=1;
		Stack_Implement stack = new Stack_Implement();
		
		if(decimal>0) 
			{
		
			while(decimal!=1)
				{
					int temp;
					temp = decimal%2;
					stack.push(temp);
					decimal = decimal/2;
					size++;
				}	
			stack.push(1);
		
			for(int i=0;i<size;i++)
				{
					binary = binary + Integer.toString(stack.pop());
				}
			}
		else
			{
			binary = "0";
			}
		
		return binary;
		
	}
	
	
	public static void main(String... args)
	{
		Scanner scan = new Scanner (System.in);
		Question_4 conversion = new Question_4();
		System.out.println("Enter the decimal number");
		System.out.print(conversion.binary(scan.nextInt()));
	
	scan.close();}
}
