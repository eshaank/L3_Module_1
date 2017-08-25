package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DecryptFile {
	public static void main(String[] args) {

		String info = JOptionPane.showInputDialog("What is is the encrypted file name");
		 
		 try {
		 BufferedReader br = new BufferedReader(new
		 FileReader("src/intro_to_file_io/Encrypt.txt"));
		
		 //String find = br.readLine();
		 while(info != null){
			 byte[] encoded = info.getBytes();
		        String text = new String(encoded);
		info = br.readLine();
		 }
		
		 br.close();
		 } catch (FileNotFoundException e1) {
		 // TODO Auto-generated catch block
		 e1.printStackTrace();
		 } catch (IOException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		
		
		 }


	}

