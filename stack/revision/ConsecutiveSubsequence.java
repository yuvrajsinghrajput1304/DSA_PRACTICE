package oops.stack.revision;

import java.util.Stack;

public class ConsecutiveSubsequence {
    public static int[] removeConsecutive(int[] arr){
        Stack<Integer> st=new Stack<>();
        
        for(int i:arr){
            if(!st.isEmpty() && st.peek()==i){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
      

    }


    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,4,5,6,6,6,7};
        int[] ans=removeConsecutive(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
    
}
