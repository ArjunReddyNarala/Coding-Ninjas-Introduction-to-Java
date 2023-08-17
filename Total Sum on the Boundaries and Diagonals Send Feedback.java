
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int n=mat.length;
        int sum=0;
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        int m=0;
        if(n>0)
        {
           m=mat[0].length;
        }
        int i,j;
        
        for( i=0;i<n;i++)
        {
            for( j=0;j<m;j++)
            {
                
                if(i==j || (i+j)==n-1)
                {
                sum=sum+mat[i][j];
                }
                else if(i==0||j==0||i==n-1||j==m-1)
                {
                     sum=sum+mat[i][j];
                }
            }
        }

        
        System.out.println(sum);
	}

}