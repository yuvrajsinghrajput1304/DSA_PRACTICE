package oops.stack.revision;
import java.util.Stack;

public class reverse {
    public static Stack<Integer> reverseStack(Stack<Integer> st,Stack<Integer> rt){
        //base case
        if(st.size()<=0)return rt;

        int top=st.pop();
        rt.push(top);
        reverseStack(st,rt);
        return rt;
    }


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st=reverseStack(st,rt);
        System.out.println(st);
        

        

    }
    
}
