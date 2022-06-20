

      class Employee
      {
           String ename;
           int eid;
 
          public Employee()
          {
          }

          public Employee(String ename , int eid)
          {
              this.ename = ename;
              this.eid = eid;
          }   

          public boolean equals(Object o)
          {
              if(o instanceof Employee)
              {
                  Employee obj = (Employee)o;
                  
                  if(this.eid == obj.eid)
                  {
                      return true;
                  }
                  else
                  {
                      return false;
                  }
              }
              else
              {
                     return false;
              }
          } 
 
          public int hashCode()
          {
               return eid;
          } 

          public String toString()
          {
               return eid + " "+ename;
          }
      } 

    public class EqualsDemo
    {
         public static void main(String [] args)
         { 
             Employee e1 =  new Employee("ABC" , 101);
             Employee e2 =  new Employee("ABC" , 101);
           
             if(e1.equals(e2))
             {
                 System.out.println("\n EQUAL ");
             }
             else
             {
                 System.out.println("\n NOT EQUAL ");
             }

               String s1 = new String("JAVA");
               String s2 = new String("JAVA");

              System.out.println("\n s1 = "+s1.toString());
              System.out.println("\n e1 = "+e1.toString());

/*
              System.out.println("\n s1 = "+s1.hashCode());
              System.out.println("\n s2 = "+s2.hashCode());

              System.out.println("\n e1 = "+e1.hashCode());
              System.out.println("\n e2 = "+e2.hashCode());
*/


         }
    }
