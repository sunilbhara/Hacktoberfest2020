package questions;

import java.util.Scanner;



public class Question_3 {
	
	int size ;
	int [] stack;
	int top=-1;
	
	void set_Size(int size)
	{
		this.size = size;
		stack = new int[size];
	}
	
	void push(int data)
	{
		if(top==-1)
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
	int pop()
	{
		int element=0;
		if(top==-1)
		{
			System.out.println("Underflow");
			return 0;
		}
		else 
		{
			element = stack[top];
			top--;
			return element;
		}
	}
	
	void enque(int data)
	{
		push(data);
	}
	
	int deque()
	{
		Question_3 stack_1 = new Question_3();
		stack_1.set_Size(top+1);
		for(int i=top;i>-1;i--)
		{
			stack_1.push(pop());
		}
		
		int element = stack_1.pop();
		for(int i=stack_1.top;i>-1;i--)
		{
			push(stack_1.pop());
		}
		return element;
	}
	void traversal()
	{
		if(top==-1)
		{
			System.out.println("No element is present");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
		}
	}
	
	void peek()
	{
		if(top==-1)
		{
			System.out.println("There is no element");
			
		}
		else
		{
			System.out.println("Peek element is : " +stack[top] );
		}
	}
	void size()
	{
		System.out.println(top+1);
	}
	
	
	
	
	
	
	public static void main(String ... args)
	
	{
		
	
		
		
		
		
		
		Scanner scan = new Scanner(System.in);        
        System.out.println("==========================Queue Test==========================\n");
        System.out.print("Please enter Size of Integer queue: ");
        int capacity = scan.nextInt();
        Question_3  queue = new Question_3();
        queue.set_Size(capacity);
       
       
        char ans;
        do{
            System.out.println("=====================Queue Operations=====================");
            System.out.println(">> 1. Enque");
            System.out.println(">> 2. Dequeue");
            System.out.println(">> 3. Find the peek element in queue ");
            System.out.println(">> 4. Find the number of elements in queue");
            System.out.print(">> 5. Traversal \n $ ");
            int choice = scan.nextInt();
           switch (choice)
            {
            case 1 : 
            	//Enqueue an element
                	System.out.print("Enter integer element to enque: ");
                	queue.enque (scan.nextInt());                      
                			break;                         
            case 2 :
                //Dequeue an element  
            		System.out.print("You have opted to delete an element from the queue is " );
                    System.out.println(queue.deque());
                    	break;                 
            case 3 :        
                   
            	//showing peek element
            		queue.peek();
                    	break;             
                                     
            case 4 : 
            	//Show size of queue
            		queue.size();
            			break; 
            case 5 :
            	//Traverse the queue
            	  	queue.traversal();
            	  		break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
                     
            System.out.print("\nDo you want to continue (Type y or n) : ");
            ans= scan.next().charAt(0); 
            
 
        } while (ans == 'Y'|| ans == 'y');                 
    System.out.print("Thank you visit again!!!!! :) " );

			scan.close();}
}
