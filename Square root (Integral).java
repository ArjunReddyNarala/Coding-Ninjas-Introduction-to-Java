import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        
        int n= s.nextInt();
        
        int squareroot = 1;
        int base=1;
        int exponent=1;
        if(n==0)
        {
            System.out.print(n);
        }
        else
        {
        while(n>0)
        {
            if(squareroot<n)
            {
            squareroot = base * exponent ;
            base++;
            exponent++;
            }
            else if(squareroot==n)
            {
                System.out.print(base-1);
                break;
            }
            else
            {
                System.out.print(base-2);
                break;
            }
            
        }
        }

	}
}