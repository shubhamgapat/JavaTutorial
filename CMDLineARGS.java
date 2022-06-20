 

    public class CMDLineARGS
    {
         public static void main(String ... args)
         { 
               int a = Integer.parseInt(args[0]);
               int b = Integer.parseInt(args[1]);

              System.out.println("\n\n Add = "+(a+b)); 
         }
    }


/*
 Compile -     javac CMDLineARGS.java
 Run -         java CMDLineARGS 10 20
*/