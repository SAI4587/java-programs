import java.util.Scanner;
class treesimple{
                       public static void main(String[] args) 
                       {
                         Scanner input=new Scanner(System.in);
                         tree t=new tree();
                         t.insertroot(5);
                         t.insertleft(4,t.root);
                         t.insertright(7,t.root);
                         t.insertleft(6,t.root.lchild);
                         t.insertright(3,t.root.lchild);
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
    public void insertroot(int d)
           {
            node nl=new node(d);
            root=nl;
           }
    public void insertleft(int d,node p)
           {
              if (p.lchild==null)
                {
                   node nl=new node(d);
                   p.lchild=nl; 
                }
           }
    public void insertright(int d,node p)
           {
              if (p.rchild==null)
                {
                   node nl=new node(d);
                   p.rchild=nl; 
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