import java.util.*;
public class length{
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
    public int size(Node node){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        length obj = new length();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        System.out.println("The length of the linked list is: "+obj.size(head));
    }
}