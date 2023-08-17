
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        
        //int rows=mat.length;
        //int columns=mat[1].length;
        // if(rows==0 && columns==0)
        // {
        //     return;
        // }
        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum=sum+mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}

}