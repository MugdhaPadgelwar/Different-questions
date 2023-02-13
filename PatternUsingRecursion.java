import java.util.Arrays;

public class PatternUsingRecursion {
    public static void main(String[] args)
    {
         //pattern2(5, 0);
         int[] arr={3,67,89,1};
         bubble(arr,arr.length-1,0);
         System.out.println(Arrays.toString(arr));
         
    }
    public static void pattern1(int r,int c){
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            pattern1(r, c+1);
        }
        else{
            System.out.println();
            pattern1(r-1, 0);
        }
    
    }

    public static void pattern2(int r,int c)
    {
        if(r==0)
        {
            return;
        }

        if(c<r)
        {
            pattern2(r,c+1);
            System.out.print("*");
        }

        else{
            pattern2(r-1,0);
            
               System.out.println();
            
        }
    }

    public static void bubble(int[] arr,int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
                
            }
            bubble(arr,r,c+1);
            
        }
        else{
            bubble(arr,r-1,0);
        }
    }
    
}
