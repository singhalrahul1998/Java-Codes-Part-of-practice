import java.util.*;
class evenm
{
	public static void main(String dvdv[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=obj.nextInt();
			if(n%2==1)
			{
				for(int k=0;k<n;k++)
				{
					for(int j=0;j<n;j++)
					{
						if(j==n-1)
							System.out.print(n*k+j+1);
						else
							System.out.print(n*k+j+1 +" ");
					}
					System.out.println();
				}
			}
			else
			{
				for(int k=0;k<n;k++)
				{
					if(k%2==0)
					{
						for(int j=0;j<n;j++)
						{
							if(j==n-1)
								System.out.print(n*k+j+1);
							else
								System.out.print(n*k+j+1 +" ");
						}
					}
					else
					{
						for(int j=n;j>0;j--)
						{
							if(j==1)
								System.out.print(n*k+j);
							else
								System.out.print(n*k+j +" ");
						}
					}
					System.out.println();
				}
			}
		}
	}
}