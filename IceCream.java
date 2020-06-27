import java.util.*;
class IceCream
{
	public static void main(String dvvd[])
	{
		Scanner obj= new Scanner(System.in);
		int t=obj.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=obj.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i]=obj.nextInt();
			int count5=0,count10=0,i=0;
			for(i=0;i<n;i++)
			{
				if(a[i]==5)
				{
					count5++;
					continue;
				}
				if(a[i]==10)
				{
					if(count5>=1)
					{
						count5--;
						count10++;
					}
					else{
						System.out.println("NO");
						break;
					}
				}
				if(a[i]==15)
				{
					if(count10>=1)
					{
						count10--;
						continue;
					}
					if(count5>=2)
					{
						count5=count5-2;
						continue;
					}
					else{
						System.out.println("NO");
						break;
					}
				}
			}
			if(i==n)
				System.out.println("YES");
		}
	}
}