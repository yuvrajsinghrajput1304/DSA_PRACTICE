package oops.stack;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> reverse(Stack<Integer> st,Stack<Integer> rt){
        
        if(st.size()==0)return rt;
        rt.push(st.pop());
        return reverse(st,rt);
        


    }
    //push at bottom function for reverse;
    static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return ;
        }
        
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);


    }
    //reverse using recursion and push at bottom
    static void reverse2(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        
        int top=st.pop();
        reverse2(st);
        pushAtBottom(st, top);
        

    }
    
    


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Stack<Integer> rt=new Stack<>();
        // System.out.println(reverse(st,rt));
        System.out.println("using reverse2 funstion");
        reverse2(st);
        System.out.println(st);


    }
    
}
