import java.util.*;
class AreaPeri
{
  public static void main(String df[])
{
  Scanner obj1= new Scanner(System.in);
  //Scanner obj2= new Scanner(System.in);
 // int l,b;
  //l=obj1.nextInt();
 // b=obj2.nextInt();//Done for less memory allocation
  int a[] = new int [2];
  for(int i=0;i<2;i++)
  {
     a[i]=obj1.nextInt();
  }
  int Area=a[0]*a[1];
  int Peri=2*(a[1]+a[0]);
  if(Area>Peri)
   {
     System.out.println("Area");
     System.out.println(Area); 
   }
   else
   {
     System.out.println("Peri");
     System.out.println(Peri);
   }
}
  
}