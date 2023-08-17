
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int n=str.length();
        char output=' ';
        int count=0;
        int max=-1;
        int arr[] =new int[256];
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            arr[ch]+=1;
        }
        for(int j=0;j<n;j++)
        {
            char ch=str.charAt(j);
            if(arr[ch]>max)
            {
                max=arr[ch];
                output=ch;
            }
        }
        return output;
	}

}