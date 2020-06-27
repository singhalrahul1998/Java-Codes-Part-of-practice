import java.util.*;
class SubArrays
{
  public static void main(String sdfvb[])
  {
    Scanner obj = new Scanner(System.in);
    int i=0,j=0,k=0,count=0;
    int t=obj.nextInt();
    int a[] = new int [t];
    for(int p=0;p<t;p++)
    {
      a[p]=obj.nextInt();
    }
    for(i=0;i<t;i++) //i=Length of the subarray.
    {
      for(j=0;j<t;j++)
      { 
        int sum=0;
        int mul=1;
         for(k=j;k<=(j+i);k++)
         {
            sum += a[k];
            mul = mul*a[k];
         }
        if(mul==sum)
          count++;
      }
    }
    System.out.println(count);
  }
}