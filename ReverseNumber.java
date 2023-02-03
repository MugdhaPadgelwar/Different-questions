public class ReverseNumber {
    public static void main(String[] args)
    {
        int ans=Reverse(12345);
        System.out.println(ans);
    }

    public static int Reverse(int n)
    {
        int N=n;
        int reverse=0;

        while(N!=0)
        {
            int digit=N%10;
            reverse=reverse*10+digit;
            N=N/10;
        }
        return reverse;
        
    }
    
}
