package student;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class stuform implements ActionListener{

	private JFrame frame;
	private JTextField t1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	String gender,dept;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stuform window = new stuform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public stuform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setBounds(178, 11, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(241, 50, 111, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		t1.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(97, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton male = new JRadioButton("M");
		male.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender="MALE";
			}
		});
		buttonGroup.add(male);
		male.setBounds(213, 152, 58, 23);
		frame.getContentPane().add(male);
		
		
		JRadioButton female = new JRadioButton("F");
		female.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender="FEMALE";
			}
		});
		buttonGroup.add(female);
		female.setBounds(294, 152, 58, 23);
		frame.getContentPane().add(female);
		
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(97, 156, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel sss1 = new JLabel("department");
		sss1.setBounds(97, 198, 86, 14);
		frame.getContentPane().add(sss1);
		
		JComboBox combo = new JComboBox();
		combo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				dept = combo.getSelectedItem().toString();
				
			}
		});
		combo.setModel(new DefaultComboBoxModel(new String[] {"BCA", "BBA", "BA", "BCOM", "MCOM"}));
		combo.setBounds(274, 195, 78, 20);
		frame.getContentPane().add(combo);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(182, 279, 89, 23);
		frame.getContentPane().add(submit);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(213, 97, 194, 22);
		frame.getContentPane().add(textArea);
		submit.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		
		String display = " ";
		String name = t1.getText();
		
		display = name + " " + gender + " " + dept;
		
		
		JOptionPane.showMessageDialog(frame, display);
	}
}
