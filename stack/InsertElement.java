package oops.stack;

import java.util.Stack;

public class InsertElement {
    static Stack<Integer> insertAtBottom(Stack<Integer> st,int x){
        //base case
        if(st.size()==0){
            st.push(x);
            return st;
        }
        int top=st.pop();
        insertAtBottom(st, x);
        st.push(top);
        return st;


    }


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //indert element at 3rd index
        // int n=3;
        // int ele=69;
        // System.out.println("before insertion:"+st);

        // Stack<Integer> tempSt=new Stack<>();

        // while(st.size()>n){
        //     tempSt.push(st.pop());
        // }
        // st.push(ele);
        // while(tempSt.size()>0){
        //     st.push(tempSt.pop());
        // }
        // System.out.println("after insertion:"+st);
        System.out.println(st);
        insertAtBottom(st, 69);
        System.out.println(st);

    }
    
}
