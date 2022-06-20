   
     import java.io.*; 

    public class BRDemo
    {
         public static void main(String [] args)
         { 
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                      int a,b,ans;
              try
              { 

                 System.out.println("\n Enter 2 nums : ");
                   a = Integer.parseInt(br.readLine());
                   b = Integer.parseInt(br.readLine());
 
                 System.out.println("\n Add = "+(a+b));
               }
               catch(Exception e)
               {}  
         }
    }
