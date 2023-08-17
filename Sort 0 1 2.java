
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int n=arr.length;
        int[] temp=new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                temp[left]=arr[i];
                left++;
            }
            if(arr[i]==2)
            {
                temp[right]=arr[i];
                right--;
            }
        }
        for(int j=left;j<=right;j++)
        {
            temp[j]=1;
        }
        
        for(int k=0;k<n;k++)
        {
            arr[k]=temp[k];
        }
    }

}