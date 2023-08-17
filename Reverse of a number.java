import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        
        int r=0;
        while(n!=0){
            int rem = n%10;
            r = r*10+rem;
            n =n/10;
        }
        System.out.println(r);
//         Scanner s = new Scanner(System.in);
//         int n=s.nextInt();
//         int rem , quo ;
//         int i=1;
        
        
//         if(n==0){
//                 System.out.print(n);
//             }
//         while(n!=0)
//         {
//             rem=n%10;
//             quo=n/10;

//             if(rem!=0)
//             {
//                 System.out.print(rem);
//                 n=quo;
//             }
//             else {
//                 n=quo;
//             }
//             i++;
//         }

	}
}

  // int n;
  //       Scanner sc = new Scanner(System.in);
  //       n = sc.nextInt();
        
        
  //       int r=0;
  //       while(n!=0){
  //           int rem = n%10;
  //           r = r*10+rem;
  //           n =n/10;
  //       }
  //       System.out.println(r);
