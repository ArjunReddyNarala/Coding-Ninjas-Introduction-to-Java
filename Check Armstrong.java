import java.util.*;
public class Main {
	
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0 , rem;
        int count=0;
        
        int N=n;
        while(N>0)
        {
            N=N/10;
            count++;
        }
        int temp=n;
        while(n!=0)
        {
            rem = n%10;
            int i=1 ;
            int power=1 ;
            while(i<=count)
            {
               int base =rem;
               power = power * base ;
               i++;    
            }
            sum = sum + power ;
            
            n=n/10;
        }
        n=temp;
        
        if(sum==n)
        {
            System.out.print("true");
        }
         else
        
            System.out.print("false");
        
	}
}
