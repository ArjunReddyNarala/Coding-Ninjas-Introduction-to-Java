
public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            //we are considering infinity as minimum element and comparing it with array elements
            
            int min=Integer.MAX_VALUE;
            //we cannot swap arr[j] element , so we use index concept 
            int minIndex = -1;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minIndex=j;
                }
                
            }
        //Now we have to swap minimum element with ith element
            
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }   

}