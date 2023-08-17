
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        // int check=0;
        // if(n%2==0)
        //     check=1;
        // else
        //     check=0;
        
        int t=n;
        // if(check==1)
        //     t=t-1;
        
        int index = 0;
        for(int i=1;i<=t;i=i+2)
        {
            //System.out.print(i+" ");
            arr[index] = i;
            index++;
        }
        //t = n;
        if(n%2 != 0)
            t = t-1;
        for(int i=t;i>1;i=i-2)
        {
            //System.out.print(i+" ");
            arr[index] = i;
            index++;
        }
        //return;
        
    }
}