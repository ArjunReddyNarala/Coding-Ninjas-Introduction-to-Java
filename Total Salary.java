import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
    {
         
       /* Scanner s = new Scanner(System.in);
            
        int basic , totalSalary;
        
        basic = s.nextInt();
        
        String str = s.next();
        
        char ch = str.charAt(0);
        
        
       */
        Scanner s = new Scanner (System.in);
        int basicsalary = s.nextInt();
        String str = s.next();
        char ch = str.charAt(0);
        double hra = (basicsalary) * 0.2;
        double da = (basicsalary) * 0.5;
        double pf = (basicsalary) * 0.11;
        
        int allow ;
        
        if(ch==65)
        {
            allow=1700;
        }
        else if(ch==66)
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        
       // totalSalary = ( basic + (basic)/5 + (basic)/2 + allow - (11*(basic)/100 )) ; 
        
        //System.out.println(Math.round(totalSalary));
            
        double  TotalSalary = ( (basicsalary + hra + da + allow) - pf);
        System.out.println(Math.round(TotalSalary));

	}
}
