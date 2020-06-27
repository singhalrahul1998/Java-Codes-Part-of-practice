import java.util.*;
class CoronaSpread
{
	public static void main(String[] cdvdv)
	{
		try
		{
					Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=obj.nextInt();
			int a[]= new int [n];
			for(int j=0;j<n;j++)
			{
				a[j]=obj.nextInt();
			}
			int count = 1;
			int min=10;
			int max=0;
			for(int j=0;j<n-1;j++)
			{
				if(a[j+1]-a[j]<=2)
					count++;
				else
				{
					if(count<min)
						min=count;
					if(count>max)
						max=count;
					count=1;
				}
			}
			if(count<min)
				min=count;
			if(count>max)
				max=count;
			System.out.print(min);
			System.out.print(" ");
			System.out.print(max);
		}
		}
		catch(Exception e)
		{
			return ;
		}
	}
}