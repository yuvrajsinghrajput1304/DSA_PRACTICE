package oops.LinkedList;

public class LinkedlistClass {
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

    }
    
}
