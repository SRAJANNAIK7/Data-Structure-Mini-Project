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

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStackDatastructure = new JLabel("STACK DATASTRUCTURE");
		lblStackDatastructure.setForeground(new Color(189, 62, 0));
		lblStackDatastructure.setFont(new Font("Algerian", Font.BOLD, 18));
		lblStackDatastructure.setBounds(168, 30, 226, 24);
		contentPane.add(lblStackDatastructure);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ARRAY SIZE:");
		lblNewLabel_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(68, 93, 202, 20);
		contentPane.add(lblNewLabel_1);

		sizefield = new JTextField();
		sizefield.setColumns(10);
		sizefield.setBounds(334, 90, 134, 24);
		contentPane.add(sizefield);

		JButton insertstack = new JButton("CREATE STACK");
		insertstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CREATE STACK
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "Stack of size " + size + " Created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		insertstack.setForeground(Color.RED);
		insertstack.setFont(new Font("Constantia", Font.BOLD, 14));
		insertstack.setBounds(168, 132, 170, 27);
		contentPane.add(insertstack);

		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(56, 187, 226, 18);
		contentPane.add(lblNewLabel_2);

		element = new JTextField();
		element.setColumns(10);
		element.setBounds(334, 183, 124, 24);
		contentPane.add(element);

		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				PUSH
				int elem;
				if (top == size - 1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");

				} else {
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push was Successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(Color.RED);
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(143, 232, 81, 27);
		contentPane.add(push);

		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				POP

				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				} else {
					String message = "Element Deleted is " + s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(Color.RED);
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(311, 232, 70, 27);
		contentPane.add(pop);

		displaybox = new JTextField();
		displaybox.setEditable(false);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setBounds(56, 325, 465, 24);
		contentPane.add(displaybox);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DISPLAY
				String msg = "";
				if (top == -1) {
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				} else {
					for (int i = top; i >= 0; i--) {
						msg =  msg+ " "+s[i];
					}
					displaybox.setText(msg);
				}
				if(top==-1) {
					displaybox.setText("");
				}
			}
		});
		display.setForeground(Color.RED);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(228, 274, 102, 27);
		contentPane.add(display);
	}

}
