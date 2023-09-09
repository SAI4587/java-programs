import java.util.Scanner;
public class binarysearchtree {
                        public static void main(String[] args) 
                                    {
                                    Scanner input=new Scanner(System.in);
                                    tree t=new tree();
                                    t.insert(14);
                                    t.insert(4);
                                    t.insert(15);
                                    t.insert(9);
                                    t.insert(7);
                                    t.insert(18);
                                    t.insert(3);
                                    t.insert(5);
                                    t.insert(16);
                                    t.insert(4);
                                    t.insert(20);
                                    t.insert(17);
                                    t.insert(9);
                                    t.insert(14);
                                    t.insert(5);
                                    t.inorder(t.root);
                                    input.close();
                                    }
    
}
class node
{
   public int data;
   public node lchild;
   public node rchild;
   public node(int d)
          {
            data=d;
          }
    public void displaynode()
           {
            System.out.println(data+" ");
           }
}
class tree
{
    node root;
    public void insert(int d)
          {
            node nl=new node(d);
            if (root==null)
               {
                root=nl;
               }
            else 
                {
                    node lroot=root;
                    node parent=root;
                    while(true)
                        {
                            if (d>=lroot.data)
                               {
                                parent=lroot;
                                lroot=lroot.rchild;
                                if (lroot==null)
                                  {
                                    parent.rchild=nl;
                                    return;
                                  }
                               }
                            else if(d<lroot.data)
                               {
                                parent=lroot;
                                lroot=lroot.lchild;
                                if (lroot==null)
                                  {
                                    parent.lchild=nl;
                                    return;
                                  }
                               }
                        }
                }
          }
    public void inorder(node lroot)
           {
            if (lroot!=null)
            {
            inorder(lroot.lchild);
            lroot.displaynode();
            inorder(lroot.rchild);
            }
            else 
                 return;
           }
           
}