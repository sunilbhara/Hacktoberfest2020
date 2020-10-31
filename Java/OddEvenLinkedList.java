
class linkedlist
{
    Node head;
    static class Node
    {
       int data;
       Node next;
       Node(int val)
       {
          data = val;
          next = null;
       }
    }
    void add(int val)
    {
       Node temp = new Node(val);
       temp.next = head;
       head=temp;
    }
    
    void rearrange()
    {
       //If list is empty
       if (head == null)  
            System.out.println("Linkedlist is empty");
        
    Node odd = head;  
    Node even = head.next;  
   
    Node First = even;  
  
    while (true)  
    {  
        
        if (odd == null || even == null || (even.next) == null)  
        {  
            odd.next = First;  
            break;  
        }  
  
        // Connecting odd nodes  
        odd.next = even.next;  
        odd = even.next;  
  
        // If no more even nodes   
        if (odd.next == null)  
        {  
            even.next = null;  
            odd.next = First;  
            break;  
        }  
  
        // Connecting even nodes  
        even.next = odd.next;  
        even = odd.next;  
    }  
    
    }
    
    public static void main(String args[])
    {
       linkedlist l = new linkedlist();
       
       //Values in linkedlist are 3,2,6,1,9,7,12,11,16 with 16 as head
       l.add(3);l.add(2);l.add(6);l.add(1);l.add(9);l.add(7);l.add(12);l.add(11);l.add(16);
       
       l.rearrange();
       Node h = l.head;
       while(h != null)
       {
           System.out.print(h.data+" ");
           h=h.next;
       }
    }
    
    
}
//Output is: 16 12 9 6 3 11 7 1 2
