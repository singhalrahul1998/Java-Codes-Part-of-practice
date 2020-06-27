import java.util.*;
class TotalExpense
{
  public static void main(String ssdfg[])
  {
    Scanner obj= new Scanner(System.in);
    int t=obj.nextInt();
    int qua,price;
    for(int i=0;i<t;t++)
    {
       qua = obj.nextInt();
       price = obj.nextInt();
      if(qua>1000)
       {
          System.out.println(0.9*qua*price);
       }
       else 
          System.out.println(qua*price);
      if(i==(t-1))
         return;
    }
  }
}