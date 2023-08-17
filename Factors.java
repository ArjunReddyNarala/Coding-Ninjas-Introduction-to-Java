import java.util.Scanner;
public class Solution 
{
    
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        int N =s.nextInt();
        int div=2;
        while(div<=N-1)
        {
            if(N%div==0)
            {
                System.out.print(div + " ");
            }
            div++;
            
           
            
            
        }
        
        
    }
}