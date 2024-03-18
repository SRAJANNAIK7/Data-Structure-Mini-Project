package com.kn.ds_miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField elemRear;
	private JTextField elemFront;
	private JTextField posInsert;
	private JTextField posElem;
	private JTextField posDelete;
	private JTextField displaybox;

	class Node {
		int data;
		Node prelink;
		Node nextlink;
	}

	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLL frame = new DoublyLL();
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
	public DoublyLL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDatastructure = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblDatastructure.setForeground(new Color(189, 62, 0));
		lblDatastructure.setFont(new Font("Algerian", Font.BOLD, 20));
		lblDatastructure.setBounds(201, 21, 386, 27);
		contentPane.add(lblDatastructure);

		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(60, 101, 181, 20);
		contentPane.add(lblNewLabel_2);

		elemRear = new JTextField();
		elemRear.setColumns(10);
		elemRear.setBounds(271, 96, 170, 27);
		contentPane.add(elemRear);

		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(60, 165, 181, 20);
		contentPane.add(lblNewLabel_2_1);

		elemFront = new JTextField();
		elemFront.setColumns(10);
		elemFront.setBounds(271, 160, 170, 27);
		contentPane.add(elemFront);

		JButton insertRear = new JButton("INSERT REAR");
		insertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT REAR
				Node temp;
				int elem = Integer.valueOf(elemRear.getText());
				Node newNode = new Node();
				newNode.data = elem;
				newNode.prelink = null;
				newNode.nextlink = null;
				if (first == null) {
					first = newNode;
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					temp.nextlink = newNode;
					newNode.prelink = temp;
				}
				String message = "Element Inserted at Rear Successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				elemRear.setText("");
			}
		});
		insertRear.setForeground(new Color(0, 128, 255));
		insertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertRear.setBounds(547, 98, 149, 27);
		contentPane.add(insertRear);

		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT FRONT
				int elem = Integer.valueOf(elemFront.getText());
				Node newNode = new Node();
				newNode.data = elem;
				newNode.prelink = null;
				newNode.nextlink = null;
				if (first == null) {
					first = newNode;
				} else {
					newNode.nextlink = first;
					first.prelink = newNode;
					first = newNode;
				}
				String message = "Element Inserted at Front Successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				elemFront.setText("");
			}
		});
		insertFront.setForeground(new Color(0, 128, 255));
		insertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertFront.setBounds(547, 162, 149, 27);
		contentPane.add(insertFront);

		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE REAR
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + first.data);
					first = null;
				} else {
					temp = first;
					while (temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + temp.nextlink.data);
					temp.nextlink = null;
				}
			}
		});
		deleteRear.setForeground(Color.RED);
		deleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteRear.setBounds(201, 207, 139, 27);
		contentPane.add(deleteRear);

		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE FRONT
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Delection not possible");
				} else if (first.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + first.data);
					first = null;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + first.data);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		deleteFront.setForeground(Color.RED);
		deleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteFront.setBounds(426, 207, 149, 27);
		contentPane.add(deleteFront);

		JLabel lblNewLabel_2_2 = new JLabel("ENTER POSITION TO INSERT:");
		lblNewLabel_2_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(48, 268, 230, 20);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2_3.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(409, 268, 187, 20);
		contentPane.add(lblNewLabel_2_3);

		posInsert = new JTextField();
		posInsert.setColumns(10);
		posInsert.setBounds(288, 263, 96, 27);
		contentPane.add(posInsert);

		posElem = new JTextField();
		posElem.setColumns(10);
		posElem.setBounds(606, 263, 133, 27);
		contentPane.add(posElem);

		JButton insertAtPos = new JButton("INSERT AT POSITION");
		insertAtPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT AT POSITION
				int position = Integer.valueOf(posInsert.getText());
				int elem = Integer.valueOf(posElem.getText());
				Node newNode = new Node();
				newNode.data = elem;
				if (position < 1) {
					JOptionPane.showMessageDialog(contentPane, "Invalid position");
					posInsert.setText("");
					posElem.setText("");
					return;
				}

				if (position == 1) {
					if (first == null) {
						first = newNode;
						String message = "Element Inserted Successfully";
			            JOptionPane.showMessageDialog(contentPane, message);
			            posElem.setText("");
			            posInsert.setText("");

					} else {
						newNode.nextlink = first;
						first.prelink = newNode;
						first = newNode;
						String message = "Element Inserted Successfully";
						JOptionPane.showMessageDialog(contentPane, message);

					}
					return;
				}
				
				posInsert.setText("");
				posElem.setText("");
				Node current = first;
				for (int i = 1; i < position - 1 && current != null; i++) {
					current = current.nextlink;
				}

				if (current == null) {
					JOptionPane.showMessageDialog(contentPane, "Position is out of range");
					posInsert.setText("");
					posElem.setText("");
					return;
				}

				newNode.nextlink = current.nextlink;
				if (current.nextlink != null) {
					current.nextlink.prelink = newNode;
//					String message = "Element Inserted Successfully";
//					JOptionPane.showMessageDialog(contentPane, message);
//					posInsert.setText("");
//					posElem.setText("");
				}
				String message = "Element Inserted Successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				posInsert.setText("");
				posElem.setText("");
				current.nextlink = newNode;
				newNode.prelink = current;
				
