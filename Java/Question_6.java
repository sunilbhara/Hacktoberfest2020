/*Write the function that returns duplicate stack of the given stack. Duplicate stack 
contains the same elements as the original stack, and in the same order. The original
stack must stay unchanged.
*/

package questions;
import java.util.*;
	


public class Question_6 {
	
	int top=-1;
	int [] stack;
	int size ;
	
	public Question_6(int size)
	{
		stack = new int[size];
		this.size = size;
	}
	
	void push(int data)
	{
		if(top==-1)
		{
			top=0;
			stack[top] = data;
		}
		else if(top ==size-1)
		{
			System.out.print("Overflow");
		}
		else
		{
			top++;
			stack[top] = data;
		}
	}
	
	int pop()
	{
		int element =0;
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			element = stack[top];
			top--;
		}
		return element;
	}

	void traversal()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	
	void duplicate_Stack(int []stack )
	{
		
		Question_6 stack_2 = new Question_6(stack.length);
		Question_6 stack_3 = new Question_6(stack.length);
		for(int i=top;i>-1;i--)
		{
			stack_2.push(stack[i]);
		}
		for(int i=0;i<stack_2.size;i++)
		{
			stack_3.push(stack_2.pop());
		}
		
		stack_3.traversal();
	}
	
	
	
	
	public static void main(String... args)
	
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size = scan.nextInt();
		System.out.println("Enter the elements: ");
		Question_6 stack = new Question_6(size);
		for(int i=0;i<size;i++)
		{
			stack.push(scan.nextInt());
		}
		System.out.println(stack.stack);
		stack.duplicate_Stack(stack.stack);
		
		
	scan.close();}

}
