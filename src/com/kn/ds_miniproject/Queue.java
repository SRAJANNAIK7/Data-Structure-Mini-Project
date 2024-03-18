package com.kn.ds_miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizeField;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQueueDatastructure = new JLabel("QUEUE DATASTRUCTURE");
		lblQueueDatastructure.setForeground(new Color(189, 62, 0));
		lblQueueDatastructure.setFont(new Font("Algerian", Font.BOLD, 18));
		lblQueueDatastructure.setBounds(163, 23, 226, 24);
		contentPane.add(lblQueueDatastructure);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(75, 93, 202, 20);
		contentPane.add(lblNewLabel_1);
		
		sizeField = new JTextField();
		sizeField.setColumns(10);
		sizeField.setBounds(342, 88, 134, 27);
		contentPane.add(sizeField);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Create a Queue
				size = Integer.valueOf(sizeField.getText());
				q = new int[size];
				String message = "Queue of size " + size + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setForeground(Color.RED);
		createqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		createqueue.setBounds(193, 131, 170, 27);
		contentPane.add(createqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTERGER ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(75, 185, 230, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(352, 181, 124, 24);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Insert operation
				int elem;
				if(r == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}else {
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion was Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(Color.RED);
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(158, 222, 92, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Delete operation
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}else {
					String message = "Element Deleted is " + q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}

			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(311, 222, 92, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Display operation
				String msg = "";
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "Queue is empty");
				}else {
					for(int i = f;i<=r;i++) {
						msg =  msg+ " "+q[i];
					}
					displaybox.setText(msg);				
					}
				if(r==-1||f>r) {
					displaybox.setText("");
				}
			}
			
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(233, 265, 101, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setEditable(false);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setBounds(53, 319, 465, 32);
		contentPane.add(displaybox);
	}

}
