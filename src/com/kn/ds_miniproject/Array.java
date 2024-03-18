package com.kn.ds_miniproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField diplaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setForeground(new Color(1, 101, 126));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(189, 62, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(207, 33, 226, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ARRAY LENGTH:");
		lblNewLabel_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(57, 91, 221, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(327, 85, 134, 24);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton insertarray = new JButton("CREATE ARRAY");
		insertarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Code for creating array
//				String len = length.getText();
//				int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		insertarray.setForeground(new Color(255, 0, 0));
		insertarray.setFont(new Font("Constantia", Font.BOLD, 14));
		insertarray.setBounds(220, 121, 170, 27);
		contentPane.add(insertarray);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 182, 226, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(250, 180, 70, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Code for insertion
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos]  = elem;
				String message = "Element "+elem+" Inserted at Position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(255, 0, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(513, 178, 96, 27);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1 = new JLabel("DELETE POSITION :");
		lblNewLabel_1_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(57, 230, 138, 18);
		contentPane.add(lblNewLabel_1_1);
		
		insertposition = new JTextField();
		insertposition.setBounds(425, 180, 62, 19);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION:");
		lblNewLabel_3.setForeground(new Color(163, 18, 159));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(338, 182, 77, 18);
		contentPane.add(lblNewLabel_3);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(220, 228, 96, 19);
		contentPane.add(deleteposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Code for delection
				
				int pos = Integer.valueOf(deleteposition.getText());
				if(pos > arr.length ) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					return;
				}
				arr[pos] = 0;
				String message = "Element Deleted at Position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		delete.setForeground(Color.RED);
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(373, 226, 114, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Code for display
				String msg = "";
				for(int i = 0;i<=arr.length-1;i++) {
					msg = msg +" "+ arr[i];
				} 
				
				diplaybox.setText(msg);

			}
			
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(250, 300, 106, 27);
		contentPane.add(display);
		
		diplaybox = new JTextField();
		diplaybox.setEditable(false);
		diplaybox.setBackground(new Color(255, 255, 128));
		diplaybox.setBounds(79, 337, 465, 27);
		contentPane.add(diplaybox);
		diplaybox.setColumns(10);
	}
}
