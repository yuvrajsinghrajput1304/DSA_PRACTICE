package oops.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static Queue<Integer> reorderQueue(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=q.size()/2;i++){
            q.add(q.remove());
        }

        //pushing half element of queue to stack
        for(int i=0;i<=q.size()/2;i++){
            st.push(q.remove());
        }
        
        while(st.size()>0){
            q.add(st.pop());
            for(int i=1;i<=q.size()-2;i++){
                q.add(q.remove());
            }
        }
    


        return q;
    }

        public static Queue<Integer> reorderQueue2(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        //adding first half of queue to stack
        int qsize=q.size();
        for(int i=1;i<=qsize/2;i++){
            st.push(q.remove());
        }
        //adding back to queue
        while(st.size()>0){
            q.add(st.pop());
        }
        //adding new first half to stack
        for(int i=1;i<=qsize/2;i++){
            st.push(q.remove());
        }
        //game start here 
        //now do add remove operations on stack and queue to arrange the correct elements together
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        //we got the reversed output.
        //now reverse queue using stack to get the desired output.
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }


        return q;
    }


    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        // reorderQueue(q);
        reorderQueue2(q);
        System.out.println(q);

    }
    
}
