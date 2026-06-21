package oops.stack;

import java.util.Stack;

public class DisplayStack {
    static void displayRecursively(Stack<Integer> s){
        if(s.size()==0)return;
        int top=s.pop();
        System.out.print(top+" ");
        displayRecursively(s);
        
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRecursively(st);
        
    }
    
}
