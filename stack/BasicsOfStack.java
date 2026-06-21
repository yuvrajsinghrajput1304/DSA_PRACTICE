package oops.stack;

import java.util.Stack;

public class BasicsOfStack {
    

public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    // while(st.size()>1){
    //     st.pop();
    // }
    // System.out.println(st.peek());
    // System.out.println(st);
    
    //accesing elements of stack
    Stack<Integer> tempStack=new Stack<>();
    int n=3;
    while(st.size()>n){
        tempStack.push(st.peek());
        st.pop();

    }
    System.out.println(tempStack);
    System.out.println(st.peek());
    System.out.println(st);
    while(!tempStack.isEmpty()){
        st.push(tempStack.peek());
        tempStack.pop();

    }
    System.out.println(st);
    System.out.println(tempStack);

    }
}
