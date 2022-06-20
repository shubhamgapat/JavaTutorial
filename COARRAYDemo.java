
          import java.util.Scanner;

      class Book
      {
           int bno;
           String bname;
           String publisher;
           float price; 
           int qty;
            
           public void getDetails()
           {
               Scanner s = new Scanner(System.in);

               System.out.println("\n Enter Book No : ");
                   bno = s.nextInt();

               System.out.println("\n Enter Book Name : ");
                   bname = s.nextLine();
                   bname = s.nextLine();

               System.out.println("\n Enter publisher : ");
                   publisher = s.nextLine();
                            
               System.out.println("\n Enter price : ");
                   price = s.nextFloat();
       
               System.out.println("\n Enter Qty : ");
                   qty = s.nextInt();          
           }  

           public void printDetails()
           {
               System.out.println("\n Book No = "+bno);
               System.out.println("\n Book Name = "+bname);
               System.out.println("\n Publisher = "+publisher);
               System.out.println("\n QTY = "+qty);
               System.out.println("\n Price = "+price);       
           }   
      } 

    public class COARRAYDemo
    {
         public static void main(String [] args)
         { 
             Book b [] = new Book[3];
                  int i;

              for(i=0 ; i<3 ; i++)
              {
//                  b[i] = new Book();
                  b[i].getDetails(); 
              }

              for(i=0 ; i<3 ; i++)
              {
                  b[i].printDetails(); 
              }
         }
    }
