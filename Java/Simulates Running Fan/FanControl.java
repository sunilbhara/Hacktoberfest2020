import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class FanControl extends JFrame implements ActionListener, AdjustmentListener
{
	private Fan fan;
	private Container pane;
	private JPanel panel, controlPanel, radioBtnBackgroundPanel, radioBtnBorderPanel;
	private JButton jbStart, jbStop, jbReverse;
	private JTextField jtxStatus;
	private JScrollBar jscrbSpeed;
	private JLabel jlbBackground, jlbBorder;
	private JRadioButton jrbBackgroundDefault, jrbBackgroundCyan, 
	                     jrbBackgroundGreen, jrbBackgroundBlue, 
	                     jrbBackgroundOrange, jrbBackgroundMagenta,
	                     jrbBorderDefault, jrbBorderCyan,jrbBorderGreen, 
	                     jrbBorderBlue, jrbBorderOrange, jrbBorderMagenta;
	private ButtonGroup groupBackgroundRadioBtn, groupBorderRadioBtn;
	
	
	// Default constructor
	// instantiate object and invoked methods when the FanControl object is instantiated
	
	public FanControl ()
	{
		fan = new Fan ();
		
		pane = getContentPane ();
		
		controlPanel = new JPanel ();
		radioBtnBackgroundPanel = new JPanel ();
		radioBtnBorderPanel = new JPanel ();
		panel = new JPanel ();
		
		jbStart = new JButton ("Start");
		jbStop = new JButton ("Stop");
		jbReverse = new JButton ("Reverse");
		
		jtxStatus = new JTextField (" ", 20);
		
		jlbBackground = new JLabel ("Background");
		jlbBorder = new JLabel ("Border");
		
		jrbBackgroundDefault = new JRadioButton ("Default");
		jrbBackgroundCyan = new JRadioButton ("Cyan");
        jrbBackgroundGreen = new JRadioButton ("Green");
        jrbBackgroundBlue = new JRadioButton ("Blue");
        jrbBackgroundOrange = new JRadioButton ("Orange");
        jrbBackgroundMagenta = new JRadioButton ("Magenta");
        jrbBorderDefault = new JRadioButton ("Default");
        jrbBorderCyan = new JRadioButton ("Cyant");
        jrbBorderGreen = new JRadioButton ("Green");
        jrbBorderBlue = new JRadioButton ("Blue");
        jrbBorderOrange = new JRadioButton ("Orange");
        jrbBorderMagenta = new JRadioButton ("Magenta");
		
        jscrbSpeed = new JScrollBar (JScrollBar.HORIZONTAL, 100, 100, 1, 900);
        
        groupBackgroundRadioBtn = new ButtonGroup ();
        groupBorderRadioBtn = new ButtonGroup ();
		
        
        setTextField ();
        
        setBackgroundColour ();
        
		setBorderColour();
	
		addComponentToFrame ();
		
		setFrameTitle ();
		
		setFrameSize ();
		
		setFrameResizable ();
		
		setFrameLocation ();
		
		setFrameCloseOperation ();
		
		setFrameVisibility ();
		
		setInitialTextStatus ();
				
		jbStart.addActionListener(this);
		jbStop.addActionListener(this);
		jbReverse.addActionListener(this);
		jscrbSpeed.addAdjustmentListener(this);
		jrbBackgroundDefault.addActionListener (this);
		jrbBackgroundCyan.addActionListener (this);
		jrbBackgroundGreen.addActionListener (this);
		jrbBackgroundBlue.addActionListener (this);
		jrbBackgroundOrange.addActionListener (this);
		jrbBackgroundMagenta.addActionListener (this);
		jrbBorderDefault.addActionListener (this);
		jrbBorderCyan.addActionListener (this);
		jrbBorderGreen.addActionListener (this);
		jrbBorderBlue.addActionListener (this);
		jrbBorderOrange.addActionListener (this);
		jrbBorderMagenta.addActionListener (this);	
	}
	
	
	// Method to set the text field properties
	
	public void setTextField ()
	{
		jtxStatus.setEditable (false);
        jtxStatus.setHorizontalAlignment(JTextField.CENTER);
	}
	
	// Method to set the background colour of the components placed in the frame
    
	
	public void setBackgroundColour ()
	{
		jtxStatus.setBackground (Color.YELLOW);
		fan.setBackground (Color.YELLOW);
		radioBtnBackgroundPanel.setBackground(Color.YELLOW);
		radioBtnBorderPanel.setBackground (Color.YELLOW);
		jrbBackgroundDefault.setBackground (Color.YELLOW);
		jrbBackgroundCyan.setBackground (Color.YELLOW);
		jrbBackgroundGreen.setBackground (Color.YELLOW);
		jrbBackgroundBlue.setBackground (Color.YELLOW);
		jrbBackgroundOrange.setBackground (Color.YELLOW);
		jrbBackgroundMagenta.setBackground (Color.YELLOW);		
		jrbBorderDefault.setBackground (Color.YELLOW);
		jrbBorderCyan.setBackground (Color.YELLOW);
		jrbBorderGreen.setBackground (Color.YELLOW);
		jrbBorderBlue.setBackground (Color.YELLOW);
		jrbBorderOrange.setBackground (Color.YELLOW);
		jrbBorderMagenta.setBackground (Color.YELLOW);
	}
	
	
	// Method to set the border colour of the components placed in the frame

	
	public void setBorderColour ()
	{
		jbStart.setBorder (new LineBorder (Color.RED, 1));
		jbStop.setBorder (new LineBorder (Color.RED, 1));
		jbReverse.setBorder (new LineBorder (Color.RED, 1));
		jscrbSpeed.setBorder (new LineBorder (Color.RED, 1));
		fan.setBorder (new LineBorder (Color.RED, 1));
		jtxStatus.setBorder (new LineBorder (Color.RED, 0));
		radioBtnBackgroundPanel.setBorder (new LineBorder (Color.RED, 1));
		radioBtnBorderPanel.setBorder (new LineBorder (Color.RED, 1));	
	}
	
	
	// Method to add component such as button, scroll bar and fan to the frame

	
	public void addComponentToFrame ()
	{
		controlPanel.setLayout (new GridLayout (1,3));
		controlPanel.add(jbStart);
		controlPanel.add(jbStop);
		controlPanel.add(jbReverse);
		
		radioBtnBackgroundPanel.setLayout (new GridLayout (7,1));
		radioBtnBackgroundPanel.add (jlbBackground);
		radioBtnBackgroundPanel.add (jrbBackgroundDefault);
		radioBtnBackgroundPanel.add (jrbBackgroundCyan);
		radioBtnBackgroundPanel.add (jrbBackgroundGreen);
		radioBtnBackgroundPanel.add (jrbBackgroundBlue);
		radioBtnBackgroundPanel.add (jrbBackgroundOrange);
		radioBtnBackgroundPanel.add (jrbBackgroundMagenta);
		
		groupBackgroundRadioBtn.add (jrbBackgroundDefault);
		groupBackgroundRadioBtn.add (jrbBackgroundCyan);
		groupBackgroundRadioBtn.add (jrbBackgroundGreen);
		groupBackgroundRadioBtn.add (jrbBackgroundBlue);
		groupBackgroundRadioBtn.add (jrbBackgroundOrange);
		groupBackgroundRadioBtn.add (jrbBackgroundMagenta);
		
		radioBtnBorderPanel.setLayout (new GridLayout (7,1));
		radioBtnBorderPanel.add (jlbBorder);
		radioBtnBorderPanel.add (jrbBorderDefault);
		radioBtnBorderPanel.add (jrbBorderCyan);
		radioBtnBorderPanel.add (jrbBorderGreen);
		radioBtnBorderPanel.add (jrbBorderBlue);
		radioBtnBorderPanel.add (jrbBorderOrange);
		radioBtnBorderPanel.add (jrbBorderMagenta);
		
		groupBorderRadioBtn.add (jrbBorderDefault);
		groupBorderRadioBtn.add (jrbBorderCyan);
		groupBorderRadioBtn.add (jrbBorderGreen);
		groupBorderRadioBtn.add (jrbBorderBlue);
		groupBorderRadioBtn.add (jrbBorderOrange);
		groupBorderRadioBtn.add (jrbBorderMagenta);	
		
		panel.setLayout (new BorderLayout ());
		panel.add (controlPanel, BorderLayout.NORTH);
		panel.add (jtxStatus, BorderLayout.CENTER);
		panel.add (radioBtnBackgroundPanel, BorderLayout.WEST);
		panel.add (radioBtnBorderPanel, BorderLayout.EAST);
		panel.add (jscrbSpeed, BorderLayout.SOUTH);
	
		pane.setLayout (new GridLayout (1,2));
		pane.add (panel);
		pane.add (fan);
	}
	
	// Method to perform an action when a button is clicked
	
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource () == jbStart)
		{
			fan.resume ();
			jtxStatus.setText("Fan Running");
		}
		
		else if (e.getSource () == jbStop )
		{
			fan.suspend ();
			jtxStatus.setText("Fan Stopped");
		}
		
		else if (e.getSource () == jbReverse)
		{
			fan.reverse ();
			jtxStatus.setText("Fan Direction Reversed");
		}
		
		else if (e.getSource () == jrbBackgroundDefault)
		{
			jtxStatus.setBackground (Color.YELLOW);
			fan.setBackground (Color.YELLOW);
			radioBtnBackgroundPanel.setBackground(Color.YELLOW);
			radioBtnBorderPanel.setBackground (Color.YELLOW);
			jrbBackgroundDefault.setBackground (Color.YELLOW);
			jrbBackgroundCyan.setBackground (Color.YELLOW);
			jrbBackgroundGreen.setBackground (Color.YELLOW);
			jrbBackgroundBlue.setBackground (Color.YELLOW);
			jrbBackgroundOrange.setBackground (Color.YELLOW);
			jrbBackgroundMagenta.setBackground (Color.YELLOW);		
			jrbBorderDefault.setBackground (Color.YELLOW);
			jrbBorderCyan.setBackground (Color.YELLOW);
			jrbBorderGreen.setBackground (Color.YELLOW);
			jrbBorderBlue.setBackground (Color.YELLOW);
			jrbBorderOrange.setBackground (Color.YELLOW);
			jrbBorderMagenta.setBackground (Color.YELLOW);
		}
		
		else if (e.getSource () == jrbBackgroundCyan)
		{
			jtxStatus.setBackground (Color.CYAN);
			fan.setBackground (Color.CYAN);
			radioBtnBackgroundPanel.setBackground(Color.CYAN);
			radioBtnBorderPanel.setBackground (Color.CYAN);
			jrbBackgroundDefault.setBackground (Color.CYAN);
			jrbBackgroundCyan.setBackground (Color.CYAN);
			jrbBackgroundGreen.setBackground (Color.CYAN);
			jrbBackgroundBlue.setBackground (Color.CYAN);
			jrbBackgroundOrange.setBackground (Color.CYAN);
			jrbBackgroundMagenta.setBackground (Color.CYAN);		
			jrbBorderDefault.setBackground (Color.CYAN);
			jrbBorderCyan.setBackground (Color.CYAN);
			jrbBorderGreen.setBackground (Color.CYAN);
			jrbBorderBlue.setBackground (Color.CYAN);
			jrbBorderOrange.setBackground (Color.CYAN);
			jrbBorderMagenta.setBackground (Color.CYAN);
		}
		
		else if (e.getSource () == jrbBackgroundGreen)
		{
			jtxStatus.setBackground (Color.GREEN);
			fan.setBackground (Color.GREEN);
			radioBtnBackgroundPanel.setBackground(Color.GREEN);
			radioBtnBorderPanel.setBackground (Color.GREEN);
			jrbBackgroundDefault.setBackground (Color.GREEN);
			jrbBackgroundCyan.setBackground (Color.GREEN);
			jrbBackgroundGreen.setBackground (Color.GREEN);
			jrbBackgroundBlue.setBackground (Color.GREEN);
			jrbBackgroundOrange.setBackground (Color.GREEN);
			jrbBackgroundMagenta.setBackground (Color.GREEN);		
			jrbBorderDefault.setBackground (Color.GREEN);
			jrbBorderCyan.setBackground (Color.GREEN);
			jrbBorderGreen.setBackground (Color.GREEN);
			jrbBorderBlue.setBackground (Color.GREEN);
			jrbBorderOrange.setBackground (Color.GREEN);
			jrbBorderMagenta.setBackground (Color.GREEN);
		}
		
		else if (e.getSource () == jrbBackgroundBlue)
		{
			jtxStatus.setBackground (Color.BLUE);
			fan.setBackground (Color.BLUE);
			radioBtnBackgroundPanel.setBackground(Color.BLUE);
			radioBtnBorderPanel.setBackground (Color.BLUE);
			jrbBackgroundDefault.setBackground (Color.BLUE);
			jrbBackgroundCyan.setBackground (Color.BLUE);
			jrbBackgroundGreen.setBackground (Color.BLUE);
			jrbBackgroundBlue.setBackground (Color.BLUE);
			jrbBackgroundOrange.setBackground (Color.BLUE);
			jrbBackgroundMagenta.setBackground (Color.BLUE);		
			jrbBorderDefault.setBackground (Color.BLUE);
			jrbBorderCyan.setBackground (Color.BLUE);
			jrbBorderGreen.setBackground (Color.BLUE);
			jrbBorderBlue.setBackground (Color.BLUE);
			jrbBorderOrange.setBackground (Color.BLUE);
			jrbBorderMagenta.setBackground (Color.BLUE);
		}
		
		else if (e.getSource () == jrbBackgroundOrange)
		{
			jtxStatus.setBackground (Color.ORANGE);
			fan.setBackground (Color.ORANGE);
			radioBtnBackgroundPanel.setBackground(Color.ORANGE);
			radioBtnBorderPanel.setBackground (Color.ORANGE);
			jrbBackgroundDefault.setBackground (Color.ORANGE);
			jrbBackgroundCyan.setBackground (Color.ORANGE);
			jrbBackgroundGreen.setBackground (Color.ORANGE);
			jrbBackgroundBlue.setBackground (Color.ORANGE);
			jrbBackgroundOrange.setBackground (Color.ORANGE);
			jrbBackgroundMagenta.setBackground (Color.ORANGE);		
			jrbBorderDefault.setBackground (Color.ORANGE);
			jrbBorderCyan.setBackground (Color.ORANGE);
			jrbBorderGreen.setBackground (Color.ORANGE);
			jrbBorderBlue.setBackground (Color.ORANGE);
			jrbBorderOrange.setBackground (Color.ORANGE);
			jrbBorderMagenta.setBackground (Color.ORANGE);
		}
		
		else if (e.getSource () == jrbBackgroundMagenta)
		{
			jtxStatus.setBackground (Color.MAGENTA);
			fan.setBackground (Color.MAGENTA);
			radioBtnBackgroundPanel.setBackground(Color.MAGENTA);
			radioBtnBorderPanel.setBackground (Color.MAGENTA);
			jrbBackgroundDefault.setBackground (Color.MAGENTA);
			jrbBackgroundCyan.setBackground (Color.MAGENTA);
			jrbBackgroundGreen.setBackground (Color.MAGENTA);
			jrbBackgroundBlue.setBackground (Color.MAGENTA);
			jrbBackgroundOrange.setBackground (Color.MAGENTA);
			jrbBackgroundMagenta.setBackground (Color.MAGENTA);		
			jrbBorderDefault.setBackground (Color.MAGENTA);
			jrbBorderCyan.setBackground (Color.MAGENTA);
			jrbBorderGreen.setBackground (Color.MAGENTA);
			jrbBorderBlue.setBackground (Color.MAGENTA);
			jrbBorderOrange.setBackground (Color.MAGENTA);
			jrbBorderMagenta.setBackground (Color.MAGENTA);
	
		}
		
		else if (e.getSource () == jrbBorderDefault)
		{
			jbStart.setBorder (new LineBorder (Color.RED, 1));
			jbStop.setBorder (new LineBorder (Color.RED, 1));
			jbReverse.setBorder (new LineBorder (Color.RED, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.RED, 1));
			fan.setBorder (new LineBorder (Color.RED, 1));
			jtxStatus.setBorder (new LineBorder (Color.RED, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.RED, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.RED, 1));	
		}
		
		else if (e.getSource () == jrbBorderCyan)
		{
			jbStart.setBorder (new LineBorder (Color.CYAN, 1));
			jbStop.setBorder (new LineBorder (Color.CYAN, 1));
			jbReverse.setBorder (new LineBorder (Color.CYAN, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.CYAN, 1));
			fan.setBorder (new LineBorder (Color.CYAN, 1));
			jtxStatus.setBorder (new LineBorder (Color.CYAN, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.CYAN, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.CYAN, 1));	
		}
		
		else if (e.getSource () == jrbBorderGreen)
		{
			jbStart.setBorder (new LineBorder (Color.GREEN, 1));
			jbStop.setBorder (new LineBorder (Color.GREEN, 1));
			jbReverse.setBorder (new LineBorder (Color.GREEN, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.GREEN, 1));
			fan.setBorder (new LineBorder (Color.GREEN, 1));
			jtxStatus.setBorder (new LineBorder (Color.GREEN, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.GREEN, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.GREEN, 1));	
		}
		
		else if (e.getSource () == jrbBorderBlue)
		{
			jbStart.setBorder (new LineBorder (Color.BLUE, 1));
			jbStop.setBorder (new LineBorder (Color.BLUE, 1));
			jbReverse.setBorder (new LineBorder (Color.BLUE, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.BLUE, 1));
			fan.setBorder (new LineBorder (Color.BLUE, 1));
			jtxStatus.setBorder (new LineBorder (Color.BLUE, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.BLUE, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.BLUE, 1));	
		}
		
		else if (e.getSource () == jrbBorderOrange)
		{
			jbStart.setBorder (new LineBorder (Color.ORANGE, 1));
			jbStop.setBorder (new LineBorder (Color.ORANGE, 1));
			jbReverse.setBorder (new LineBorder (Color.ORANGE, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.ORANGE, 1));
			fan.setBorder (new LineBorder (Color.ORANGE, 1));
			jtxStatus.setBorder (new LineBorder (Color.ORANGE, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.ORANGE, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.ORANGE, 1));	
		}
		
		else if (e.getSource () == jrbBorderMagenta)
		{
			jbStart.setBorder (new LineBorder (Color.MAGENTA, 1));
			jbStop.setBorder (new LineBorder (Color.MAGENTA, 1));
			jbReverse.setBorder (new LineBorder (Color.MAGENTA, 1));
			jscrbSpeed.setBorder (new LineBorder (Color.MAGENTA, 1));
			fan.setBorder (new LineBorder (Color.MAGENTA, 1));
			jtxStatus.setBorder (new LineBorder (Color.MAGENTA, 0));
			radioBtnBackgroundPanel.setBorder (new LineBorder (Color.MAGENTA, 1));
			radioBtnBorderPanel.setBorder (new LineBorder (Color.MAGENTA, 1));
		}
	}
		
	// Method to the control fan speed of the fan by dragging the bubble in the scroll bar 

	
	public void adjustmentValueChanged (AdjustmentEvent e)
	{	
		fan.setSpeed ((jscrbSpeed.getMaximum () - jscrbSpeed.getValue ()) /50);
			
		jtxStatus.setText("Fan is in speed " + jscrbSpeed.getValue ());
	}
	
	
	// Method to set the frame title
		
	public void setFrameTitle ()
	{
		setTitle ("Fan");
	}
	
	
	// Method to set the size of the frame
		
	public void setFrameSize ()
	{
		setSize (650, 450);
	}
	
	
	// Method that does not allow to change the frame size
		
	public void setFrameResizable ()
	{
		setResizable (false);
	}
		
	
	// Method to set the location of the frame
	
	public void setFrameLocation ()
	{
		setLocationRelativeTo (null);
	}
	
	
	// Method that sets the operation on the frame when user “close” the frame 
		
	public void setFrameCloseOperation ()
	{
		setDefaultCloseOperation (EXIT_ON_CLOSE);
	}
	
	
	// Method to set the frame visibility
		
	public void setFrameVisibility ()
	{
		setVisible (true);
	}
	
	
	// Method to set the initial text field status when the method in invoked
		
	public void setInitialTextStatus ()
	{
		jtxStatus.setText ("Click Start To Run The Fan");
	}
	
		
	public static void main (String [] args)
	{
		FanControl fanControl = new FanControl ();	
	}
} 
