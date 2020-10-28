import java.util.*;

public class RemoveEven {
	
	static int remove_even(Stack<Integer> stck){
		int i = 0;;
		Stack<Integer> tstck = new Stack<Integer>();
		
		//adding odd numbers to a temporary stack
		while(!stck.isEmpty()) {
			int num = stck.pop();
			if (num % 2 == 0) {
				i = i + 1;
			}
			else {
				tstck.push(num);
			}
		}
		
		//adding back all the odd numbers to original stack
		while(!tstck.isEmpty()) {
			stck.push(tstck.pop());
		}
		
		while(!stck.isEmpty()) {
			System.out.print(stck.pop() + " ");
		}
		
		System.out.println("The number of even numbers removed is ");
		System.out.print(i);
		return i;
	}

	public static void main(String[] args) {
		Stack<Integer> stck = new Stack<Integer>();
		Scanner ip = new Scanner(System.in);
		while(true) {
			System.out.print("Enter numbers to push ");
			int num = ip.nextInt();
			stck.push(num);
			System.out.print("Do you wish to continue (y/n) ");
			String choice = ip.next();
			if (choice.charAt(0) == 'n' || choice.charAt(0) == 'N') {
				break;
			}
		}
		remove_even(stck);
		
		ip.close();
	}

}
