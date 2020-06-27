import java.util.*;
class ttuple
{
	public static void main(String vdvd[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int k=0;k<t;k++)
		{
			int p=obj.nextInt();
			int q=obj.nextInt();
			int r=obj.nextInt();
			int a=obj.nextInt();
			int b=obj.nextInt();
			int c=obj.nextInt();
			int count=3;
			if((p==a)&&(q==b)&&(r==c))
			{
				System.out.println("0");
				continue;
			}
			if(((p==a)&&(q==b)) || ((q==b)&&(r==c)) || ((p==a)&&(r==c)))
			{
				System.out.println(count-2);
				continue;
			}
			if(p==a)
			{
				if((q-b == r-c) || ((b/q)==(c/r)))
				{
					System.out.println(count-2);
					continue;
				}
				else
				{
					System.out.println(count-1);
					continue;
				}
			}
			if(q==b)
			{
				if((p-a == r-c) || ((a/p)==(c/r)))
				{
					System.out.println(count-2);
					continue;
				}
				else
				{
					System.out.println(count-1);
					continue;
				}
			}
			if(r==c)
			{
				if((q-b == p-a) || ((b/q)==(a/p)))
				{
					System.out.println(count-2);
					continue;
				}
				else
				{
					System.out.println(count-1);
					continue;
				}
			}
			if(((p-a == r-c) && (r-c == q-b)) || (((a/p)==(c/r)) && ((c/r)==(b/q))))
			{
				System.out.println(count-2);
				continue;
			}
			if((p-a == r-c) || ((a/p)==(c/r)))
			{
				System.out.println(count-1);
				continue;
			}
			if((p-a == q-b) || ((a/p)==(b/q)))
			{
				System.out.println(count-1);
				continue;
			}
			if((q-b == r-c) || ((b/q)==(c/r)))
			{
				System.out.println(count-1);
				continue;
			}
			if(((p*b-a*q)/(a-b))== ((p*c-a*r)/(a-c)))
			{
				System.out.println(count-1);
				continue;
			}
			if(((p*b-a*q)/(p-q))== ((p*c-a*r)/(p-r)))
			{
				System.out.println(count-1);
				continue;
			}
			System.out.println("3");
		}
	}
}