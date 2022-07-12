package parameters;

import java.awt.Toolkit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.util.Scanner;

public class Parameters {
	
	private File file;
	private Scanner scan;
	private PrintWriter writer;
	private String fileName = "Parameters/EditorParameters.par";
	
	public static final double SCREEN_RATIO = (double)Toolkit.getDefaultToolkit().getScreenSize().height / 1080;
	
	public static boolean darkMode;
	
	
	
	public Parameters() {
		try {
			file = new File(fileName); 
			scan = new Scanner(file);
			loadParameters();
			scan.close();
		} catch (FileNotFoundException e) {
			createFile();
		}
	}

	private void loadParameters() {
		scan.next();
		darkMode = scan.nextBoolean();
	}
	
	private void createFile() {
		openWriter();
		printDefaultParameters();
	}
	
	private void openWriter() {
		try {
			writer = new PrintWriter(file, "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			System.exit(-1);
			e.printStackTrace();
		}
	}
	
	private void printDefaultParameters() {
		writer.println("darkMode false");
		writer.close();
	}
	
	public void printActualParameters() {
		openWriter();
		writer.println("darkMode " + darkMode);
		writer.close();
	}
	
}
