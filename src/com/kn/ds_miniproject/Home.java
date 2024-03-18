package com.kn.ds_miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-217,444
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		label.setFont(new Font("Algerian", Font.BOLD, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(21, 94, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE  A DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 255, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 16));
		lblNewLabel.setBounds(89, 42, 237, 22);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(new Color(255, 0, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ARRAY WINDOW OPENING CODE
//				 Array a = new Array();
//				 a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setBounds(23, 102, 88, 23);
		contentPane.add(array);
		
		JButton btnNewButton = new JButton("STACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				STACK OPENING CODE
				new Stack().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(167, 102, 88, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("QUEUE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				QUEUE OPENING CODE
				new Queue().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(324, 102, 81, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CIRCULAR QUEUE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CIRCULAR OPENING CODE
				new CircularQueue().setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_2.setBounds(23, 167, 149, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SINGLY LINKED LIST");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SINGLY LL OPENING CODE
				new SinglyLL().setVisible(true);
			}
		});
		btnNewButton_3.setForeground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_3.setBounds(244, 167, 161, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("DOUBLY LINKED LIST");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DOUBBLY LL OPENING CODE
				new DoublyLL().setVisible(true);

			}
		});
		btnNewButton_3_1.setForeground(Color.RED);
		btnNewButton_3_1.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton_3_1.setBounds(137, 209, 175, 23);
		contentPane.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("* MINI PROJECT *");
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel_1.setBounds(142, 10, 136, 22);
		contentPane.add(lblNewLabel_1);
	}
}
