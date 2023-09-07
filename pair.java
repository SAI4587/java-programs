import java.util.Scanner;
class pair{
           public static void main(String[] args)
                         {
                            Scanner input = new Scanner(System.in);
                            System.out.println("Enter the no.of elements : ");
                            int n=input.nextInt();

                            int a[]=new int[n];
                            int b[]=new int[30];
                            int sum;
                            int x;
                            int y;
                            int k=0;

                            System.out.println("Enter the elements : ");
                            for (int i=0;i<n;i++)
                                a[i]=input.nextInt();
                            
                            System.out.println("Enter a sum :");
                            sum=input.nextInt();
                            
                            for(int i=0;i<n;i++)
                               {
                                x=a[i];
                                  for (int j=0;j<n;j++)
                                     {
                                        if (x+a[j]==sum)
                                          {
                                           y=a[j];
                                           b[k]=x;
                                           k++;
                                           b[k]=y;
                                           k++;
                                          }
                                     }
                               }

                            System.out.println("the pairs that make the sum "+sum+" is ");
                            for (int i=0;i<k;i=i+2)
                               {
                                System.out.print("("+b[i]+","+b[i+1]+")");
                                System.out.println(" ");
                               }
                            input.close();
                            
                         }
}
