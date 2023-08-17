import java.util.*;

public class Main {
	
	public static void main(String[] args) 
    {
        
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int n=1;
        for(int i=1;n<=x;i++)
        { 
            int y = 3*i+2;
            if(y%4!=0)
            {
                System.out.print(y+" ");
                 n++;
            }   
        }
        
    }
}
