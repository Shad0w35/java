import java.util.*;
class Slip_B
{
	public static void main(String args[])
	{
		HashMap<String,Object> h = new HashMap<String,Object>();
		int ch;
		System.out.println("1.ADD CITY AND CODE");
		System.out.println("2.REMOVE CITY");
		System.out.println("3.SEARCH CITY AND DISPLAY CODE");
		System.out.println("4.Display ");

		Scanner sc =  new Scanner(System.in);
		
	
	do{

		System.out.println("Enter choice");
		ch=sc.nextInt();
	
		switch(ch)
		{
			case 1 : System.out.println("Enter city and code");
				 String s= sc.next();
				 int c= sc.nextInt();
				 h.put(s,c);
				 break;
			

			case 2 : System.out.println("Enter  city to be removed");
				 String v= sc.next();
				 h.remove(v);
				 break;

			case 3 : System.out.println("Enter city to be searched");
				 String b= sc.next();
		
				Object o=h.get(b);
				System.out.println(o);
				break;
				
			case 4 : System.out.println(h);
				 break;
		
			case 5 : System.exit(0);

			default :System.out.println("Wrong choice .................");
				
		}
	}while(ch!=5);
	}
	
}