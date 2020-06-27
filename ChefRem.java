import java.util.*;

class ChefRem
{
 public static void main(String d[])
 {
   Scanner obj = new Scanner(System.in);
   int n=obj.nextInt();
  // for(int i=0;i<n;i++)
   while(n>0)
   { n--;
    int a=obj.nextInt();
    int b=obj.nextInt();
     if(a>b)
        System.out.print(a);
     else
        System.out.print(b);
     System.out.print(" ");
     
     System.out.print(a+b);
     
   }
 
 }
}