
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int n=arr1.length;
        int m=arr2.length;
        int l=0;
        int carry=0;
        if(n>m)
        {
             l=n+1;
        }
        else
        {
             l=m+1;
        }
        if(n==0)
        {
            //output[0]=carry;
            for(int a=0;a<m;a++)
            {
                output[a]=arr2[a];
            }
            //output[0]=carry;
            return;
        }
        if(m==0)
        {
            //output[0]=carry;
            for(int b=0;b<n;b++)
            {
                output[b+1]=arr1[b];
            }
           //output[0]=carry;
            return;
        }
        //int[] ans=new int[l];
        
        int i=n-1;
        int j=m-1;
        int lastdigit=0;
        
        while(i>=0 || j>=0)
        {
             int sum=0;
            // sum=arr[i]+arr[j]+carry;
            // lastdigit=sum
            if(i>=0)
            {
                sum=sum+arr1[i];
                i--;
            }
            if(j>=0)
            {
                sum=sum+arr2[j];
                j--;
            }
            sum=sum+carry;
            lastdigit=sum%10;
            carry=sum/10;
            output[l-1]=lastdigit;
            l--;
        }
        if(carry!=0)
        output[0]=carry;
            
    }

}










