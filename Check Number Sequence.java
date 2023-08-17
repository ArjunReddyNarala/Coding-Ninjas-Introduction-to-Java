import java.util.*;
public class Main {
	
    public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
    int N = s.nextInt();
    
    
    int[] a= new int[N];
    for (int i =0; i<N;i++)
    {
        a[i]= s.nextInt();
    }
    int [] A= new int [N-1];

    for ( int i =0;i<N-1;i++)
    {
        if ( a[i]==a[i+1])
        {
            System.out.println("false");
			return ;
        }
        A[i]= a[i] -a[i+1];
    }
    int i =0;
    while (i<N-2)
    {
        if (A[i]<0 && A[i+1]>0)
        {
            System.out.println("false");
			return ;
        }
    	i++;
    }
   	System.out.println("true");


}
// 	public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int N = s.nextInt();
//         int i;
//         int[] array = new int[50];
//         for(i=0;i<N;i++)
//         {
//             array[i]=s.nextInt(); 
//         }
//         int previous , current ;
//         i=0;
//         while(i<N)
//         {
//             boolean isDec = true;
//             previous = array[i];
//             current = array[i+1];
//             if(current>previous)
//             {
//                 isDec = false ; 
//             }
//             else if(previous == current)
//             {
//                 System.out.print("false");
//                 break;
//             }
//             else
//             {
//                 if(isDec==false)
//                 {
//                     System.out.print("false");
//                 }
                
//             }
//             i++;
//             if(isDec == true)
//             {
//                 System.out.print("true");
//                 break;
//             }
//         }
        
	

// 	}
}
