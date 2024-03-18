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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizeField;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueDatastructure = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblCircularQueueDatastructure.setForeground(new Color(189, 62, 0));
		lblCircularQueueDatastructure.setFont(new Font("Algerian", Font.BOLD, 18));
		lblCircularQueueDatastructure.setBounds(130, 22, 329, 24);
		contentPane.add(lblCircularQueueDatastructure);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE CIRCULAR QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 101, 290, 20);
		contentPane.add(lblNewLabel_1);
		
		sizeField = new JTextField();
		sizeField.setColumns(10);
		sizeField.setBounds(340, 98, 134, 24);
		contentPane.add(sizeField);
		
		JButton createQueue = new JButton("CREATE CIRCULAR QUEUE");
		createQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Create Circular Queue
				size = Integer.valueOf(sizeField.getText());
				cq = new int[size];
				String message = "Circular Queue of size " + size + " Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createQueue.setForeground(Color.RED);
		createQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		createQueue.setBounds(150, 152, 231, 27);
		contentPane.add(createQueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTERGER ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(68, 209, 233, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(300, 205, 124, 24);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Insert
				int elem;
				if(count == size) {
					JOptionPane.showMessageDialog(createQueue, "Insertion Not Possible");
				}else {
					elem = Integer.valueOf(element.getText());
					r = (r+1)%size;
					count++;
					cq[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Insertion was Successfull");
					element.setText("");
				}
				
			}
		});
		insert.setForeground(Color.RED);
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(130, 241, 90, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Delete
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}else {
					String message = "Element Deleted is " + cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(334, 241, 90, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Display
				int f1 = f;
				String msg = "";
				if(count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}else {
					for(int i = 1;i<=count;i++) {
						msg =  msg+ " "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);	
				}
				if(count == 0) {
					displaybox.setText("");
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(239, 301, 102, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setEditable(false);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setBounds(68, 338, 465, 24);
		contentPane.add(displaybox);
	}

}
