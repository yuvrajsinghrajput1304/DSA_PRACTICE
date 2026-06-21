// package oops.stack;
// import java.util.Stack;

// public class ConsecutiveSubSequence {
//     public static int[] remove(int[] arr){
//         Stack<Integer> st=new Stack<>();
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//         if(st.isEmpty()){
//         st.push(arr[i]);
//         }
//         else if(st.peek()!=arr[i]){
//         st.push(arr[i]);
//         }
//             if(st.peek()==arr[i]){
//                 if(i==n-1){
//                     st.pop();
//                 } 
//                 else if(arr[i]!=arr[i+1]){
//                     st.pop();
//                 }
//             }
//         }
//         int m=st.size();
//         int[] brr=new int[m];
//         for(int i=m-1;i>=0;i--){
//         brr[i]=st.pop();
//         }
//         return brr;
//     }



//     public static void main(String[] args) {
//         int[] arr={1,1,2,2,3,4,5,5,6};
//         int[] brr=remove(arr);
//         for(int i=0;i<brr.length;i++){
//             System.out.println(brr[i]);
//         }
//     }
    
// }

package oops.stack;

import java.util.Stack;

public class ConsecutiveSubSequence {

    public static int[] remove(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                st.push(arr[i]);
            }
            else if (st.peek() != arr[i]) {
                st.push(arr[i]);
            }

            if (!st.isEmpty() && st.peek() == arr[i]) {

                if (i < n - 1 && arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }

        int m = st.size();
        int[] brr = new int[m];

        for (int i = m - 1; i >= 0; i--) {
            brr[i] = st.pop();
        }

        return brr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2, 3, 4, 5, 5, 6};

        int[] brr = remove(arr);

        for (int x : brr) {
            System.out.print(x + " ");
        }
    }
}
