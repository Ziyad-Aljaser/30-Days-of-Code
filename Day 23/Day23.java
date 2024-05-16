import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Day23 {

    static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }   else {
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
                System.out.print(temp.data + " ");
            }
        }
      
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }   else {
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}
