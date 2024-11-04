import java.io.*;
import java.lang.*;
class contol
{
 	static boolean flag = false;
 	void read (int a)
  	{
    	System.out.println ("Reading....");
   	try
    	{
      	Thread.sleep (3000);
    	}
    	catch (InterruptedException e)
    	{
      	e.printStackTrace ();
    	}
    	System.out.println ("Reading completed");
  }
  synchronized void read ()
  {	
    	System.out.println ("Reading....");
    	try
    	{
      	Thread.sleep (3000);
    	}
    	catch (InterruptedException e)
    	{
      	e.printStackTrace ();
    	}
    	System.out.println ("Reading completed");
}    
synchronized void write ()
{
flag = true;
      	System.out.println ("Writing....");
      	try
      	{
	Thread.sleep (50);
      	}
      	catch (InterruptedException e)
      	{
	e.printStackTrace ();
      	}
      	System.out.println ("Writing completed");
      	flag = false;
    	}
  }
class Read extends Thread
{
	contol ob;
      	Read (contol d)
    	{
      	this.ob = d;
      	start ();
    	}
    	public void run ()
    	{
      	if (!contol.flag)
	ob.read (1);
      	else
	ob.read ();
    	}}
class Write extends Thread
{
contol ob;
      	Write (contol c)
    	{
      	this.ob = c;
      	start ();
    	}
    	public void run ()
    	{
      	ob.write ();
    	}
  	}

  public class rwproblem
  {
  	public static void main (String args[]) throws Exception
    	{
      	int ch = 0;
      	contol ob = new contol ();
        	InputStreamReader in= new InputStreamReader (System.in);
      	BufferedReader br = new BufferedReader (in);
      	do
	{
		System.out.println
("\n  MENU  \n1.Read \n2.Write \n3.Exit \n\nEnter your choice:");
	  	ch = Integer.parseInt (br.readLine ());
	  	switch (ch)
	    	{
	    	case 1:
	      		new Read (ob);
	     		break;
		case 2:
new Write (ob);
	      		break;
	      	case 3:
break;
		default:
System.out.println ("Wrong Choice");
	    	}}
      	while (ch != 3);}}
