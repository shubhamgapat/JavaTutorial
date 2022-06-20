
     interface Compute 
     {
          public void calcArea(double d);
     }

     class Circle implements Compute
     {
          public void calcArea(double r)
          {
              double ans = Math.PI * Math.pow(r, 2);
              System.out.println("\n Area of circle = "+ans);   
          }
     }

     class Square implements Compute
     {
          public void calcArea(double s)
          {
              double ans = Math.pow(s, 2);
              System.out.println("\n Area of square = "+ans);   
          }
     }

    public class InterfaceDemo2
    {
         public static void main(String [] args)
         { 
              Circle c = new Circle();
              Square s = new Square();

                 Compute obj;

                obj = c;
                obj.calcArea(1);

                obj = s;
                obj.calcArea(2);       
         }
    }
