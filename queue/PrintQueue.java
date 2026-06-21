package oops.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void printQueue(Queue<Integer> q){
        Queue<Integer> newq=new LinkedList<>();
        while(!q.isEmpty()){
            int ans=q.remove();
            newq.add(ans);
            System.out.print(ans+" ");

        }
        while(!newq.isEmpty()){
            q.add(newq.remove());
        }
        System.out.println();
}

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        printQueue(q);
        printQueue(q);
        printQueue(q);



        
    }
    
}
