package oops.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    static void reverseFirstK(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        //pushing elements in stack to reverse the first k elements;
        //q-> [1,2,3,4,5,6]
        int rem=k;
        while(rem>0){
            st.push(q.poll());
            rem--;
        }
        //q-> [4,5,6]
        //pushing reversed elements back to queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        //q-> [4,5,6,3,2,1]
        int add=n-k;
        while(add>0){
            q.add(q.poll());
            add--;
        }

    }



    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int k=3;
        System.out.println(q);
        reverseFirstK(q,k);
        System.out.println(q);
            
    
    }
    
}
