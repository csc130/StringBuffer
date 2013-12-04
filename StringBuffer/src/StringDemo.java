import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StringDemo {

	/**
	 * @param args
	 */
	static String fileName = "test.dat";
	static String inputvalue="";
	public static void main(String[] args) throws FileNotFoundException,
			IOException, HeadlessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		JTextField test = new JTextField("Tanes");
		String roster[] = new String[10];
		System.out.println(roster[0]);
		System.out.println(test.getText());
		for (int i = 0; i < 10; i++) {
			roster[i] = test.getText();
		}
		for (int i = 0; i < 10; i++) {
			writeObjFile(roster[i]);
		}
		
		JOptionPane.showMessageDialog(null, readObjFile(fileName));
	}

	public static void writeObjFile(String roster)
			throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream(fileName));
		output.writeObject(roster);
		System.out.println("Save file to " + fileName);

	}

	public static String readObjFile(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream input = new ObjectInputStream(
				new FileInputStream(fileName));
		inputvalue = (String)input.readObject();
		return inputvalue;

	}
}



/*
 * String s1 = "TANES"; String s2 = "TANES";
 * 
 * System.out.println(s1); System.out.println(s2);
 * 
 * String s3 = s1.toLowerCase(); System.out.println(s1); System.out.println(s3);
 * System.out.println(s2);
 * 
 * s3 =s1.replace('T', 'P'); System.out.println(s1); System.out.println(s3);
 * System.out.println(s2);
 * 
 * System.out.println(s1==s2);
 */