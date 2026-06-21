package oops.stack;

import java.util.Stack;

public class NextGrateElement {
    
    public static int[] nextGraterElement(int[] arr){  //bruteforce approch
        int n=arr.length;
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            ans[i]=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
            
        }
        return ans;
    }
    public static int[] nextGraterElement2(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        st.push(arr[n-1]);
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
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
        int[] ans=nextGraterElement2(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
    
}
