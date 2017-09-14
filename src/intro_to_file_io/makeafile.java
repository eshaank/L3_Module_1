package intro_to_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class makeafile {
	public static void main(String[] args) {

		File file = new File("src/intro_to_file_io/bob.txt");
		PrintWriter pw ;
		Scanner scan;
		try {
			scan = new Scanner(file);
			pw = new PrintWriter(file);
			pw.println("bad");
			pw.close();
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}