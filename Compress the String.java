public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        int n=str.length();
        //int count=1;
        String output="";
        output+=str.charAt(0);
        int i=1;
        int count=1;
        for(i=1;i<n;i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
                
            }
            else if(str.charAt(i)!=str.charAt(i-1))
            {
                //output+=str.charAt(i);
                if(count>1)
                {
                    output=output+count;
                    count=1;
                }
                output=output+str.charAt(i);
                
            }
            
        }
        if(count>1)
                {
                    output=output+count;
            //count=1;
                 }
        //int m=output.length();
//         int count=1;
//         while(i<n)
//         {
// //             if(str.charAt(i)==str.charAt(i-1))
// //             {
// //                 count++;
                
// //             }else 
//             {
//                 if(count>1)
//                 {
//                     output=output+count;
//                     count=1;
//                 }
//                 output=output+str.charAt(i);
//             }
//             i++;
//         }
//         if(count>1)
//                 {
//                     output=output+count;
//                     count=1;
//                 }
        return output;
	}

}