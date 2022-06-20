

        import java.util.Vector; 
         
    public class VectorDemo1
    {
         public static void main(String [] args)
         { 
                Vector v = new Vector();

                   v.add("JAN");
                   v.addElement("FEB");
                   v.addElement("MARCH");
                   v.add(new Integer(123));
                   v.add(new Float(12.34f));

                  v.insertElementAt("APRIL", 3);
                  v.removeElementAt(0);
                  v.remove("MARCH"); 

               for(int i=0 ; i<v.size(); i++)
               {
                  System.out.println(v.elementAt(i));   
               }
   
               for(Object o : v)
               {
                 // System.out.println(o);   
               }

         }
    }
