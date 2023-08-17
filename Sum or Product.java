import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
         int n=s.nextInt();
         int choice=s.nextInt();
         if(choice==1)
         {
             int i , sum=0;
             for(i=1;i<=n;i++)
             {
                sum=sum+i;
             }
             System.out.print(sum);
         }
         else if(choice==2)
         {
         int j ,product=1;
         for(j=1;j<=n;j++)
         {
         product=product*j;
         }
         System.out.print(product);
         }
         else{
         System.out.print("-1");
         }

	}
}
