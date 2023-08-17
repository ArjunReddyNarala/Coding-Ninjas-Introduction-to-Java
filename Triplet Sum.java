
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int n=arr.length;
        int count=0,y=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    y=arr[i]+arr[j]+arr[k];
                    if(y==x)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}