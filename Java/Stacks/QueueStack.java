import java.util.Scanner;

public class QueueStack {
	
	int top = -1;
	int max;
	int stck[];
	int stck2[];
	public ques3(int stck[], int stck2[], int max) {
		this.stck = stck;
		this.stck2 = stck2;
		this.max = max;
	}
	
	void enqueue(int x) {
		if (top == max - 1) {
			System.out.println("Overflow");
		}
		else {
			top = top + 1;
			stck[top] = x;
		}
	}
	
	void dequeue() {
		if (top == -1) {
			System.out.println("Underflow");
		}
		else {
			//add all elements to second stack
			int i = top;
			int j = 0;
			while (i>=0) {
				stck2[j] = stck[i];
				i = i-1;
				j = j + 1;
			}
			//remove the top element from second stack
			int t = stck2[top];
			top = top - 1;
			System.out.print("Dequeued element is " + t);
			
			//add all elements back to first stack
			i = top;
			j = 0;
			while (i>=0) {
				stck[j] = stck2[i];
				i = i-1;
				j = j+1;
			}
		}
	}
	
	void print() {
		if (top == -1) {
			System.out.print("Underflow");
		}
		else {
			int i = top;
			int j = 0;
			while (i>=0) {
				stck2[j] = stck[i];
				i = i-1;
				j = j + 1;
			}
			
			i = top;
			System.out.println("The final queue is");
			while (i>=0) {
				System.out.print(stck2[i] + " ");
				i = i-1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Queue using Stack ");
		System.out.println("Enter size of Queue ");
		int max = ip.nextInt();
		int[] stck = new int[max];
		int[] stck2 = new int[max];
		ques3 op = new ques3(stck,stck2,max);
		
		char ch;
		do {
			System.out.println("\n Queue Opeartions");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			int choice = ip.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Enter integer element to Enqueue");
				int val = ip.nextInt();
				op.enqueue(val);
				break;
				
			case 2:
				System.out.println("Dequeue element");
				op.dequeue();
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
