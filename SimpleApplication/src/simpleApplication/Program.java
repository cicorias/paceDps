package simpleApplication;

import javax.swing.*;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		SomethingPanel panel = new SomethingPanel();
		
		frame.setSize(300,  300);
		frame.add(panel);
		frame.setVisible(true);
		//panel.setVisible(true);
		
		

	}
	
	public String helloWorld(){
		return "Hello world"; 
		
	}

}
