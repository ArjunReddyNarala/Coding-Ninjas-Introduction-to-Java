import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
    
        int n=s.nextInt();
        
        int i=1,j;
        
        System.out.println('*');
        while(i<=n)
        {
            System.out.print('*');
            j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            j=i-1;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            i++;
            System.out.print('*');
            System.out.println();
        }
        
        
        i=n-1;
        while(i>=1)
        {
            System.out.print('*');
            j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            j=i-1;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            i--;
            System.out.print('*');
            System.out.println();
        }
        
        System.out.print('*');
        
    }
} 