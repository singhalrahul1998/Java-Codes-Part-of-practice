import java.util.*;
class ChefLoss
{
	public static void main(String dvdv[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=obj.nextInt();
			int k=obj.nextInt();
			int a[] = new int[n];
			int sum=0;
			for(int j=0;j<n;j++)
			{
				a[j]=obj.nextInt();
				if(a[j]>k)
					sum=sum+(a[j]-k);
			}
			System.out.println(sum);
		}
	}
}