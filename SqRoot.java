import java.util.*;
class SqRoot
{ public static void main(String fefrgb[])
{
  Scanner obj= new Scanner(System.in);
  int t=obj.nextInt();
  int a[]= new int[t];
  for(int i=0;i<t;i++)
  {  a[i]=obj.nextInt();
     if(a[i]==0)   
     System.out.println(a[i]);
     if(a[i]==1)   
     System.out.println(a[i]);
     int p=1,q=1;
     while(q<=a[i])
     {
         p++;
         q=p*p;
     }
     System.out.println(p-1);
  }
}
}