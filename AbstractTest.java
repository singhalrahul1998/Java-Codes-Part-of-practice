abstract class TwoD
{
   abstract double area();
   abstract double peri();          
}
abstract class ThreeD extends TwoD
{
   abstract double volume();
}
class TwoDe
{
    double w=1,h=1;
    double area()
    {
        // this.w=w;
        // this.h=h;
         return w*h;
    }	
    double peri()
    {
	return 2*(w+h);
    }
}
class ThreeDe extends ThreeD
{   double l=1;
    double volume()
    {
         return w*h*l;    
    }
}
class AbstractTest
{
	public static void main(String dsf[])
       {
           ThreeD p;
           ThreeDe obj = new ThreeDe();
           p = obj;
           System.out.println(p.area());
           System.out.println(p.peri());
           System.out.println(p.volume());
       }

}