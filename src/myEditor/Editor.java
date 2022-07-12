package myEditor;

import parameters.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class Editor extends JFrame implements WindowListener{

	private static final long serialVersionUID = 1L;
		
	private Parameters parameters;
	
	private JMenuBar menuBar;
	private JToolBar toolBar;
	
	public Editor() {				
		this.setVisible(false);
		
		loadParameters();
		createDefaultWindow();
		createJMenuBar();
		createToolBar();
		createWidgets();
				
		this.addWindowListener(this);
		this.setVisible(true);
	}
	
	private void loadParameters() {
		parameters = new Parameters();
		
	}

	private void createDefaultWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension((int)(500 * Parameters.SCREEN_RATIO), (int)(500 * Parameters.SCREEN_RATIO)));  // not sure
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setTitle("Smart Lawyer");
	}
	
	private void createJMenuBar() {
		menuBar = new MyJMenuBar();
		
		this.setJMenuBar(menuBar);
	}
	
	private void createToolBar() {
		toolBar = new MyJToolBar();
		
		Container cont = this.getContentPane();
		cont.add(toolBar, BorderLayout.NORTH);
	}
	
	private void createWidgets() {
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closed");
		parameters.printActualParameters();
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
