public class Solution{  

    public static int findUnique(int[] arr)
    {
		
        int n=arr.length;
        //boolean isPresent=true;
        int i , y=0 ,count,j;
        
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
            if(count==1)
            {
                y=arr[i];
            }
            
        }
        return y;
    }
}