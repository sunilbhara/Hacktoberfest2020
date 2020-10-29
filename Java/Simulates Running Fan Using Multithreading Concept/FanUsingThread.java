import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JPanel;
import javax.swing.Timer;

public class FanUsingThread extends JPanel implements Runnable
{
	private int xCenter;
	private int yCenter;
	private int fanRadius;
	private int bladeLength;
	private int angle;
	private int rotation;
	private int speed;
	private Thread thread;
	Lock lock;
	Condition resume;
	private boolean isResume;
	
	
	// Default constructor
	// initializes the instances to default value, create thread object and start the thread 
	// when event occurred
	
	public FanUsingThread ()
	{
		thread =  new Thread (this);
		lock  = new ReentrantLock ();
		resume = lock.newCondition ();
		this.angle = 100;
		this.rotation = 1;
		this.speed = 100;
		this.isResume = true;
		thread.start ();
	}
	
	
	// Method to start the fan using thread when this method is invoked
	
	public void resume ()
	{
		lock.lock ();
		isResume = false;
		resume.signalAll ();
		lock.unlock ();
	}
	
	
	// Method to stop the fan using thread when this method is invoked
	
	public void suspend ()
	{
		lock.lock ();
		isResume = true;
		lock.unlock ();
	}
	
	
	// Method to reverse the fan when this method is invoked
	
	public void reverse ()
	{
		rotation = - rotation;
	}
	
	
	// Method to set the fan speed based on the speed specified in the argument
	
	
	public void setSpeed (int speed)
	{
		this.speed = speed;
	}
	
	
	// Method that draw five fan which contains a blade inside an oval on a component
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		// Draw first fan
		
		xCenter = (int)(getBounds ().width / 4);
		yCenter = (int)(getBounds ().height / 5);
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.2);
		
		bladeLength = (int)(fanRadius * 0.9);
		
		angle = (angle + rotation) % 360;
		
		g.setColor (Color.BLACK);
		g.drawOval (xCenter - fanRadius, yCenter - fanRadius, 
				2 * fanRadius, 2 * fanRadius);

		for (int i = 0; i <= 270; i = i + 90)
		{
			g.setColor(Color.RED);
			g.fillArc(xCenter - bladeLength, yCenter - bladeLength, 
					2 * bladeLength, 2 * bladeLength, angle + i, 30);
		}
		
		// Draw second fan
		
		xCenter = (int)(getBounds ().width / 1.3);
		yCenter = (int)(getBounds ().height / 5);
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.2);
		
		bladeLength = (int)(fanRadius * 0.9);
		
		angle = (angle + rotation) % 360;
		
		g.setColor (Color.BLACK);
		g.drawOval (xCenter - fanRadius, yCenter - fanRadius, 
				2 * fanRadius, 2 * fanRadius);

		for (int i = 0; i <= 270; i = i + 90)
		{
			g.setColor(Color.RED);
			g.fillArc(xCenter - bladeLength, yCenter - bladeLength, 
					2 * bladeLength, 2 * bladeLength, angle + i, 30);
		}
	
		// Draw third fan
		
		xCenter = (int)(getBounds ().width / 2);
		yCenter = (int)(getBounds ().height / 2.05);
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.2);
		
		bladeLength = (int)(fanRadius * 0.9);
		
		angle = (angle + rotation) % 360;
		
		g.setColor (Color.BLACK);
		g.drawOval (xCenter - fanRadius, yCenter - fanRadius, 
				2 * fanRadius, 2 * fanRadius);

		for (int i = 0; i <= 270; i = i + 90)
		{
			g.setColor(Color.RED);
			g.fillArc(xCenter - bladeLength, yCenter - bladeLength, 
					2 * bladeLength, 2 * bladeLength, angle + i, 30);
		}
		
		// Draw fourth fan
		
		xCenter = (int)(getBounds ().width / 1.3);
		yCenter = (int)(getBounds ().height / 1.3);
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.2);
		
		bladeLength = (int)(fanRadius * 0.9);
		
		angle = (angle + rotation) % 360;
		
		g.setColor (Color.BLACK);
		g.drawOval (xCenter - fanRadius, yCenter - fanRadius, 
				2 * fanRadius, 2 * fanRadius);

		for (int i = 0; i <= 270; i = i + 90)
		{
			g.setColor(Color.RED);
			g.fillArc(xCenter - bladeLength, yCenter - bladeLength, 
					2 * bladeLength, 2 * bladeLength, angle + i, 30);
		}
		
		// Draw fifth fan
		
		xCenter = (int)(getBounds ().width / 4);
		yCenter = (int)(getBounds ().height / 1.3);
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.2);
		
		bladeLength = (int)(fanRadius * 0.9);
		
		angle = (angle + rotation) % 360;
		
		g.setColor (Color.BLACK);
		g.drawOval (xCenter - fanRadius, yCenter - fanRadius, 
				2 * fanRadius, 2 * fanRadius);

		for (int i = 0; i <= 270; i = i + 90)
		{
			g.setColor(Color.RED);
			g.fillArc(xCenter - bladeLength, yCenter - bladeLength, 
					2 * bladeLength, 2 * bladeLength, angle + i, 30);
		}
	}
	
		
	// Method that is invoked when a thread is started causing task in this method to 
 	// execute
	
	public void run ()
	{
		try
		{
			while (true)
			{
				repaint ();
				Thread.sleep(this.speed);
				
				if (isResume)
				{
					lock.lock ();
					resume.await ();
					lock.unlock ();
				}
			}
		}
			
		catch (InterruptedException e)
		{
				System.out.println (e);	
		}	
	}
}

