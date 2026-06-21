package oops.stack;

import java.util.Stack;

public class copyStack {


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int[] arr=new int[st.size()];
        Stack<Integer> newSt=new Stack<>();
        //adding elements of stack into array
        int i=0;
        while(!st.isEmpty()){
            arr[i]=st.peek();
            st.pop();
            i++;
        }

        //copy the elements of array into new stack and the previous stack at the same time
        i=arr.length-1;
        while(i>=0){
            st.push(arr[i]);
            newSt.push(arr[i]);
            i--;
        }
        System.out.println("st:"+st);
        System.out.println("newSt:"+newSt);




    }
    
}
