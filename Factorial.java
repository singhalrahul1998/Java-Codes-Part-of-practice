import java.util.*;

class Factorial
{
   public static void main(String arr[])
    
{ Scanner obj=new Scanner(System.in);
    
  System.out.println("Enter the value upto which factoria is required");
    
  int N;
  
     N=obj.nextInt();
   
   int Product=1;
     
  for(int i=1;i<=N;i++)
     
  {
           Product=Product*i;
   
    }
       
 System.out.printf("Factorial of the given no. is %d",Product);

    }
}
