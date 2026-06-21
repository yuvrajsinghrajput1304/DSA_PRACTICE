package oops;

import java.util.Arrays;

public class ArrayInsertion{

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int size=6;
        int pos=4;
        int ele=5;
        
            int[] brr=Arrays.copyOf(arr, arr.length+1);
            arr=brr;
            
        
        for(int i=size;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=ele;
        for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }

    }
    
    
}