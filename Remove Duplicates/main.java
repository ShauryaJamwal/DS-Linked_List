import java.util.*;
public class main{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void print(Node n){
        while(n!=null){
            System.out.print(n.data +" ");
            n = n.next;
        }
        System.out.println();
    }
    public int length(Node temp){
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public LinkedHashSet func(Node head){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
            int n = length(head);
            while(head!=null){
            for(int i=0;i<n;i++){
                hs.add(head.data);
            }
            head = head.next;
        }
        return hs;
    }
    public static void main(String[] args){
        main obj = new main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Linked List :");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            obj.push(sc.nextInt());
        }
        System.out.println("The original linked list is :");
        obj.print(head);
        System.out.println("The list after removing duplicates is: ");
        System.out.print(obj.func(head) +" ");
    }
}