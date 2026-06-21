package oops.stack;
public class ImplementStackArray {
    public static class stack{
        int[] arr=new int[50];
        int top=-1;
        int size=0;
        
        //puch
        void push(int data){
            if(top==arr.length-1){
                System.out.println("stack overflow");
                return;
            }
            top++;
            size++;
            arr[top]=data;

        }
        
        //peek
        int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[top];
        }

        //pop
        int pop(){
            if(isEmpty()){
                System.out.println("stack underflow");
                return -1;
            }
            size--;
            return arr[top--];
        }
        //size
        int size(){
            return size;
        }

        boolean isEmpty(){
        if(top==-1){
        return true;
        }
        return false;
        }

        //display 
        void display(stack st){
            if(st.size()==0){
                return;
            }
            int t=st.pop();
            display(st);
            System.out.print(t+" ");
            st.push(t);
        }
        //another display
        void display2(){
            System.out.println();
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display(st);
        st.display2();
        
    }

}
