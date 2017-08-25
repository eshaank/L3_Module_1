package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

public class EncryptFile {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Type a message");
		String output = "";
		 byte[] bytes = name.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++)
		     {
		    	 int bin = (val & 128) == 0 ? 0 : 1;
		    	 Integer.toString(bin);
		    	 output = output+bin;
		        binary.append(bin);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  System.out.println( binary);
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Encrypt.txt");
			
			fw.write("'" + name + "' to binary: " + binary);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
