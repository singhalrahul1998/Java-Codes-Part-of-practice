import java.util.*;
import java.io.*;
class ChefBit
{
	public static void main(String vdfvd[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			long x=obj.nextLong();
			long y=obj.nextLong();
			long l=obj.nextLong();
			long r=obj.nextLong();
			long max=Integer.MIN_VALUE;
			long z=Integer.MAX_VALUE;
			long res = 0; 
			if(l>0)
			{
			for (long k = l; k >= 1; k--) 
			{ 
				if ((k & (k - 1)) == 0) 
				{ 
                  res = k; 
					break; 
				} 
			} 
			}
			if(l==0)
				res=1;
			while(2*res-1<=r)
			{
				if((x&(2*res-1))*(y&(2*res-1))>=max)
				{
					max=(x&(2*res-1))*(y&(2*res-1));
						z=2*res-1;
				}
				res=2*res;
			}
			System.out.println(z);
		}
	}
}