
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        int[] arr1=new int[d];
        int i=0;
        int j=0;
        //first we will create one new array and transfer first d elements from arr , and then paste then
        //we will shift sll elements in arr by d spaces and we will paste the new array a
        for(j=0;j<d;j++)
        {
            arr1[j]=arr[i];
            i++;
        }
        for(i=0;i<n-d;i++)
        {
            arr[i]=arr[i+d];
        }
        j=0;
        while(j<d)
        {
            arr[i]=arr1[j];
            i++;
            j++;
        }
           
        
    }

}