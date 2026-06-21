package oops.stack.revision;

import java.util.Stack;

public class BalancedBracket{
    public static boolean balancedBracket(String s){
        Stack<Character> st=new Stack<>();
        if(s.length()%2!=0 || s.charAt(0)==')'){
            return false;
        }
        else if(s.length()%2==0){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='('){
                    st.push(ch);
                }
                else if(st.size()>0 && ch==')'){
                    st.pop();
                }
                else{
                    return false;
                }

            }
            if(st.size()<=0){
                return true;
            }
        }
        return false;
}


    public static void main(String[] args) {
        String s="(()())()))";
        System.out.println(balancedBracket(s));
    }
}