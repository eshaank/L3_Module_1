package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Copyright {
	public static void main(String[] args) {

		//File file = new File("src/intro_to_file_io/bob.txt");
		PrintWriter pw;
		PrintWriter prw;
		Scanner scan;
		Scanner sca;
		FileWriter frw;
//		try {
//			frw = new FileWriter("src/intro_to_file_io/test2.txt", true);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		// try {
		// scan = new Scanner(file);
		// pw = new PrintWriter(file);
		// pw.println("//Copyright © 2017 by Eshaan Kansagara");
		// pw.close();
		// while(scan.hasNext()) {
		// System.out.println(scan.nextLine());
		// }
		//
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		for (int i  = 0; i < 10; i++) {
			
		
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		//String copy = "";
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String fileName = jfc.getSelectedFile().getAbsolutePath();
			try {
				// prw = new PrintWriter(fileName);
				frw = new FileWriter(fileName, true);
				sca = new Scanner(fileName);
				frw.write("//Copyright © 2017 by Eshaan Kansagara");
				frw.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}

		}
	}

}
//Copyright © 2017 by Eshaan Kansagara