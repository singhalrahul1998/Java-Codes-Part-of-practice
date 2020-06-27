import java.util.*;

class Star4
{ 

 public static void main(String aguv[])


 {
 
	 int a[][]=new int [4][7];
 
  	 int i=0;

         //int j=0;
  
         //int k=0;
         
 for(i=0;i<4;i++)
          {
		//for(j=0;j<7;j++)
                // {
                    for(int k=1;k<=(3-i);k++)
                       {System.out.print(" ");}
                    for(int k=1;k<=(2*i+1);k++) 
                      {System.out.print("*");} 
                    for(int k=1;k<=(3-i);k++)
                      {System.out.print(" ");}                  
                 //}
                System.out.println(" ");
          }
 }

}
