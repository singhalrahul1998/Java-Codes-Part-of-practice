import java.util.*;
class Subalgo
{
	public static void main(String dvd[])
	{
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int a=obj.nextInt();
		if(a==0)
			System.out.print(n);
		else
			if(n==0)
				System.out.println(0);
			else
			{
				while(a>0)
				{
					if(n==0)
					{
						break;
					}
					if(n%10 ==0)
					{
						n=n/10;
						a--;
					}
					else
					{
						a--;
						n=n-1;
					}
				}
				System.out.print(n);
			}
	}
	
}