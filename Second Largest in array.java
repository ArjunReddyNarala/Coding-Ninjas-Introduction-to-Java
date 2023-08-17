public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        int temp=0;
        int L =Integer.MIN_VALUE;
        int S =Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>L)
                {
                    S=L;
                    L=arr[i];
                    
                }
                else if(arr[i]!=L && arr[i]>S)
                {
                    
                    S=arr[i];
                    
                }
                else if(arr[i]==L)
                {
                    L=arr[i];
                    //S =Integer.MIN_VALUE;
                }
            }
    
        return S;
    }

}