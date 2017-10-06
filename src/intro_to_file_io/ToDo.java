package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDo implements ActionListener {
	// 4. Make a to-do list tracker:
	// Create a window with four buttons: add task, remove task, save, and load.
	// (Done)
	// The add task button will display a JOptionPane to get a task from the
	// user
	// and add it to the list.
	// Remove task will remove a task from the list. You can choose your own
	// method
	// of how to select a task from the list.
	// The save button will save the current task list to a file.
	// The load button will load a new task list into the program and display
	// it.
	// The program should automatically load the last saved list from the file
	// at
	// startup and display it.

	JFrame frame;
	JPanel panel;
	JButton addTask;
	JButton removeTask;
	JButton save;
	JButton load;

	String file;

	PrintWriter pw;
	Scanner scan;
	FileWriter frw;
	ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		todo.magic();

	}

	void writer() {

	}

	void magic() {
		frame = new JFrame();
		panel = new JPanel();
		addTask = new JButton();
		removeTask = new JButton();
		save = new JButton();
		load = new JButton();

		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(addTask);
		panel.add(removeTask);
		panel.add(load);

		addTask.addActionListener(this);
		removeTask.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);

		addTask.setText("Add Task");
		removeTask.setText("Remove Task");
		save.setText("Save");
		load.setText("Load");
		frame.pack();
		frame.setDefaultCloseOperation(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addTask) {

			String task = JOptionPane.showInputDialog(null, "Type a task to be done");
			list.add(task + "\n");
			task = "";

			try {
				for (int i = 0; i < list.size(); i++) {
					FileWriter fw = new FileWriter("src/intro_to_file_io/List.txt", true);
					fw.write(list.get(i));

					fw.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		if (e.getSource() == load) {

			file = "";
			try {
				scan = new Scanner(new File("src/intro_to_file_io/List.txt"));
				while (scan.hasNextLine()) {

					file += scan.nextLine();
					file += "\n";
				}
				JOptionPane.showMessageDialog(null, file);

			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}

		}
		if (e.getSource() == removeTask) {
			String remove = JOptionPane.showInputDialog("Which task would you like to remove? \n" + file);
		}

	}

}
