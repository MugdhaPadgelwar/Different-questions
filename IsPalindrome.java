public class IsPalindrome {
    public static void main(String[] args)
    {
       int n=1234321;
       int reversed=check(n);
       if(n==reversed)
       {
        System.out.println("The input is palindrome");
       }
       else{
        System.out.println("The input is not palindrome");
       }
    }

    public static int check(int n)
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
