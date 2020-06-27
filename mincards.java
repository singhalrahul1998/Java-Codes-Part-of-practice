import java.util.*;
class mincards
{
	public static void main(String dcs[])
	{
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		obj.nextLine();
		String s=obj.nextLine();
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
				count++;
		}
		System.out.println(count);
	}
}