//				    System.out.println();
			}
		});
		insertAtPos.setForeground(new Color(0, 128, 255));
		insertAtPos.setFont(new Font("Constantia", Font.BOLD, 14));
		insertAtPos.setBounds(288, 305, 189, 27);
		contentPane.add(insertAtPos);

		JLabel lblNewLabel_2_2_1 = new JLabel("ENTER POSITION TO DELETE:");
		lblNewLabel_2_2_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_2_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(44, 347, 240, 20);
		contentPane.add(lblNewLabel_2_2_1);

		posDelete = new JTextField();
		posDelete.setColumns(10);
		posDelete.setBounds(288, 342, 96, 27);
		contentPane.add(posDelete);

		JButton displayForward = new JButton("FORWARD DISPLAY");
		displayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DISPLAY FORWARD
				String msg = "";
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else if (first.nextlink == null) {

					msg = msg + " " + first.data;

				} else {
					temp = first;
					while (temp != null) {
						msg = msg + " " + temp.data;
						temp = temp.nextlink;
					}
				}
				displaybox.setText(msg);
				if (first == null) {
					displaybox.setText("");
				}
			}
		});
		displayForward.setForeground(new Color(255, 128, 0));
		displayForward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayForward.setBounds(188, 394, 181, 27);
		contentPane.add(displayForward);

		displaybox = new JTextField();
		displaybox.setEditable(false);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setBounds(110, 466, 558, 34);
		contentPane.add(displaybox);

		JButton deleteAtPos = new JButton("DELETE AT POSITION");
		deleteAtPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE AT POSITION
				int position = Integer.valueOf(posDelete.getText());

				if (position < 1 || first == null) {
					JOptionPane.showMessageDialog(contentPane, "Invalid position");
					posDelete.setText("");
					return;
				}

				if (position == 1) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + first.data);
					posDelete.setText("");
					first = first.nextlink;
					if (first != null) {
						first.prelink = null;
					}
					return;
				}

				Node current = first;
				for (int i = 1; i < position && current != null; i++) {
					current = current.nextlink;
				}

				if (current == null) {
					JOptionPane.showMessageDialog(contentPane, "Invalid position");
					posDelete.setText("");
					return;
				}

				if (current.nextlink == null) {
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + current.data);
					posDelete.setText("");
					current.prelink.nextlink = null;
					return;
				}
				JOptionPane.showMessageDialog(contentPane, "Element Deleted is " + current.data);
				posDelete.setText("");
				current.prelink.nextlink = current.nextlink;
				current.nextlink.prelink = current.prelink;
//			    System.out.println();
			}
		});
		deleteAtPos.setForeground(Color.RED);
		deleteAtPos.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteAtPos.setBounds(426, 344, 189, 27);
		contentPane.add(deleteAtPos);

		JButton displayBackward = new JButton("BACKWARD DISPLAY");
		displayBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DISPLAY BACKWARD
				String msg = "";
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				} else if (first.nextlink == null) {

					msg = msg + " " + first.data;
				} else {
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while (temp != null) {
						msg = msg + " " + temp.data;
						temp = temp.prelink;
					}
				}
				displaybox.setText(msg);
				if (first == null) {
					displaybox.setText("");
				}
//				System.out.println();
			}
		});
		displayBackward.setForeground(new Color(255, 128, 0));
		displayBackward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayBackward.setBounds(415, 394, 187, 27);
		contentPane.add(displayBackward);
	}
}
