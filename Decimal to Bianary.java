import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        long n= s.nextInt();
        
        // In case of binary to 
        long placevalue=1;
        long binary=0;
        while(n!=0)
        {
            long remainder = n%2;
            n = n/2;
            binary = binary + remainder*placevalue ;
            placevalue = placevalue*10;   
        }
        System.out.print(binary);
        

	}
}