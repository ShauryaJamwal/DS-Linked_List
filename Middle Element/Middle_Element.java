import java.util.*;
public class Middle_Element {
    static Node head;
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    public void middle(){
        Node slow = head;
        Node fast = head;
        if(head!=null){
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("The middle element is : "+ slow.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Middle_Element obj = new Middle_Element();
        System.out.println("Enter the number of elements of the linked list");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            obj.push(sc.nextInt());
        }
        obj.middle();
    }
}
