package oops;

import java.util.Arrays;

public class CreateArrayList {
    public static class Arraylist{
        int[] arr=new int[5];
        int idx=0;
        int size=0;

        void add(int ele){
            if(size==arr.length){
                int[] brr=Arrays.copyOf(arr,arr.length*2);
                arr=brr;
            }
            arr[idx]=ele;
            idx++;
            size++;
        }

        void set(int idx,int val){
            arr[idx]=val;

        }

        int size(){
            return size;
        }

        void print(){
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }



    }


    public static void main(String[] args) {
        Arraylist al=new Arraylist();
        al.add(2);
        al.add(5);
        al.add(6);
        al.set(0,4);
        System.out.println("size of list is:"+al.size());
        al.print();
        

        
    }
    
}
