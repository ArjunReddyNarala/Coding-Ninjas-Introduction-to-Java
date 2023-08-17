import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        
        int dec =0;
       // int i=1;
        int result=1;
        
        //int temp=n;
        while(n>0)
        {
            
            int rem = n%10;
            n=n/10;
            //int base = 2 ;
            dec = dec+rem*result;
            // for(int power =0;power<i;power++)
            // {
               result = result * 2;
            // }
            // result++;
           // i++;
            
        }
        System.out.print(dec);
        
	}
}
