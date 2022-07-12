package myEditor;

import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import parameters.Parameters;

public class MyJMenuBar extends JMenuBar{

	private static final long serialVersionUID = 1L;
	
	private JMenu fileMenu;
	private JMenuItem newButton;
	private JMenuItem openFile;
	private JMenu editMenu;
	private JMenu formatMenu;
	private JMenu searchMenu;
	private JMenu windowMenu;
	
	public MyJMenuBar() {
		createFileMenu();
		createEditMenu();
		createFormatMenu();
		createSearchMenu();
		createWindowMenu();
		
		this.add(fileMenu);
		this.add(editMenu);
		this.add(formatMenu);
		this.add(searchMenu);
		this.add(windowMenu);
		this.setPreferredSize(new Dimension(this.getWidth(), (int)(25 * Parameters.SCREEN_RATIO)));
	}
	
	private void createFileMenu() {
		fileMenu = new JMenu("File");
				
		newButton = new JMenuItem("New");
		
		openFile = new JMenuItem("Open");
		
		fileMenu.add(newButton);
		fileMenu.add(openFile);
	}
	
	private void createEditMenu() {
		editMenu = new JMenu("Edit");
	}
	
	private void createFormatMenu() {
		formatMenu = new JMenu("Format");
	}
	
	private void createSearchMenu() {
		searchMenu = new JMenu("Search");
	}

	private void createWindowMenu() {
		windowMenu = new JMenu("Window");
	}
	
}
