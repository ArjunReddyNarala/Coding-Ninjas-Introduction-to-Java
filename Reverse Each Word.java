
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        String ans="";
        int n=str.length();
        int currentwordstart=0;
        int i=0;
        
        for(i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
            {
                int currentwordend=i-1;
                String reversedword="";
                for(int j=currentwordstart;j<=currentwordend;j++)
                {
                    reversedword=str.charAt(j) + reversedword;
                }
                ans +=reversedword + " ";
                currentwordstart=i+1;
            }
            
            
        }
                int currentwordend=i-1;
                String reversedword="";
                for(int j=currentwordstart;j<=currentwordend;j++)
                {
                    reversedword=str.charAt(j)+reversedword;
                }
                ans+= reversedword;
        
        return ans;
	}

}