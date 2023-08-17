import java.util.*;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int j;
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.print("*");
            int k;
            for(k=n;k>=1;k--)
            {
                if(i!=k)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("*");
                }
            }
            
            System.out.println();
            
        }
		
	}	


}
