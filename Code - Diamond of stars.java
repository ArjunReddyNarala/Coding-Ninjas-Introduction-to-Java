import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       
        if(n%2!=0)
        {
            int i=1;
            int n1=((n+1)/2);
            int n2=(n/2);
            
            while(i<=n1)
            {
                int spaces=1;
                while(spaces<=n1-i)
                {
                    System.out.print(' ');
                    spaces++;
                }
                int stars=1;
                while(stars<=2*i-1)
                {
                    System.out.print('*');
                    stars++;
                    
                }
                System.out.println();
                i++;
            }
            
            i=n2;
            while(i>=1)
            {
                int space=1;
                while(space<=n2-i+1)
                {
                    System.out.print(' ');
                    space++;
                }
                int star=1;
                while(star<=2*i-1)
                {
                    System.out.print('*');
                    star++;
                }
                System.out.println();
                i--;
            }
        }
        
        
    }
}