import java.awt.event.*;
import java.awt.*;
public class Slip_A extends Frame implements Runnable
{    
  	Thread t;
	String msg;
	int cnt;	
   	Slip_A(String m)
   	{
		msg = m;
		cnt  = 1;
		t = new Thread(this);
		t.start();	
   	}
      	
	public void run()
	{
		while(cnt <= 20)
		{
			try
			{
				repaint();
				if(msg.equals("Hello"))
					msg = "   ";
				else
					msg = "Hello";
				Thread.sleep(1000);
				cnt++;
			}
			catch(Exception e){	}			
		};
	}
   	public void paint(Graphics g)
   	{
		//Color c = new Color(0,200,200);
   		//g.setColor(c);
   		g.drawString(msg,100,100);
   	}
        
  	public static void main(String args[])
  	{
    		Slip_A d = new Slip_A("Hello");
    		d.setSize(300,300);
 	   	d.show();
		try
		{
			for(int i = 1 ; i <= 20 ; i++)
 				Thread.sleep(1000);
		}
		catch(Exception e){}
  	}
}