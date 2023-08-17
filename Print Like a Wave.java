
public class Solution {

	public static void wavePrint(int mat[][]){
		
        int n=mat.length;
        //int m=mat[0].length;
        int m=0;
        if(n>1)
        {
            m=mat[0].length;
        }
        for(int j=0;j<m;j++)
        {
            if(j%2==0)
            {
            for(int i=0;i<n;i++)
             {
                System.out.print(mat[i][j]+" ");
             }
            }
            else
            {
                for(int i=n-1;i>=0;i--)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
	}

}