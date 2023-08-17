import java.util.*;
public class Solution {
    
    //static int f(int N)
        
    //{
//         int a=0,b=1,c;
      
//         if(N==0)
//         {
//             return a;
//         }
//         for(int i=2;i<=N;i++)
//         {
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         return b;
        
        
   // }


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int N=s.nextInt();
       // System.out.print(f(N));
        
        int a=0,b=1,c;
      
        if(N==0)
        {
           System.out.print(a) ;
        }
        for(int i=2;i<=N;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(b);
        
        

		
	}

}
