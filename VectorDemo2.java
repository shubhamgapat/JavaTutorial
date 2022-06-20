

        import java.util.Vector; 
         
       class Employee
       {
            String name;
            int eid; 

            public Employee(String name , int eid)
            {
                 this.name = name;
                 this.eid = eid;
            } 
 
            public boolean equals(Object o)
            {
                if(o instanceof Employee)
                {
                    Employee obj = (Employee) o;

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
       }


    public class VectorDemo2
    {
         public static void main(String [] args)
         { 
                Vector v = new Vector();

             Employee e1 = new Employee("ABC" , 101);
             Employee e2 = new Employee("ABC" , 101);

                     v.add(e1);

                if(v.contains(e2))
                {
                    System.out.println("\n TRUE ");
                }   
                else  
                {
                    System.out.println("\n FALSE ");
                }                 
         }
    }
