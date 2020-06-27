import java.util.*;

class Star2
{ 

 public static void main(String aguv[])


 {
 
	 int a[][]=new int [4][4];
 
	 //int b[][]=new int [3][3];
  
	 //int c[][]=new int [3][3];
 
  	 int i=0;

         int j=0;
  
	//Scanner obj=new Scanner(System.in);
 
         
 for(i=0;i<4;i++)
          {
		for(j=0;j<(4-i);j++)
                 {
                    System.out.print("*");
                 }
                System.out.println(" ");
          }
 }

}
