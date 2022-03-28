package javaChallenges;

import org.w3c.dom.*;

public class Assignment3_17 {

    static class Node{
        public int value ;
        public Node left,right;
    }

    public static void printleafNode(Node root){
            if(root==null){
                return;
            }

            if(root.left==null && root.right==null){
                System.out.print( (char)root.value+" ");
                return;
            }

            if(root.left!=null){
                printleafNode(root.left);
            }
            if(root.right!=null){
                printleafNode(root.right);
            }
    }
    public static Node newnode(int value) {
        Node temp = new Node();
        temp.left=null;
        temp.value=value;
        temp.right=null;
        return temp;
    }
            public static void main(String[] args) {
                Node root = newnode('A');
                root.left = newnode('B');
                root.left.left = newnode('C');
                root.left.right = newnode('E');
                root.left.left.left = newnode('D');
                root.right = newnode('F');
                root.right.left = newnode('G');
                root.right.right = newnode('H');
                root.right.right.right = newnode('K');

                printleafNode(root);
            }
    }