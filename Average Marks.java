import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
        int m1 , m2 , m3 , avg ;
            
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        
        char ch = str.charAt(0);
        
        System.out.println(ch);
        
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        
        avg = (m1+m2+m3)/3 ;
        
        System.out.println(avg);
        
        
        

		
	}

}
