import java.util.*;
class AppyAndContest
{
  public static void main(String df[])
  { long startTime = System.nanoTime();
    Scanner obj = new Scanner(System.in);
    int t=obj.nextInt();
    //int p=0,q=0,r=0;
    for(int c=0;c<t;c++)
      {
        int n =obj.nextInt();
 	int a =obj.nextInt();
 	int b =obj.nextInt();
 	int k =obj.nextInt();
        int q=0,r=0;
        for(int p=1;p<=n;p++)
          {
             if((p%a == 0)&&(p%b>0))
               q++;
             if((p%b ==0)&&(p%a>0))
               r++;
          }
          if((q+r)>=k)
            System.out.println("win");
           else
	    System.out.println("lose");            
      } long endTime   = System.nanoTime();
long totalTime = endTime - startTime;
System.out.println(totalTime); 
  }
}