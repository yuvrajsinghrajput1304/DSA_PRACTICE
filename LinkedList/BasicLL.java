package oops.LinkedList;

public class BasicLL {
    //count number of nodes in a linked list
    public static int recCount(Node head){
        int count=0;
        if(head==null){
            return count;
        }
        count++;
        return count+recCount(head.next);
        
    }
    //count number of nodes iteratively
    public static int iteCount(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    // display a linked list 
    public static void display(Node head){
    
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    //reverse linked list 
    public static void rLLDisplay(Node head){
        if(head==null){
            return;
        }
        rLLDisplay(head.next);
        System.out.print(head.data+" ");

    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static class Linkedlist{


    }

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //display itetratively
        // Node temp=a;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //Display recursively
        display(a);
        //display reverse linked list
        System.out.println();
        rLLDisplay(a);
        System.out.println();
        System.out.println("number of nodes in this linked list:"+iteCount(a));
        
        System.out.print("number of nodes ia list recursively:"+recCount(a));
    }
    
}
