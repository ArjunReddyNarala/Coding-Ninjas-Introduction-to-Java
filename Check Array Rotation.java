public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int n=arr.length;
        int i=0;
        while(i+1<n) {
            if(arr[i+1]<arr[i]) {
                return i+1;
            }
            i++;
        }
        
        return 0;
        
//         if(n==0)
//             return 0;
//         int i=0;
//         int count=1;
//         while(i<n)
//         {
// //whenever the i+1 element is smaller than previous one , we will exit out the loop and print count;
//             if(arr[i]<arr[i+1])
//             {
//                 count++;
//                i++;
                
//             }
//            else 
        
//                 break;
//         }
        
         // return count;
    }

}