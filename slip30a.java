class myThread extends Thread
{
    Job j;
	
    public myThread(Job j1, String str,int p) 
    {    	
    	super(str);
    	System.out.println ("Started : " + str);
    	this.j = j1;
    	this.setPriority(p);
    	start();
    }
    public void run()
    {
   		j.doJob1(Thread.currentThread().getName());
    }
}

class Job
{
	public void doJob1(String str)
	{
		synchronized (this)
		{
			for(int i = 0 ; i < 5 ; i++)
			{
				System.out.println("Started : " + str);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
			}
		}
	}
}

public class Slip_A
{
	public static synchronized void main (String[] args) 
	{
		Job j = new Job();
		myThread m1 = new myThread(j,"First",3);
		myThread m2 = new myThread(j,"Second",4);
		myThread m3 = new myThread(j,"Third",5);
	}
}
