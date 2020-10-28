import java.util.Scanner;

public class stack_menu {
	
	int top = -1;
	int max;
	int stck[];
	public stack_menu(int stck[], int max) {
		this.stck = stck;
		this.max = max;
	}
	
	void push(int x) {
		if (top == max - 1) {
			System.out.println("Overflow");
		}
		else {
			top = top + 1;
			stck[top] = x;
		}
	}
	
	void pop() {
		if (top == -1) {
			System.out.println("Underflow");
		}
		else {
			int t = stck[top];
			top = top - 1;
			System.out.print("Popped element is " + t);
		}
	}
	
	void peek() {
		if (top == -1) {
			System.out.print("Stack empty");
		}
		else {
			System.out.print(stck[top]);
		}
	}
	
	void check_empty() {
		if (top == -1) {
			System.out.print("Stack empty");
		}
		else {
			System.out.print("Stack not empty");
		}
	}
	
	void check_full() {
		if (top == max - 1) {
			System.out.print("Stack full");
		}
		else {
			System.out.print("Stack not full");
		}
	}
	
	void print() {
		if (top == -1) {
			System.out.print("Underflow");
		}
		else {
			int i = top;
			while (i>=0) {
				System.out.println("The stack queue is");
				System.out.println(stck[i]);
				i = i-1;
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Stack ");
		System.out.println("Enter size of stack ");
		int max = ip.nextInt();
		int[] stck = new int[max];
		stack_menu op = new stack_menu(stck,max);
		
		char ch;
		do {
			System.out.println("\n Stack Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Check Empty");
			System.out.println("5. Check Full");
			int choice = ip.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Enter integer element to Push");
				int val = ip.nextInt();
				op.push(val);
				break;
				
			case 2:
				System.out.println("Pop element");
				op.pop();
				break;
			
			case 3:
				System.out.println("Peek element = ");
				op.peek();
				break;
				
			case 4:
				System.out.println("Empty Status: ");
				op.check_empty();
				break;
				
			case 5:
				System.out.println("Full Status ");
				op.check_full();
				break;
				
			
			default:
				System.out.println("Wrong entry \n");
				break;
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = ip.next().charAt(0);
			
		}
		while (ch == 'Y' || ch == 'y');
		op.print();
		ip.close();

	}

}
