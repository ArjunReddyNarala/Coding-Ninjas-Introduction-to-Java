
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        int n=str.length();
        String output="";
        output = output + str.charAt(0);
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i)!=output.charAt(j))
            {
                output = output + str.charAt(i);
                j++;
            }
        }
        return output;
	}

}