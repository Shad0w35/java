import java.util.*;

public class SlipB extends Thread
{
	String tname;
	
    public SlipB(String str) 
    {
    	tname = str;
    	start();
    }
    
    public void run()
    {
    	try
    	{
    		for(int i = 1 ; i <= 20 ; i++)
    		{
    			double val = Math.random() * 10000;
    			int time = (int)val % 5000;
    			System.out.println("Thread : " + tname + " Sleeping for " + time + " milliSeconds");
    			Thread.sleep(time);
    		}
    		System.out.println ("Thread " + tname + " terminated......");
    	}
    	catch(Exception e){ }
    }
    public static void main (String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print ("Enter Name for Thread : ");
    	String str = sc.next();
    	System.out.println ("Thread Created.....");	
    	SlipB tc = new SlipB(str);
    }
}