import java.util.*;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        int Celsius;
        while(start<=end)
        {
            Celsius=(((start-32)*5)/9);
            System.out.println(start + " " + Celsius);
            start = start + step;
        }
	}
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
      //  int S,E,W;
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        
        printFahrenheitTable(S,E,W);
        
    }
}