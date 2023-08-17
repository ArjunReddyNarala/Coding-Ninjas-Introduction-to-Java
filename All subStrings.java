
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            int start=i;
           // int end=start;
            for(int end=start;end<=n;end++)
            {
                System.out.println(str.substring(start,end));
               // start++;
            }
        }
	}

}