package oops.stack.revision;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> st,int x){
        //base case
        if(st.size()<=0){
            st.push(x);
            return;
        }

        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int x=25;
        System.out.println(st);
        pushAtBottom(st,x);
        System.out.println(st);
    }
    
}
