public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String ans="";
        int n=input.length();
        int currentwordstart=0;
        int i=0;
        
        for(i=0;i<n;i++)
        {
            if(input.charAt(i)==' ')
            {
                int currentwordend=i-1;
                String reversedword="";
                for(int j=currentwordstart;j<=currentwordend;j++)
                {
                    reversedword+=input.charAt(j);
                }
                ans =reversedword + " " +ans;
                currentwordstart=i+1;
            }
            
            
        }
                int currentwordend=i-1;
                String reversedword="";
                for(int j=currentwordstart;j<=currentwordend;j++)
                {
                    reversedword+=input.charAt(j);
                }
                ans= reversedword + " " + ans;
        
        return ans;

	}
}
