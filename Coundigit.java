public class Coundigit{
    public static void main(String[] args)
    {
       int ans=count_digit(12345);
       System.out.println(ans);
    }

    public static int count_digit(int n)
    {   
        int x=n;
        int count=0;
        while(x!=0)
        {
            x=x/10;
            count++;
        }
        return count;
    }
}    