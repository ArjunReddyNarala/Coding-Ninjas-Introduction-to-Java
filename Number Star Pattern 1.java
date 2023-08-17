import java.util.*;
public class runner {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int j;
            for(j=n;j>=1;j--)
            {
                if(i!=j)
                {
                    System.out.print(j);
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
