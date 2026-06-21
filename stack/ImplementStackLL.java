package oops.stack;

public class ImplementStackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head;
        int size=0;

        //display function
        void display(){
            display(head);
        }
        void display(Node temp){
            if(temp==null)return;
            display(temp.next);
            System.out.print(temp.data+" ");
        }

        //push function
        void push(int data){
            Node nn=new Node(data);
            nn.next=head;
            head=nn;
            size++;
        }

        //peek function
        int peek(){
            System.out.println();
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
        //pop function
        int pop(){
            if(head==null){
                System.out.println("empty list");
                return -1;
            }
            int ans=head.data;
            head=head.next;
            size--;
            return ans;
        }

        //isEmpty function
        boolean isEmpty(){
            return head==null;
        }

        //function to find the count of elements in stack
        int count(){
            return size;
        }


    }


    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size);
        System.out.println(st.pop());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println("count is:"+st.count());

    }
    
}
