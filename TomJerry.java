import java.util.*;
class TomJerry
{
	public static void main(String dssd[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			long ts = obj.nextLong();
			if(ts%2 ==1)
			{
				System.out.println(ts/2);
                continue;
			}
			long count=0;
			long p=(ts & (~(ts - 1)));
			long q=p*2;
			/*long r=1;
			for(long k=q;k<ts;k=q*r)
			{
				r++;
				count++;
			}*/
			count=ts/q;
			System.out.println(count);
		}
	}
	/*public static long ans(long n) 
	{ 
    return (n & (~(n - 1))); 
	}*/
	/*public static int ans(long ts,long k)
	{
		if(k%2==1)
			return 0;
		if(ts%2 ==1)
			return 1;
		return ans(ts/2,k/2);
	}*/
}