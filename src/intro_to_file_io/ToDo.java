package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	// The add task button will display a JOptionPane to get a task from the user
	// and add it to the list.
	// Remove task will remove a task from the list. You can choose your own method
	// of how to select a task from the list.
	// The save button will save the current task list to a file.
	// The load button will load a new task list into the program and display it.
	// The program should automatically load the last saved list from the file at
	// startup and display it.

	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	PrintWriter pw;
	PrintWriter prw;
	Scanner scan;
	Scanner sca;
	FileWriter frw;
	ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		todo.magic();
	}

	void magic() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();

		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		button1.setText("Add Task");
		button2.setText("Remove Task");
		button3.setText("Save");
		button4.setText("Load");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button1)) {
			String task = JOptionPane.showInputDialog(null, "Type a task to be done");
			list.add(task);
			System.out.println(list);
		}

	}

}
