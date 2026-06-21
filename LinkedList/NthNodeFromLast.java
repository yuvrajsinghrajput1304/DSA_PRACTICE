package oops.LinkedList;

public class NthNodeFromLast {
        public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        
        //add function(this function will add the node at the end and if node is emply then add at the fist position)
        public void add(int n){
            Node nn=new Node(n);
            if(tail==null){
            tail=nn;
            head=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=tail.next;
            size++;}
        }
        //display function
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        //return size function
        int count(){
            return size;
        }

        //insert at index function
        void insertAt(int idx,int data){
            if(idx>size || idx<0){
                System.out.println("invalid index");
                return;
            }
            Node nn=new Node(data);
            if(idx==0){
                if(head==null){
                    head=nn;
                    tail=nn;
                }
                else{
                    nn.next=head;
                    head=nn;
                }
                size++;
                return;
                
            
            }

            if(idx>0 && idx<size){
                Node temp=head;
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                nn.next=temp.next;
                temp.next=nn;
                size++;
                return;
                
            }
            if(idx==size){
                tail.next=nn;
                tail=nn;
                size++;
                return;
            }
            
        }

        //get element
        int get(int idx){
            if(idx<0 || idx>=size){
                System.out.println("invalid index");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;

        }

        //delete function
        void deleteAtIndex(int idx){
            if(idx>=size || idx<0){
                System.out.println("invalid index");
                return;
            }
            if(head==null){
                System.out.println("empty list");
                return;
            }
            if(size==1){
                head=tail=null;
                size--;
                return;

            }
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            if(idx==size-1){
                Node temp=head;
                while(temp.next!=tail){
                    temp=temp.next;
                }
                tail=temp;
                tail.next=null;
                size--;
                return;
            }
            if(idx>0 && idx<size){
                Node temp=head;
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                size--;
                return;
            }
        }
         //nth node from last
        int nthNodeLast(int n){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
            
        }
        return slow.data;

    }
    //remove nth node from last
        void removeNthLast(int n){
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                return;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            size--;
        }

    }



    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        System.out.println(ll.nthNodeLast(2));
        ll.removeNthLast(2);
        ll.display();
        ll.removeNthLast(4);
        ll.display();
        System.out.println("size is"+ll.count());
        System.out.println("head is"+ll.head.data);
        System.out.println("tail is"+ll.tail.data);

    
}
}
