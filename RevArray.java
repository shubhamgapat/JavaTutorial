import java.util.*;

public class RevArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x[],size,i,j;

        System.out.println("Enter size of an array : ");
        size=sc.nextInt();

        x=new int[size];

        System.out.println("Enter elements in array ");

        for(i=0;i<size;i++)
        {
            x[i]=sc.nextInt();
        }
            int temp;
        for(i=0,j=size-1;i<size/2;i++,j--)
        {
        
            
                temp=x[i];
                x[i]=x[j];
                x[j]=temp;
            


        }


        System.out.println("Reverse array ");
        
        for(i=0;i<x.length;i++)
        {
            System.out.println(""+x[i]);
        }
    }

    
}