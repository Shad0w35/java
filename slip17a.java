import java.util.*;
class SlipA
{
	public static void main(String args[]) 
	{
		TreeSet<Integer>t =new TreeSet<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++)
		{	
			t.add(sc.nextInt());
		}
		System.out.println("elements in sorted order are");
		System.out.println(t);
		
    }
}