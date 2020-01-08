package trainticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.awt.event.ActionEvent;

public class details extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details frame = new details();
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
	public details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PASSENGER DETAILS");
		lblNewLabel.setBounds(120, 11, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(54, 50, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AADHAR NO.");
		lblNewLabel_2.setBounds(36, 87, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DOB");
		lblNewLabel_3.setBounds(54, 127, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setBounds(54, 165, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setBounds(150, 161, 51, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setBounds(212, 161, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(153, 121, 91, 20);
		contentPane.add(dateChooser);
		
		textField = new JTextField();
		textField.setBounds(146, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 84, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD PASSENGER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String aadhar=textField_1.getText();
				JDateChooser jDateChooser1 = null;
				//Date date = (Date) jDateChooser1.getDate();
				//String strDate = DateFormat.getDateInstance().format(date);
				details det=new details();
				passenger pas=new passenger();
				pas.setTextField(name);
				pas.setTextField_1(aadhar);
				pas.setVisible(true);
				
				/*String gender;
				if(rdbtnNewRadioButton.isSelected())
			    {
			        
			    }
			    else if(rdbtnNewRadioButton_1.isSelected())
			    {
			        return "Female";
			    }
			    else
			    {
			        return null;
			    }*/
			}
		});
		btnNewButton.setBounds(82, 212, 89, 23);
		contentPane.add(btnNewButton);
	}

	public void setTextFieldb1(String from) {
		// TODO Auto-generated method stub
		
	}
}
