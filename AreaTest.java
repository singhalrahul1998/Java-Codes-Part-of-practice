class Area
{
	double w,h;
       double area()
        {
		return w*h;	
	}
      double area(double a,double b)
	{
		return a*b;	
	}
}
class AreaTest
{
	public static void main(String qwe[])
	{	try
		{
		double a,b,ans;
		Area r1=new Area();
		System.out.println("Enter the first parameter");
		a=Double.parseDouble(qwe[0]);
		System.out.println("Enter the second parameter");
		b=Double.parseDouble(qwe[1]);
		ans=r1.area(a,b);
                System.out.println(ans);
		System.out.println("BYE");
                }
		finally
		{
			System.out.println("PEACE");
			System.out.println("THANK YOU");
		}		
	}
}