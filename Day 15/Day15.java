import java.util.Scanner;

class Day15 {

    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node (data);
        }   else if (head.next == null) {
            head.next = new Node (data);
        }   else {
            insert (head.next, data);
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        int N = scan.nextInt();

        while(N-- > 0) {
            int ele = scan.nextInt();
            head = insert(head,ele);
        }
        display(head);
        scan.close();
    }
}
