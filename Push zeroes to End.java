public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int n =arr.length;
        int i=0;
        int k=0;
        
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[k]=arr[i];
                k++;
            }
        }
            while(k<n)
            {
                arr[k++]=0;
            }
            
        
//         while(k<n)
//         {
//             while(arr[i]!=0)
//             {
//                 i++;
//                 k++;
//             }
//             while(arr[i]==0)
//             {
//                 i++;
//             }
//             if(k<n)
//             {
//                 int temp=arr[k];
//                 arr[k]=arr[i];
//                 arr[i]=temp;
                
//                 i++;
//                 k++;
//             }
            
//         }
        //int k=n;
//         while()
//         {
//             int[] temp =new int[k];
//             if(arr[i]!=0)
//             {
//                 temp[j]=arr[i];
//                 i++;
//                 j++;
//             }
//             else
//             {
//                 temp[k]=arr[i];
//                 i++;
//                 k--;
//             }
                
//         }
//         int left=0;
//         int right=n-1;
//         while(left<right)
//         {
//             while(arr[left]!=0 && left<right)
//             {
//                 left++;
//             }
//             while(arr[right]==0 && left<right)
//             {
//                 right--;
//             }
//             if(left<right)
//             {
//                 int temp=arr[left];
//                 arr[left]=arr[left+1];
//                 arr[right]=temp;
                
//                 left++;
//                 right--;
//             }
//         }
    }

}