import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int spaces=1;
            while(spaces<=n-i)
            {
            System.out.print(' ');
                spaces++;
            }
            int stars=1;
            while(stars<=i)
            {
                System.out.print('*');
                stars++;
            }
            int decstar=i-1;
            while(decstar>=1)
            {
                System.out.print('*');
                decstar--;
                
            }
            System.out.println();
            i++;
            
            
        }
		

		
	}

}
