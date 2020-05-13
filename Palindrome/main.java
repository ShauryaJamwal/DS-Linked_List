import java.util.*;
public class main{
    static Node head;
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
            next =null;
        }
    }
    public void push(char new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head= new_node;
    }
    public void func(){
        int c=0;
        Node temp1 = head;
        Stack<Character> st = new Stack<>();
        while(temp1!=null){
            st.push(temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = head;
        while(temp2!=null){
            char ch = st.pop();
            if(temp2.data!=ch){
               c++;
               break;
           }
           temp2 = temp2.next;
        }
        if(c>0){
           System.out.print("Not a Palindrome");
        }
        else{
           System.out.print("Palindrome");
        }     
    }
    public static void main(String[] args){
        main obj = new main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            obj.push(str.charAt(i));
        }
        obj.func();
    }
}
