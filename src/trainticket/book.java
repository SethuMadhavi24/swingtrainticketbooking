package trainticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class book {

	private JFrame frame;
	private JTextField textFieldb1;
	private JTextField textFieldb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
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
	public book() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK YOUR TRAIN TICKET");
		lblNewLabel.setBounds(168, 33, 169, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FROM");
		lblNewLabel_1.setBounds(93, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TO");
		lblNewLabel_2.setBounds(93, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DATE");
		lblNewLabel_3.setBounds(93, 156, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CLASS");
		lblNewLabel_4.setBounds(93, 204, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NOOFPASSENGER");
		lblNewLabel_5.setBounds(75, 245, 80, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldb1 = new JTextField();
		textFieldb1.setBounds(204, 73, 86, 20);
		frame.getContentPane().add(textFieldb1);
		textFieldb1.setColumns(10);
		
		textFieldb2 = new JTextField();
		textFieldb2.setBounds(204, 114, 86, 20);
		frame.getContentPane().add(textFieldb2);
		textFieldb2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FIRST", "SECOND ", "THIRD"}));
		comboBox.setBounds(204, 201, 86, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(204, 245, 86, 20);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				details second=new details();
				setVisible(false);
				second.setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(120, 283, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String from=textFieldb1.getText();
				String to=textFieldb2.getText();
				String cls = (String)comboBox.getSelectedItem();
				String noofpas = comboBox.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null,"sucessfully added");
				passenger pas=new passenger();
				details det=new details();
				pas.setTextFieldb1(from);
				pas.setTextFieldb1(to);
				det.setVisible(true);
				/*det.setTextField_2(to);
				det.setTextField_3(noofseat);
				det.setTextField_4(cost);*/
				
				//details det1=new details();
				
				
			}
		});
		btnNewButton_1.setBounds(251, 283, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
