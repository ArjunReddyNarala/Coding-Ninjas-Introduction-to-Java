
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int n=str1.length();
        int m=str2.length();
        //int arr[]=new int[256];
        //boolean ispermutation=true;
        if(n!=m)
        {
            return false;
        }
       
        int i=0;
        int arr[]=new int[256];//character frequency array
        while(i<n)
        {
            char ch = str1.charAt(i);
            arr[ch]+=1;
            i++;
            
        }
        int j=0;
        while(j<m)
        {
            char ch=str2.charAt(j);
            arr[ch]-=1;
            j++;
        }
        
        for(int k=0;k<n;k++)
        {
            char ch=str1.charAt(k);
            if(arr[ch]!=0)
            {
                return false;
            }
        }
        return true;
    }
}