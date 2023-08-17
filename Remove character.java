
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {

        int n=str.length();
        String output="";
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=ch)
            {
                output=output+str.charAt(i);
            }
        }
    
        return output;
	}

}