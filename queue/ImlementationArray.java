package oops.queue;

public class ImlementationArray {
        static class queue{
        int[] arr=new int[100];
        int size=0;
        int front=0;
        int rear=0;

        //add element 
        void enqueue(int data){
            arr[rear]=data;
            size++;
            rear++;
        }

        //remove element
        void deque(){
            if(front==rear){
                System.out.println("empty queue");
                return;
            }
            else{
                front++;
                size--;
            }
        }
        //display queue
        void display(){
            if(rear==front){
                System.out.println("empty");
            }
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        }


    public static void main(String[] args) {
        queue u=new queue();
        u.enqueue(1);
        // u.enqueue(2);
        // u.enqueue(3);
        // u.enqueue(4);
        // u.enqueue(5);
        u.display();
        u.deque();
        u.display();
        

        
    }
    
}

//package oops.queue;
//public class Implement {
//    static class queue{
//        int[] arr=new int[100];
//        int front=0;
//        int rear=0;
//
//        void enqueue(int data){
//            arr[rear]=data;
//            rear++;
//        }
//        void display(){
//            for(int i=front;i<rear;i++){
//                System.out.println(arr[i]+" ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        queue u=new queue();
//        u.enqueue(1);
//        u.enqueue(2);
//        u.enqueue(3);
//        u.enqueue(4);
//        u.enqueue(5);
//        u.display();
//
//
//    }
//}