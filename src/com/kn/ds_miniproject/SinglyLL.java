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

public class SinglyLL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField displaybox;
	private JTextField insertfront;
	private JTextField insertPos;
	private JTextField deletePos;
	class Node {
		int data;
		Node link;
	}

	private Node first;
	private JTextField insertElem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLL frame = new SinglyLL();
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
	public SinglyLL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 599);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatastructure = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblDatastructure.setForeground(new Color(189, 62, 0));
		lblDatastructure.setFont(new Font("Algerian", Font.BOLD, 20));
		lblDatastructure.setBounds(199, 23, 378, 27);
		contentPane.add(lblDatastructure);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(32, 100, 189, 20);
		contentPane.add(lblNewLabel_2);
		
		insertrear = new JTextField();
		insertrear.setColumns(10);
		insertrear.setBounds(243, 95, 170, 27);
		contentPane.add(insertrear);
		
		displaybox = new JTextField();
		displaybox.setEditable(false);
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 128));
		displaybox.setBounds(100, 490, 540, 27);
		contentPane.add(displaybox);
		
		JButton insertRear = new JButton("INSERT REAR");
		insertRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT REAR
				Node temp;
				int elem = Integer.valueOf(insertrear.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
				} else {
					temp = first;
					while (temp.link != null) {
						temp = temp.link;
					}
					temp.link = newnode;
				}
				String message = "Element Inserted at Rear Successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				insertrear.setText("");
			}
			
		});
		insertRear.setForeground(new Color(0, 128, 255));
		insertRear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertRear.setBounds(483, 97, 149, 27);
		contentPane.add(insertRear);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(32, 151, 189, 20);
		contentPane.add(lblNewLabel_2_1);
		
		insertfront = new JTextField();
		insertfront.setColumns(10);
		insertfront.setBounds(243, 146, 170, 27);
		contentPane.add(insertfront);
		
		JButton insertFront = new JButton("INSERT FRONT");
		insertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT FRONT
				int elem = Integer.valueOf(insertfront.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if (first == null) {
					first = newnode;
				} else {
					newnode.link = first;
					first = newnode;
				}
				String message = "Element Inserted at Front Successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				insertfront.setText("");
			}
		});
		insertFront.setForeground(new Color(0, 128, 255));
		insertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertFront.setBounds(483, 148, 149, 27);
		contentPane.add(insertFront);
		
		JButton deleteRear = new JButton("DELETE REAR");
		deleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE REAR
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				} else if (first.link == null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element at Rear End =" + first.data);
					first = null;
				} else {
					temp = first;
					while (temp.link.link != null) {
						temp = temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Deleted element at rear end = " + temp.link.data);
					temp.link = null;
				}
			}
			
		});
		deleteRear.setForeground(Color.RED);
		deleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteRear.setBounds(147, 198, 139, 27);
		contentPane.add(deleteRear);
		
		JButton deleteFront = new JButton("DELETE FRONT");
		deleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE FRONT
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				} else if (first.link == null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element at Front End =" + first.data);
					first = null;
				} else {
					JOptionPane.showMessageDialog(contentPane, "Deleted element at Front End =" + first.data);
					first = first.link;
				}
			}
		});
		deleteFront.setForeground(Color.RED);
		deleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteFront.setBounds(415, 198, 149, 27);
		contentPane.add(deleteFront);
		
		JButton insertAtPos = new JButton("INSERT AT POSITION");
		insertAtPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				INSERT AT POSITION
			        int position = Integer.valueOf(insertPos.getText());
			        int elem = Integer.valueOf(insertElem.getText());
			        Node newNode = new Node();
			        newNode.data = elem;
			        if (position < 1) {
			        	JOptionPane.showMessageDialog(contentPane, "Invalid position");
			        	insertPos.setText("");
						insertElem.setText("");
			            return;
			        }
			        if (position == 1) {
			            newNode.link = first;
			            first = newNode;
			            String message = "Element Inserted Successfully";
			            JOptionPane.showMessageDialog(contentPane, message);
			            insertPos.setText("");
						insertElem.setText("");
			            return;
			        }
			        
					
			        insertPos.setText("");
					insertElem.setText("");
			        Node current = first;
			        for (int i = 1; i < position - 1 && current != null; i++) {
			            current = current.link;
			        }
			        if (current == null) {
			        	JOptionPane.showMessageDialog(contentPane, "Position is out of range");
			        	insertPos.setText("");
						insertElem.setText("");
			            return;
			        }
			        newNode.link = current.link;
			        current.link = newNode;
			        String message = "Element Inserted Successfully";
					JOptionPane.showMessageDialog(contentPane, message);
					insertPos.setText("");
					insertElem.setText("");
					
			}
		});
		insertAtPos.setForeground(new Color(0, 128, 255));
		insertAtPos.setFont(new Font("Constantia", Font.BOLD, 14));
		insertAtPos.setBounds(264, 290, 189, 27);
		contentPane.add(insertAtPos);
		
		JButton deleteAtPos = new JButton("DELETE AT POSITION");
		deleteAtPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DELETE AT POSITION
		        int position = Integer.valueOf(deletePos.getText());
				  if (first == null) {
						JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible: List is empty");
						deletePos.setText("");
			            return;
			        }
			        if (position < 1) {
			        	JOptionPane.showMessageDialog(contentPane, "Invalid position");
			        	deletePos.setText("");
			            return;
			        }
			        if (position == 1) {
			            Node temp = first;
			            first = first.link;
			            JOptionPane.showMessageDialog(contentPane,"Deleted element at position " + position + " = " + temp.data);
			            deletePos.setText("");
			            return;
			        }
			        deletePos.setText("");
			        
			        Node current = first;
			        for (int i = 1; i < position - 1 && current != null; i++) {
			            current = current.link;
			        }
			        if (current == null || current.link == null) {
			        	JOptionPane.showMessageDialog(contentPane, "Position is out of range");
			        	deletePos.setText("");
			            return;
			        }
			        Node temp = current.link;
			        current.link = temp.link;
			        JOptionPane.showMessageDialog(contentPane,"Deleted element at position " + position + " = " + temp.data);
			        deletePos.setText("");
			}
			
		});
		deleteAtPos.setForeground(Color.RED);
		deleteAtPos.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteAtPos.setBounds(415, 352, 189, 27);
		contentPane.add(deleteAtPos);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DISPLAY
				String msg = "";
				Node temp;
				if (first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible:");
				} else if (first.link == null) {
					
					msg = msg +" "+ first.data;
					
				} else {
					temp = first;
					while (temp != null) {
						
						msg = msg +" "+ temp.data;
						
						temp = temp.link;
					}
				}
				displaybox.setText(msg);
				if(first == null) {
					displaybox.setText("");
				}
			}
		});
		display.setForeground(new Color(255, 128, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(302, 422, 133, 33);
		contentPane.add(display);
		
		JLabel lblNewLabel_2_2 = new JLabel("ENTER POSITION TO INSERT:");
		lblNewLabel_2_2.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_2.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(32, 257, 230, 20);
		contentPane.add(lblNewLabel_2_2);
		
		insertPos = new JTextField();
		insertPos.setColumns(10);
		insertPos.setBounds(272, 252, 71, 27);
		contentPane.add(insertPos);
		
		deletePos = new JTextField();
		deletePos.setColumns(10);
		deletePos.setBounds(272, 350, 71, 27);
		contentPane.add(deletePos);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("ENTER POSITION TO DELETE:");
		lblNewLabel_2_2_1.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_2_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(32, 355, 234, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_2_3.setForeground(new Color(163, 18, 159));
		lblNewLabel_2_3.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(363, 257, 189, 20);
		contentPane.add(lblNewLabel_2_3);
		
		insertElem = new JTextField();
		insertElem.setColumns(10);
		insertElem.setBounds(562, 252, 104, 27);
		contentPane.add(insertElem);
	}

}
