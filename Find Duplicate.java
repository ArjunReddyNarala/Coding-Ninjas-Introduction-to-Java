
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int count,i,j,y=0;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==2)
            {
                y=arr[i];
            }
        }
        return y;
    }
}