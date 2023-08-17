
public class Solution {

	public static void spiralPrint(int matrix[][]){
		int n=matrix.length;
        if(n==0) {
            return;
        }
        int m=0;
        if(n>0)
        {
            m=matrix[0].length;
        }
        int count=0;
        int rowstart=0;
        int rowend=n-1;
        int columnstart=0;
        int columnend=m-1;
        while(rowstart <=n && columnstart <= m)
        {
            for(int j=columnstart;j<=columnend;j++)
                
            {   if(count<m*n)
                {
                System.out.print(matrix[rowstart][j]+" ");
                count++;
                }
            }
            rowstart++;
            for(int j=rowstart;j<=rowend;j++)
            {
                if(count<m*n)
                {
                System.out.print(matrix[j][columnend]+" ");
                count++;
                }
            }
            columnend--;
            for(int j=columnend;j>=columnstart;j--)
            {
                if(count<m*n)
                {
                System.out.print(matrix[rowend][j]+" ");
                count++;
                }
            }
            rowend--;
            for(int j=rowend;j>=rowstart;j--)
            {
                if(count<m*n)
                {
                System.out.print(matrix[j][columnstart]+" ");
                count++;
                }
            }
            columnstart++;
        }
        
	}
}




// public class Solution {

// 	public static void spiralPrint(int matrix[][]){
// 		//Your code goes here
//         int rowlen = matrix.length;
//         int collen = 0;
//         if(rowlen>0) {
//             collen = matrix[0].length;
//         }
//         int rs = 0;
//         int cs = 0;
//         int re = rowlen-1;
//         int ce = collen-1;
//         int count = 0;
//         int i = 0;
//         while(count<rowlen*collen) {
//             count++;
//             System.out.print(matrix[rs][cs]+ " ");
//             if(rs==i) {
//                 cs++;
//                 if(cs==ce+1) {
//                     cs--;
//                     rs++;
//                     re = rowlen - (i+1);
//                 }
//             }
//             else if(cs==ce) {
//                 rs++;
//                 if(rs==re+1) {
//                     rs--;
//                     cs--;
//                 }
//             }
//             else if(rs==re) {
//                 cs--;
//                 if(cs==i-1) {
//                     cs++;
//                     rs--;
//                     i++;
//                     re=i;
//                     ce--;
//                 }
//             }
//             else if(cs==i-1) {
//                 rs--;
//                 if(rs==re-i) {
//                     rs++;
//                     cs++;
//                 } 
//             }
//         }   
//     }
// }



// public class Solution {

// 	public static void spiralPrint(int matrix[][]){
// 		//Your code goes here
//         if(matrix.length == 0) {
//             return;
//         }
        
//         int rowStart=0;
//           int rowLength=matrix.length-1;

//           int colStart=0;
//           int colLength = matrix[0].length-1;

//           while(rowStart <= rowLength && colStart <= colLength){

//            for (int i = rowStart; i <= colLength; i++) {
//             System.out.print(matrix[rowStart][i] + " ");
//            }

//            for (int j = rowStart+1; j <= rowLength; j++) {
//             System.out.print(matrix[j][colLength] + " ");
//            }

//            if(rowStart+1 <= rowLength){
//             for (int k = colLength-1; k >= colStart; k--) {
//              System.out.print(matrix[rowLength][k] + " ");
//             }
//            }
//            if(colStart+1 <= colLength){
//             for (int k = rowLength-1; k > rowStart; k--) {
//              System.out.print(matrix[k][colStart] + " ");
//             }
//            }

//            rowStart++;
//            rowLength--;
//            colStart++;
//            colLength--;
//         }
//     }
// }