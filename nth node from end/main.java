import java.util.*;
public class main{
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
            System.out.print(n.data +" ");
            n = n.next;
        }
        System.out.println();
    }
    public int func(int n){
        Node fast = head;
        Node slow = head;
        int c=0;
        for(int i=1;i<n;i++){
            fast = fast.next;
            if(fast.next==null){
                System.out.println("Only one element present");
                return -1;
            }
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args){
        main obj = new main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int x = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<x;i++){
            obj.push(sc.nextInt());
        }
        System.out.println("Enter the index of node from the end: ");
        int n = sc.nextInt();
        System.out.println(n+"th node from the end is: ");
        System.out.println(obj.func(n));
    }
}