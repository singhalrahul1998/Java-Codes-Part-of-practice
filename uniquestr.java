import java.util.*;
class uniquestr
{
	public static void main(String ds[])
	{
		Scanner obj  = new Scanner(System.in);
		String s=obj.nextLine();
		long count=0;
		if(s.contains("c") || s.contains("k"))
			System.out.print(0);
		else
		{
			count++;
			int fromIndex=0;
			int t=0;
			while ((fromIndex = s.indexOf("ff", fromIndex)) != -1 )
			{
				count++;
				fromIndex++;
			}
			while ((t = s.indexOf("gg", t)) != -1 )
			{
				count++;
				t++;
			}
			System.out.print(count%(1000000007));
		}
	}
}