package oops.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {

    //NODE CLASS 
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }

    //PREORDER TRAVERSAL DISPLAY
    public static void preorder(Node root){
        if(root==null)return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    //INORDER TRAVERSAL DISPLAY
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //POSTORDER TRAVERSAL DISPLAY
    public static void postorder(Node root){
        if(root==null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //NUMBER OF NODES
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }

    //SUM OF NODES
    public static int sumOfNodes(Node root){
        if(root==null)return 0;
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    //MAXIMUM VALUE IN TREE
    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

    //HEIGHT OF TREE
    public static int height(Node root){
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left), height(root.right));
    }

    //MINIMUM VALUE IN TREE
    public static int min(Node root){
        if(root==null)return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    //PRODUCT OF NODES
    public static int product(Node root){
        if(root==null)return 1;
        return root.data*product(root.left)*product(root.right);
    }

    //PRINT ELEMENT OF NTH LEVEL
    public static void nthLevel(Node root,int n){
        if(root==null)return;
        if(n==1){
            System.out.print(root.data+" ");
            return;
        }

        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    //level order traversal not optimised
    public static void levelOrder(Node root){
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
    
    //level order traversal(BFS->Breath first search)
    public static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
        System.out.println();
    
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(5);
        root.left=a;
        root.right=b;
        

        Node c=new Node(3);
        Node d=new Node(4);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        Node g=new Node(10);
        f.right=g;
        System.out.print("preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("postorder traversal: ");
        postorder(root);
        System.out.println();
        System.out.println("size of this tree is: "+size(root));
        System.out.print("sum of nodes in tree: "+sumOfNodes(root));
        System.out.println();
        System.out.println("max value: "+max(root));
        System.out.println("height of tree is: "+height(root));
        System.out.println("minimum value: "+min(root));
        System.out.println("product of nodes: "+product(root));
        int n=3;
        System.out.print("elements of nth level: ");
        nthLevel(root, n);    
        System.out.println();
        levelOrder(root);
        System.out.println("BFS");
        BFS(root);
        
    
    
    }
    
}
