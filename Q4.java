import java.util.Scanner;
class Q4{
                       public static void main(String[] args) 
                       {
                         Scanner input=new Scanner(System.in);
                         singlelinkedlist l=new singlelinkedlist();
                         System.out.println("Enter a string");
                         String s=input.nextLine();
                         for (int i=0;i<s.length();i++)
                            {
                              char temp=s.charAt(i);
                              l.insertlast(temp);
                            }
                        System.out.println("Entered string is :");
                        l.displaylist();
                        System.out.println(" ");
                        link current=l.first;
                        link start=null;
                        link end=null;
                        while (current!=null)
                              {
                                if (current.data=='h')
                                  {
                                   start=current;
                                   end=start;
                                   if (end.next.data=='i')
                                      {
                                        end=end.next;
                                        if (end.next.data=='s')
                                           end=end.next;
                                      }
                                  }
                                if (end!=null && start!=null && start!=end)
                                   {
                                    link temp=start;
                                    temp.data='s';
                                    temp=temp.next;
                                    temp.data='h';
                                    temp=temp.next;
                                    temp.data='e';
                                    temp=temp.next;
                                   }
                                current=current.next;                   
                              }
                        System.out.println("modified list =");
                        l.displaylist();
                        input.close();

                       }
        }
class link
{
    char data;
    link next;
    public link(char d)
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
        public void insertlast(char d)
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