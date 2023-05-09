/* Mouse Event Demo */
import java.awt.event.*;
import java.awt.*;
 
public class SlipB extends Frame implements Runnable
{
  	Thread t;
	int cnt;	
	Color c;
   	SlipB()
   	{
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
				Thread.sleep(1000);
				cnt++;
			}
			catch(Exception e){	}			
		};
	}
   	public void paint(Graphics g)
   	{
   		if(cnt % 4 == 0)
   		{
   			g.setColor(Color.RED);
   			g.fillOval(100,100,20,20);   		
   			g.fillOval(130,100,20,20);
   			g.fillOval(160,100,20,20);
   			g.setColor(Color.GREEN);
   			g.fillOval(190,100,20,20);
   		}
   		if(cnt % 4 == 1)
   		{
   			g.setColor(Color.RED);
   			g.fillOval(190,100,20,20);   		
   			g.fillOval(130,100,20,20);
   			g.fillOval(160,100,20,20);
   			g.setColor(Color.GREEN);
   			g.fillOval(100,100,20,20);
   		}
   		if(cnt % 4 == 2)
   		{
   			g.setColor(Color.RED);
   			g.fillOval(100,100,20,20);   		
   			g.fillOval(190,100,20,20);
   			g.fillOval(160,100,20,20);
   			g.setColor(Color.GREEN);
   			g.fillOval(130,100,20,20);
   		}
   		if(cnt % 4 == 3)
   		{
   			g.setColor(Color.RED);
   			g.fillOval(100,100,20,20);   		
   			g.fillOval(130,100,20,20);
   			g.fillOval(190,100,20,20);
   			g.setColor(Color.GREEN);
   			g.fillOval(160,100,20,20);
   		}
   		
   	}
        
  	public static void main(String args[])
  	{
    	SlipB d = new SlipB();
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
