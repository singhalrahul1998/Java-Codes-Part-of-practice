import java.util.*;
class Flow
{ public static void main(String dfb[])
 {
  Scanner obj = new Scanner(System.in);
  int n=obj.nextInt();
  int sum;
  String a[] = new String [n];
  for(int i=0;i<n;i++)
  {
    a[i]=obj.next();
  }
  for(int i=0;i<n;i++)
  { sum=0;
    sum=Integer.parseInt(a[i].substring(0,1))+Integer.parseInt(a[i].substring(a[i].length()-1));
    System.out.println(sum);
  }
 }
}