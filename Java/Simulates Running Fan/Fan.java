import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fan extends JPanel
{
	private int xCenter;
	private int yCenter;
	private int fanRadius;
	private int bladeLength;
	private int angle;
	private int rotation;
	private int speed;
	protected Timer timer;

	
	// Default constructor
	// Instantiated and instantiate Timer class object and initializes the instance variables

	public Fan ()
	{
		timer  = new Timer (speed, new TimerListener ());
		this.angle = 100;
		this.rotation = 1;
		this.speed = 100;
	}
	
	
	// Method to start the fan when this method is invoked
	
	public void resume ()
	{
		timer.start ();
	}
	
	
	// Method to stop the fan when this method is invoked
	
	public void suspend ()
	{
		timer.stop ();
	}
	
	
	// Method to reverse the fan when this method is invoked
	
	public void reverse ()
	{
		rotation = - rotation;
	}
	
	
	// Method to set the fan speed when this method is invoked
	
	public void setSpeed (int speed)
	{
		timer.setDelay(this.speed = speed);
	}
	
	
	// Method that draw fan which contains a blade inside an oval on a component
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		xCenter = getBounds ().width / 2;
		yCenter = getBounds ().height / 2;
		
		fanRadius = (int)(Math.min (getBounds ().width, getBounds ().height) * 0.4);
		
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
	
	class TimerListener implements ActionListener
	{
		
		// Method to repaint panel when an event occurred
		
		public void actionPerformed (ActionEvent e)
		{
			repaint ();
		}
	}
}
