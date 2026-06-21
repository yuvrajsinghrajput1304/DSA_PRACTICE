package oops.LinkedList;
import oops.LinkedList.LinkedlistClass.Linkedlist;

public class MiddleElement {
    
    public static int middleElement(Linkedlist ll){
    LinkedlistClass.Node slow = ll.head;
    LinkedlistClass.Node fast = ll.head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow.data;
}
    


    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(7);
        ll.add(8);
        ll.display();
        System.out.println("middle element is:"+middleElement(ll));
    
    }
    
}
