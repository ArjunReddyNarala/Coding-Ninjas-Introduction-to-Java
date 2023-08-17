import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        
            int n= s.nextInt();
        int i= 1,sum=0;
        int sum1=0;
        while(i<=n)
        {
            sum=sum+i;
            
            int k=1;
            while(k<=i-1)
            {
                
                System.out.print(k + "+");
                k++;
            }
            System.out.println( i + "=" + sum );
            
            i++;
        }
	}
}
