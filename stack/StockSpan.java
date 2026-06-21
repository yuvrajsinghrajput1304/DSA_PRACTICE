package oops.stack;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] res=new int[n];
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=i+1;
            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        return res;

    }




    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] ans=stockSpan(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
    
}
