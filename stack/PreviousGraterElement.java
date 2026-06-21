package oops.stack;

import java.util.Stack;

public class PreviousGraterElement {
    public static int[] previousGrater(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        st.push(arr[0]);
        res[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek()<arr[i]){
            st.pop();
        }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] ans=previousGrater(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i: ans){
            System.out.print(i+" ");
        }

    }
    
}
