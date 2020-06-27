import java.util.*;
class SameOrder
{
	public static void main(String fvfd[])
	{
		Scanner obj = new Scanner(System.in);
		String s=obj.nextLine();
		s=s.toLowerCase();
		String arr[] = s.split(",");
		int n=arr.length;
		countFreq(arr,n);
	}
	static void countFreq(String arr[], int n)  
    { 
        Map<String, Integer> mp = new HashMap<>(); 
        for (int i = 0; i < n; i++) 
        { 
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1); 
        } 
        for (int i = 0; i < n; i++)  
        { 
            if (mp.get(arr[i]) != -1)  
            { 
                System.out.println(arr[i] + "->" + mp.get(arr[i])); 
                mp.put(arr[i], -1); 
            } 
        } 
    } 
}