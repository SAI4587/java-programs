import java.util.Scanner;
class Q3{
                       public static void main(String[] args) {
                            Scanner input = new Scanner(System.in);
                            singlelinkedlist l1=new singlelinkedlist();
                            System.out.println("Enter no .of elements :");
                            int n=input.nextInt();
                            System.out.println("Enter the elements:");
                            for (int i=0;i<n;i++)
                                {
                                    int temp=input.nextInt();
                                    l1.insertlast(temp);
                                }
                            System.out.println("1st list is");
                            l1.displaylist();
                            System.out.println(" ");
                            singlelinkedlist l2=new singlelinkedlist();
                            System.out.println("Enter no .of elements :");
                            int m=input.nextInt();
                            System.out.println("Enter the elements:");
                            for (int i=0;i<m;i++)
                                {
                                    int temp=input.nextInt();
                                    l2.insertlast(temp);
                                }
                            System.out.println("2nd list is");
                            l2.displaylist();
                            System.out.println(" ");
                            
                            System.out.println("Union without common elements");
                            singlelinkedlist union=new singlelinkedlist();
                            singlelinkedlist union_new = new singlelinkedlist();
                            unionLink(l1, l2).displaylist();
                            System.out.println();

                            singlelinkedlist intersect=new singlelinkedlist();
                            l1.temp=l1.first;
                            l2.temp=l2.first;
                            while (l1.temp!=null && l2.temp!=null)
                                  {
                                    if (l1.temp.data==l2.temp.data)
                                       {
                                        union.insertlast(l1.temp.data);
                                       }
                                    else if (l1.temp.data!=l2.temp.data)
                                    {
                                    union.insertlast(l1.temp.data);
                                    union.insertlast(l2.temp.data);
                                    }                              
                                    else if (l1.temp==null) 
                                           {
                                            while(l2.temp!=null)
                                                 {
                                                  union.insertlast(l2.temp.data);
                                                  l2.temp=l2.temp.next;
                                                 } 
                                           }  
                                    else if (l2.temp==null) 
                                           {
                                            while(l1.temp!=null)
                                                 {
                                                  union.insertlast(l1.temp.data);
                                                  l1.temp=l1.temp.next;
                                                 } 
                                           }  
                                    l1.temp=l1.temp.next;
                                    l2.temp=l2.temp.next; 
                                  }
                                  System.out.println("union of l1 and l2 is ");
                                  union.displaylist();
                                  System.out.println(" ");
                                  l1.temp=l1.first;
                                  l2.temp=l2.first;
                                  while (l1.temp!=null)
                                  {
                                  while(l2.temp!=null)
                                       {
                                        if (l1.temp.data==l2.temp.data)
                                           intersect.insertlast(l1.temp.data);
                                        l2.temp=l2.temp.next;
                                       }
                                  l1.temp=l1.temp.next;
                                  l2.temp=l2.first;
                                  }
                                  System.out.println("intersection of l1 and l2 is ");
                                  intersect.displaylist();
                            input.close();
                       }
                    static singlelinkedlist unionLink(singlelinkedlist l1, singlelinkedlist l2) {
                        link temp = l1.first;
                        singlelinkedlist result = new singlelinkedlist();
                        while(temp != null) {
                            link temp_result = result.first;
                            boolean copy = false;

                            while (temp_result != null) {
                                if (temp.data == temp_result.data) { // data already there in union
                                    copy = true;
                                    break;
                                }
                                temp_result = temp_result.next;
                            }
                            if (!copy) {
                                result.insertlast(temp.data);
                                copy = false;
                            }
                            temp = temp.next;
                        }
                        temp = l2.first; // same but for the second list
                        while(temp != null) {
                            link temp_result = result.first;
                            boolean copy = false;

                            while (temp_result != null) {
                                if (temp.data == temp_result.data) { // data already there in union
                                    copy = true;
                                    break;
                                }
                                temp_result = temp_result.next;
                            }
                            if (!copy) {
                                result.insertlast(temp.data);
                                copy = false;
                            }
                            temp = temp.next;
                        }
                        return result;
                    }
                    }
                    
class link
{
    int data;
    link next;
    public link(int d)
           {
             data=d;
           }
    public void displaylink()
          {
            System.out.print(data+" ");
          }
}
class singlelinkedlist
     {
        link first=null;
        link last=null;
        link temp=null;
        public void insertlast(int d)
              {
                link nl=new link(d);
                if (first==null)
                   {
                     first=nl;
                     last=nl;
                   }
                else
                    {
                        last.next=nl;
                        last=nl;
                    }
              }
        public void displaylist()
            {
                link current=first;
                while(current!=null)
                     {
                        current.displaylink();
                        current=current.next;
                     }
            }
     }
