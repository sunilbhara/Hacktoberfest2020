package Trees;
import java.util.*;
public class width_of_tree {
    public static class Node{
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }

    static int idx = 0;
    public static Node constructTree(int[] arr){
        if(idx==arr.length || arr[idx]==-1){
            idx++;
            return null;
        }

        Node node=new Node(arr[idx++]);

        node.left = constructTree(arr);
        node.right = constructTree(arr);

        return node;
    }

    public static void display(Node node){
        if(node==null) return;
        StringBuilder sb = new StringBuilder();
        
        sb.append(node.left!=null?node.left.data+"" : ".");
        sb.append(" <- " + node.data + " -> ");
        sb.append(node.right!=null?node.right.data+"" : ".");

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);
    }

    public static int size(Node node){
        return node==null? 0 : size(node.left) + size(node.right) + 1; 
    }

    public static int height(Node node){
        return node==null? -1 : Math.max(height(node.left) , height(node.right)) + 1; 
    }

    public static void width(Node root,int[]maxmin,int level){
        if(root==null)
            return;
        maxmin[0]=Integer.min(maxmin[0],level);
        maxmin[1]=Integer.max(maxmin[1],level);
        width(root.left,maxmin,level-1);
        width(root.right,maxmin,level+1);
    }
    public static void preOrder(Node node){
        if(node == null) return ;

        System.out.print(node.data+"\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void InOrder(Node node){
        if(node == null) return ;

        InOrder(node.left);
        System.out.print(node.data+"\t");
        InOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null) return ;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
    }
    public static int diameter(Node node){
        if(node==null) return 0;

        int ld = diameter(node.left);
        int rd = diameter(node.right);
        
        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(Math.max(ld,rd),lh+rh+2);
    }

    public static void kdown(Node node,Node block,int k){
        if(node == null || node == block || k < 0) return;

        if(k == 0){
            System.out.print(node.data+" ");
            return;
        }

        kdown(node.left,block, k - 1);
        kdown(node.right,block, k - 1);
    }

    public static boolean rootToNodePath(Node node,int data,ArrayList<Node> path){

        if(node==null) return false;

        if(node.data == data){
            path.add(node);
            return true;
        }

        boolean res = false;
        res = res || rootToNodePath(node.left,data,path);
        res = res || rootToNodePath(node.right,data,path);

        if(res) {
            path.add(node);
            return true;
        }

        return false;
    }
    public static void zigzag(Node node){
        LinkedList<Node> st1 = new LinkedList<>();
        LinkedList<Node> st2 = new LinkedList<>();

        st1.addFirst(node);
        int level=0;

        while(st1.size()!=0){
            int size = st1.size();
            while(size-->0){
                Node rvtx = st1.removeFirst();
                System.out.print(rvtx.data+" ");

                if((level & 1) == 0){
                    if(rvtx.left!=null) st2.addFirst(rvtx.left);
                    if(rvtx.right!=null) st2.addFirst(rvtx.right);
                }else{
                    if(rvtx.right!=null) st2.addFirst(rvtx.right);
                    if(rvtx.left!=null) st2.addFirst(rvtx.left);   
                }
            }

            LinkedList<Node> temp = st1;
            st1 = st2;
            st2 = temp;

            System.out.println();
            level++;
        }

    }

    public static void leftView(Node node){
        LinkedList<Node> que = new LinkedList<>();
        que.addLast(node);
        
        while(que.size()!=0){
            int size = que.size();
            System.out.print(que.getFirst().data+" ");
            while(size-->0){
                Node rvtx = que.removeFirst();

                if(rvtx.left!=null) que.addLast(rvtx.left);
                if(rvtx.right!=null) que.addLast(rvtx.right);
            }
        }
    }

    public static void rightView(Node node){
        LinkedList<Node> que = new LinkedList<>();
        que.addLast(node);
        
        while(que.size()!=0){
            int size = que.size();
            Node prev = null;
            while(size-->0){
                Node rvtx = que.removeFirst();
                prev = rvtx;

                if(rvtx.left!=null) que.addLast(rvtx.left);
                if(rvtx.right!=null) que.addLast(rvtx.right);
            }
            System.out.print(prev.data+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,40,-1,-1,50,80,-1,-1,90,-1,-1,30,60,100,-1,-1,-1,70,110,-1,-1,120,-1,-1};
        Node root = constructTree(arr);
        // display(root);
        // int []maxmin=new int[2];
        // width(root,maxmin,0);
        // System.out.println(maxmin[1]-maxmin[0]);
        // InOrder(root);
        // System.out.println();
        // preOrder(root);
        leftView(root);

    }
    
}
