import java.io.*;
import java.lang.*;
public class Slip1_A extends Thread
{
char t;
public void run()
{
for(t = 'A'; t<='Z';t++)
{
System.out.println(""+t);
try
{
Thread.sleep(2000);
}
catch(Exception e){}
}
}
public static void main(String args[])
{
Slip1_A t = new Slip1_A();
t.start();
}
}
