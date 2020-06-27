
import java.util.*;
import java.text.*;
class GrossSalary
{
	public static void main(String fgyhj[])
	{
		Scanner obj = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("#.##");

		int N = obj.nextInt();
		int a[] = new int [N];
		int i,j;
		double Gross;
		for(i=0;i<N;i++)
		{
			a[i] = obj.nextInt();		
		}  
		for(i=0;i<N;i++)
		{
			if(a[i]<1500)
			{
				Gross = 2*a[i];
			}
			else
				Gross = 1.98*a[i]+500;
			System.out.println(df2.format(Gross));
		}   
		   
	}
}