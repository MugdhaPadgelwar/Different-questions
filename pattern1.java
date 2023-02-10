public class pattern1 {
    public static void main(String[] args)
    {
          //pattern(4);
          pattern4(5);
    }
    public static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
