import java.util.*;
public class reverse{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void print(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    public Node rev(Node node){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        reverse obj = new reverse();
        System.out.print("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Enter the elements of the linked list: ");
        for(int i=0;i<n;i++){
            obj.push(sc.nextInt());
        }
        System.out.println("The original Linked list is: ");
        obj.print(head);
        head = obj.rev(head);
        System.out.println("The reversed list is: ");
        obj.print(head);
    }
}