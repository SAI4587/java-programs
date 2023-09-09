import java.util.Scanner;
class Q5{
                       public static void main(String[] args) 
                       {
                         Scanner input=new Scanner(System.in);
                         singlelinkedlist l=new singlelinkedlist();
                            System.out.println("Enter no .of elements :");
                            int n=input.nextInt();
                            System.out.println("Enter the elements:");
                            for (int i=0;i<n;i++)
                                {
                                    int temp=input.nextInt();
                                    l.insertlast(temp);
                                }
                            System.out.println("1st list is");
                            l.displaylist();

                            link slow=l.first;
                            link fast=l.first.next;
                            while (fast!=null && fast.next!=null)
                                 {
                                  slow=slow.next;
                                  fast=fast.next.next;
                                 }
                            slow=slow.next;
                            link start=slow;
                            link end=l.last;
                            link previous=l.last;
                            while (start!=end && start!=previous)
                                 {
                                  int temp=end.data;
                                  end.data=start.data;
                                  start.data=temp;
                                  start=start.next;
                                  previous=end;
                                  end=end.prev;   
                                 }
                            System.out.println("modified list is :");
                            l.displaylist();
                            input.close();
                       }
                    }
class link
{
    int data;
    link next;
    link prev;
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
                        nl.prev=last;
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