//Floyd’s Cycle-Finding Algorithm:
import java.util.*;
public class Loop{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int detect(){
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        if(slow == fast){
            System.out.println("Found Loop");
            return 1;
        }
    }
    return 0;
    }
    public static void main(String[] args){
        Loop l = new Loop();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        
        l.head.next.next.next.next.next = l.head.next;
        l.detect();
    }
}