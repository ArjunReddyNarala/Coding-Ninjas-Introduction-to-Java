import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        
        int rem , Evensum=0 , Oddsum=0 ;
        
        while(N>0)
        {
        rem=N%10;
        N=N/10;
        if(rem%2==0)
        {
            Evensum+=rem;
        }
        else
        {
            Oddsum+=rem;
        }
        }
        System.out.println(Evensum + " " + Oddsum);
        
        
        
        

	}
}
