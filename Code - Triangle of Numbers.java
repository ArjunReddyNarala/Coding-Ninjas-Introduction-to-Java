import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int p=1;
        
        while(i<=n)
        {
            int spaces=1;
            while(spaces<=n-i)
            {
                System.out.print(' ');
                spaces++;
            }
            
            p=i;
            int num=1;
            while(num<=i)
            { 
                System.out.print(p); 
                p++;
                num++;   
            }
            
            int dec=2*i-2;
            while(dec>=i)
            {
                System.out.print(dec);
                dec--;
                
                
            }
            System.out.println();
            i++;
            
        }
	}
}
