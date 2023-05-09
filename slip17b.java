/*Prg using applet for start,on-off button*/
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="on_off.class" height=400 width=500>
</applet>*/

public class SlipB extends Applet implements Runnable,ActionListener
{
	Thread t;
	Button start,of;
	int flag=1;
	TextField t1;
	int num;
	public void init()
	{
		start=new Button("Start");
		of=new Button("On/Off");
		t1=new TextField(20);
		setLayout(new FlowLayout());
		add(t1);
		add(start);
		add(of);
		t = new Thread(this);
		start.addActionListener(this);
		of.addActionListener(this);
	}
	public void run()
	{
		num=0;
		try
		{
			while(flag==1)
			{
				t1.setText("  "+num);
				num++;
				Thread.sleep(1000);
			}
		}
		catch(Exception e)  
		{
			System.out.println("Excep occ : " + e);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==start)
		{
			try
			{
				start.setEnabled(false);
				t.start();
				of.setLabel("Off");
			}
			catch(Exception e)
			{
				System.out.println("Exc occ : " + e);
			}
		}
		else if(ae.getSource()==of)
		{
			if(of.getLabel()=="On")
			{
				flag=1;
				t.resume();
				t1.setText("Thread Resumed");
				of.setLabel("Off");
			}
			else
			{
				flag=0;
				t.suspend();
				t1.setText("Thread Suspended");
				of.setLabel("On");
			}
		}
	}
}