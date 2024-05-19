import java.util.Scanner;

class Day24 {
   
    public static void DeleteNodes(Node del) {
        while (del.next != null) {
            if (del.next.data == -1) {
                del.next = del.next.next;
                continue;
            }
            del = del.next;
        }
    }
   
    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node current = head;
      
        while (current.next != null) {
            Node compare = current.next;
            while (compare != null) {
                if (current.data == compare.data) {
                    compare.data = -1;
                }
                compare = compare.next;
            }
            current = current.next;
        }
        DeleteNodes(head);
        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);    
        
        if (head == null) {
            head = p;
        }   else if (head.next == null) {
            head.next = p;
        }   else {
            Node start = head;
            while(start.next != null)
                start = start.next;
                start.next = p;
        }
        return head;
    }
   
    public static void display(Node head) {
      
        Node start = head;
        while(start != null) {
            System.out.print(start.data+" ");
            start=start.next;
        }
   
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while(T-->0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
      
        head = removeDuplicates(head);
        display(head);
      
    }
}
