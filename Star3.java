import java.util.*;

class Star3
{ 

 public static void main(String aguv[])


 {
 
	 int a[][]=new int [4][4];
 
	 
 
  	 int i=0;

         int j=0;
  
 
         int k=0;
         
 for(i=0;i<4;i++)
          {
		for(j=0;j<(4-i);j++)
                 {
                    for(k=0;k<(i-j);k++)
                     {  
                         System.out.print(" ");
                        
                     }
                    System.out.print("*");
                 }
                System.out.println(" ");
          }
 }

}
