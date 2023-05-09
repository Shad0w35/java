import java.util.*;

class SlipB
{
	public static void main(String args[])
	{
		
		LinkedList l = new LinkedList();
		
		System.out.println("1.Add element at first");
		System.out.println("2.Delete last ");
		System.out.println("3.Display size");
		
		
		Scanner sc = new Scanner(System.in);
		
		int ch; 
		
		while(true)
		{
			System.out.println("Enter choice");
			ch= sc.nextInt();
			
			
			switch(ch)
			{
				case 1 : System.out.println("Enter element to be added");
							l.addFirst(sc.next());
						System.out.println("Element added");
						break;
				
				
				case 2 : l.removeLast();
						System.out.println("Item removed ");
						break;
						
				case 3 : System.out.println(l);
						break;
						
				default : System.out.println("Wrong choice");
						break;
				
			}
		}
	}
}