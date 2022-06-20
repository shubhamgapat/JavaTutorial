
/*
          Abstract Classes
 
      1] They are declared using keyword abstract
      2] Can not be instantiated
      3] It can contain constructor, abstract methods & non-abstract methods
      4] They are mostly super-classes. 

               Abstract Methods

      1] They are declared using keyword abstract.
      2] Must be declared inside abstract class.
      3] They do not have implementation code. 
      4] Must be overriden in non-abstract sub classes.   

              Final Classes
      1] They are declared using keyword final.
      2] They can not be inherited.
      3] They are mostly sub-classes. 

              Final Methods
 
     1] They are declared using keyword final.
     2] can not be overridden.  
*/

      abstract class A
      {
          public A()
          {
             System.out.println("\n Const class A ");
          } 
 
          public void show()
          {

          }

             public abstract void add(int a, int b);
      }

      class B extends A
      {
          public final void add(int a, int b)
          {

          }
      }

      class C extends B
      {
          public void add(int a, int b)
          {

          }
      } 

    public class AbstractDemo
    {
         public static void main(String [] args)
         { 
             A obj;       
         }
    }
