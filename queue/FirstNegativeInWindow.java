package oops.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {
    public static int[] firstNinK(int[] arr,int n,int k){
        Queue<Integer> q=new LinkedList<>();
        int[] res=new int[n-k+1];
        //adding -ve value indices
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<=n-k;i++){
            if(q.size()>0 && q.peek()<i)q.remove();

            if(q.size()>0 && q.peek()<=i+k-1){
                res[i]=arr[q.peek()];
            }
            else if(q.size()==0){
                res[i]=0;
            }
            else{
                res[i]=0;
            }
        }
        


        return res;

    }


    public static void main(String[] args) {
        int[] arr={-1,2,3,-4,-5,6,9,-4};
        int n=arr.length;
        int k=3;
        int[] res=firstNinK(arr,n,k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    
}
