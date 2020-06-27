import java.util.*;
class CacheHit
{
	public static void main(String svsdv[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=obj.nextInt();
			int b=obj.nextInt();
			int m=obj.nextInt();
			int a[]=new int [m];
			for(int i=0;i<m;i++)
			{
				a[i]=obj.nextInt();
			}
			int count=1;
			for(int i=1;i<m;i++)
			{
				if((a[i]/b) != (a[i-1]/b))
					count++;
			}
			System.out.println(count);
		}
	}
}