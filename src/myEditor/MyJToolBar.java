package myEditor;

import java.awt.Dimension;
import java.awt.Image;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class MyJToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;

	private JButton undoButton;
	private JButton redoButton;
	
	public MyJToolBar() {
		this.setRollover(true);
		
		createUndoButton();
		createRedoButton();
	}
	
	private void createUndoButton() {
		undoButton = new JButton();
		undoButton.setPreferredSize(new Dimension(100, 100));
		undoButton.setMinimumSize(new Dimension(100, 100));
		
		setButtonIcon(undoButton, "Icons/undoButton.png");
		
		this.add(undoButton);
	}
	
	private void createRedoButton() {
		redoButton = new JButton();
		
		this.add(redoButton);
	}
	
	
	private void setButtonIcon(JButton button, String path) {
		try {
			Image img = ImageIO.read(getClass().getResource(path));
			button.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
