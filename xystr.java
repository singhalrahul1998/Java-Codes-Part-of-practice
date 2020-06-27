import java.util.*;
class xystr
{
	public static void main(String dvv[])
	{
		Scanner obj = new Scanner(System.in);
		int t=obj.nextInt();
		obj.nextLine();
		for(int k=0;k<t;k++)
		{
			String s=obj.nextLine();
			Stack<Character> c = new Stack<Character>();
			c.push(s.charAt(0));
			int count=0;
			for(int i=1;i<s.length();i++)
			{
				if(s.charAt(i)==c.peek())
				{
					c.pop();
					c.push(s.charAt(i));
				}
				else{
					count++;
					c.pop();
					if(i==s.length()-1)
						break;
					c.push(s.charAt(i+1));
					i=i+1;
				}
			}
			System.out.println(count);
		}
	}
}