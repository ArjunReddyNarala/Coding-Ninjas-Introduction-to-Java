
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        int rows=mat.length;
                if(mat.length==0){
                    System.out.println("row "+ "0 "+Integer.MIN_VALUE);
            return;
        }
        
        int cols=mat[0].length;
        int largest1=Integer.MIN_VALUE;
        int largest2=Integer.MIN_VALUE;
        int count1=0,count2=0;
        
        for(int i=0;i<rows;i++)
        {
            int sum1=0;
            for(int j=0;j<cols;j++)
            {
                sum1=sum1+mat[i][j];
            }
            if(sum1>largest1)
            {
                largest1=sum1;
                count1=i;
            }
        }
        
          int m=mat.length;
       int n=0;
        if(m>1)
        {
        n=mat[0].length;
        }
        for(int j=0;j<n;j++)
        {
            int sum2=0;
            for(int i=0;i<m;i++)
            {
                sum2=sum2+mat[i][j];
            }
            if(sum2>largest2)
            {
            largest2=sum2;
                count2=j;
            }
        }
        if(largest1>=largest2)
        {
            System.out.println("row"+ " " + count1 + " "+ largest1 );
        }
        // else if(largest1==largest2)
        // {
        //     System.out.printl("row"+ " " + count1 + " "+ largest1 );
        // }
        else 
        {
            System.out.print("column"+ " " + count2 + " "+ largest2 );
        }
	}

}