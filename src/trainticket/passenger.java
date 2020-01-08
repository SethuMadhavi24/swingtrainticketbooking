package trainticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passenger extends JFrame {

	private JPanel contentPane;
	private String textFieldb1;
	private JTextField textFieldb2;
	private String textField;
	private String textField_1;

	public String getTextFieldb1() {
		return textFieldb1;
	}

	public void setTextFieldb1(String to) {
		this.textFieldb1 = to;
	}

	public JTextField getTextFieldb2() {
		return textFieldb2;
	}

	public void setTextFieldb2(JTextField textFieldb2) {
		this.textFieldb2 = textFieldb2;
	}

	public String getTextField() {
		return textField;
	}

	public void setTextField(String name) {
		this.textField = name;
	}

	public String getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(String aadhar) {
		this.textField_1 = aadhar;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passenger frame = new passenger();
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
	public passenger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKING DETAILS");
		lblNewLabel.setBounds(130, 25, 114, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(54, 96, 286, 86);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("FROM \t TO \t NAME \t AADHAR \n"
						+ textFieldb1 +"\t"+textFieldb2+ "\t"+textField + "\t"+textField_1);
				
			}
		});
		btnNewButton.setBounds(155, 211, 89, 23);
		contentPane.add(btnNewButton);
	}

}
