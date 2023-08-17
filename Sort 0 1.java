public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        int left,right;
        left=0;
        right=n-1;
        while(left<right)
        {
            while(arr[left]%2==0 && left<right)
            {
                left++;
            }
            while(arr[right]%2==1 && left<right)
            {
                right--;
            }
            
            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                
                left++;
                right--;
            }
        }
    }
}