import java.util.*;

public class DupliStack {
	
	static void print_stack(Stack<Integer> stck) {
		while(!stck.isEmpty()) {
			System.out.println(stck.pop());
		}
	}
	
	static void dupli_stack(Stack<Integer> stck, Stack<Integer> stck2) {
		Stack<Integer> temp_stck = new Stack<Integer>();
		//Storing all elements in a temp stack
		while (!stck.isEmpty()) {
			temp_stck.push(stck.pop());
		}
		
		//Adding the elements back to orignal stack and duplicate stack
		while(!temp_stck.isEmpty()) {
			int v = temp_stck.pop();
			stck.push(v);
			stck2.push(v);
		}
		
	}

	public static void main(String[] args) {
		Stack<Integer> stck1 = new Stack<Integer>();
		Stack<Integer> stck2 = new Stack<Integer>();
		Scanner ip = new Scanner(System.in);
		System.out.print("How many values do you want to enter ");
		int siz = ip.nextInt();
		int i = 0;
		System.out.print("Enter numbers you want in stack (Press enter after each number)");
		while(i < siz) {
			int num = ip.nextInt();
			stck1.push(num);
			i++;
		}
		
		dupli_stack(stck1,stck2);
		System.out.println("Original Stack");
		print_stack(stck1);
		System.out.println("Duplicated Stack");
		print_stack(stck2);
		
		ip.close();
	}

}
