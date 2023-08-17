import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        int x , n;
        x=s.nextInt();
        n=s.nextInt();
        int i , product=1;
        
        for(i=1;i<=n;i++)
        {
            if(n!=0 && x!=0)
            {
                product=product*x;
            }
            else if(x==0 && n!=0)
            {
                product=0;
            }
            else
            {
                product=1;
            }
        }
        System.out.println(product);
        
    }
}