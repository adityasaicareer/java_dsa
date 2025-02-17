

import java.util.*;

class Node{
    int v;
    Node left;
    Node right;
    public Node(int v)
    {

        this.v=v;
        this.left=null;
        this.right=null;

    }
}
class Tree{
    Node root;
    
    public Tree()
    {
        this.root=null;
    }

    void add(int v)
    {
        if(this.root==null)
        {
            this.root=new Node(v);
        }
        else{
            Node temp=this.root;
            while(true)
            {
                if(v<temp.v)
                {
                    if(temp.left!=null)
                    {
                        temp=temp.left;
                    }
                    else{
                        temp.left=new Node(v);
                        return;
                    }
                }
                else{
                    if(temp.right!=null)
                    {
                        temp=temp.right;
                    }
                    else{
                        temp.right=new Node(v);
                        return;
                    }
                }
            }
        }
    }
   

    
}
public class Build {

    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.v+" ");
            preorder(root.left);
            preorder(root.right);
    
        
        
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Tree t=new Tree();
        for(int i=1;i<=5;i++)
        {
            t.add(s.nextInt());
        }
        s.close();
        preorder(t.root);
    }
    
}
