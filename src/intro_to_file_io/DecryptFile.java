package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class DecryptFile {
	public static void main(String[] args) {

		String info = JOptionPane.showInputDialog("What is is the encrypted file name");
		String message = "";
		try {
			 BufferedReader b = new BufferedReader(new FileReader("src/intro_to_file_io/Encrypt.txt"));

			String line = b.readLine();

			while (line != null) {
	
				List<String> list = Arrays.asList(line.split(" "));
				
			     for (int i = 0; i < list.size(); i++) {
					
				
			      System.out.println("Enter a binary value:");
			      
			      int k = Integer.parseInt(list.get(i),2);  
			      String out = new Character((char)k).toString();
			      System.out.println("string: " + out );
			      message += out;
			      
				
				}
			     line = b.readLine();
			}
JOptionPane.showMessageDialog(null, message );
			b.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
