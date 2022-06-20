import java.util.Scanner;

class ArrayArgument
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Xyz obj = new Xyz();

        int x[],size,i;

        System.out.println("Enter size of an array :");
        size=sc.nextInt();

        x=new int[size];

        System.out.println("Enter elements in array");

        for(i=0;i<size;i++)
        {
            x[i]=sc.nextInt();
        }

        obj.show(x);

        System.out.println("List after sort");

        for(int a : x)
        {
            System.out.println(""+a);
        }
        

    }
}


class Xyz
{
    public int show(int y[])
    {
        int i,j,temp;

        for(i=0;i<y.length;i++)
        {
            for(j=0;j<y.length;j++)
            {
                if(y[i]>y[j])
                {
                    temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
        }
        return y;

    }
}
