

       class Abc
       {
           public void add(int a, int b)
           {
                int c;
                c = a+b;
                System.out.println("\n Add = "+c);
           }
       }
    

    public class CO1
    {
         public static void main(String [] args)
         {
              Abc obj = new Abc();
                obj.add(10, 20);
         }
    }