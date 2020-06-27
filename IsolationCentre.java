import java.util.*;
class IsolationCentre
{
	public static void main(String dcw[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++)
		{
			int f=obj.nextInt();
			int q=obj.nextInt();
			obj.nextLine();
			String s = obj.nextLine(); 
			for(int j=0;j<q;j++)
			{
				int c=obj.nextInt();
				int p=0,n=f;
				//String a=s;
				int a[] = new int [26];
				for(int k=0;k<s.length();k++)
				{
					a[s.charAt(k)-'a']++;
				}
				for(int k=0;k<26;k++)
				{
					if(a[k]>c)
						p=p+(a[k]-c);
				}
				System.out.println(p);
			}
		}
	}
}