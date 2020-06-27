import java.util.*;
class Grades

{
 
 double Marks;
 
   double Mark(double x)
 
  { 
  
      Marks=x;
 
  } 
 
  double percentage()

  {
      return (Marks/500)*100;

  }
 
   String Grade()

  {
   
    if(Marks>400)
   
       //System.out.println("A") ;
 
        return "A";
    if(((300<Marks) && (Marks<=400)))
   
      // System.out.println("B") ;
 
        return "B";
 
    if(((200<Marks) && (Marks<=300)))
     
       //System.out.println("C") ;

        return "C";
    if(((100<Marks) && (Marks<=200)))
   
       //System.out.println("D") ;


        return "D"; 
    if(Marks<=100)
     
       //System.out.println("E") ;


        return "E";
  }

}
 


 class Result
 
{
  
  public static void main(String arr[])
  
  { //double mark;
  
     System.out.println("Enter your markes"); 
  
     Scanner obj1=new Scanner(System.in);
  
     double x=obj1.nextDouble();
  
     Grades obj=new Grades();
 
     double mark=obj.Mark(x);
   
     double per;
 
     per=obj.percentage();
 

     char grade;
   
     //grade=obj.Grade();
 
     System.out.println("Your percentage is " + per);
   
     System.out.println("and your respective Grade is " +obj.Grade());    

   }


 }
 

    

