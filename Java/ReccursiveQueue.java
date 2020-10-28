import java.util.*;
   
public class ReccursiveQueue.java{ 
   
    //print the queue 

    static void Print(Queue<Integer> queue) {   
    	try {
        while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
    	} 
    	catch (Exception e) {
    		
    	}
    }
// Recurrsive function to reverse the queue 
    static Queue<Integer> rev_queue(Queue<Integer> q) { 
    // Base case 
    if (q.isEmpty()) 
        return q; 
  
    // Dequeue item  
    int data = q.peek(); 
    q.remove(); 
  
    // Recurssion    
    q = rev_queue(q); 
  
    // Enqueue   
    q.add(data); 
          
    return q; 
    } 
    
    public static void main(String args[]) { 
    	Queue<Integer> queue = new LinkedList<Integer>(); 
    	Scanner ip = new Scanner(System.in);
    	System.out.print("Enter how many elements you want to enter ");
    	int n = ip.nextInt();
    	System.out.print("Enter elements ");
    	for (int i = 0; i < n; i ++) {
    		int num = ip.nextInt();
    		queue.add(num);
    	}
    	queue = rev_queue(queue); 
    	Print(queue); 
    	
    	ip.close();
    } 
} 
