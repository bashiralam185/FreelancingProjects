package Football_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ticketing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketing window = new Ticketing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	public  Ticketing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1200, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(54, 33, 1067, 78);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Football Ticketing");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblClass = new JLabel("Ticket Type");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(70, 151, 107, 27);
		frame.getContentPane().add(lblClass);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnStandard.setBounds(68, 187, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnEconomy.setBounds(68, 224, 109, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnFirstClass.setBounds(54, 268, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Match Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnSingleTicket.setBounds(179, 187, 160, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnAdult.setBounds(371, 224, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnChild.setBounds(371, 187, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Two Match Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnReturnTicket.setBounds(179, 224, 133, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(104, 191, 1, 2);
		frame.getContentPane().add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select 2st Match", "Arsenal Vs Fulham", "Manchester United Vs Burnley", "Leicester City Vs Southampton", "Coventry CIty Vs Barnsley", "Rotherham United Vs Birmingham City"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(359, 268, 180, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select 1st Match", "Arsenal Vs Fulham", "Manchester United Vs Burnley", "Leicester City Vs Southampton", "Coventry CIty Vs Barnsley", "Rotherham United Vs Birmingham City"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
//		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Select 2nd Match", "Arsenal Vs Fulham", "Manchester United Vs Burnley", "Leicester City Vs Southampton", "Coventry CIty Vs Barnsley", "Rotherham United Vs Birmingham City"}));
		comboBox_1.setBounds(165, 269, 180, 22);
		frame.getContentPane().add(comboBox_1);
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(54, 176, 426, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(54, 298, 426, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTax.setBounds(75, 311, 59, 33);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubtotal.setBounds(75, 355, 84, 38);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(75, 404, 59, 30);
		frame.getContentPane().add(lblTotal);
		
		JLabel label = new JLabel("");
		label.setBounds(159, 334, 46, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(217, 318, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(217, 365, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(217, 410, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(54, 445, 426, 2);
		frame.getContentPane().add(separator_3);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				double tax=19.40;
				double MilesK8=25.78;
				double MilesK12=25.10;
				double MilesK20=45.23;
				double MilesK30=55.98;
				double totalCost,eco=3.58,fclass=5.60;
				if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())
						&&(comboBox_1.getSelectedItem().equals("Arsenal Vs Fulham"))) {
					totalCost=(tax+MilesK8)/100;
					String  sTax=String.format("$%.2f",totalCost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f",MilesK8);
					textField_1.setText(subTotal);
					String Total=String.format("$%.2f",MilesK8+totalCost);
					textField_2.setText(Total);
					textField_12.setText(Total);
					
					textField_3.setText("STD");
					textField_4.setText("One Match");
					textField_5.setText("One");
					textField_6.setText("NIL");					
					
				}
				if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& (rdbtnChild.isSelected())
						&&(comboBox_1.getSelectedItem().equals("Arsenal Vs Fulham"))) {
					totalCost=(tax+MilesK8)/100;
					String  sTax=String.format("$%.2f",totalCost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f",MilesK20);
					textField_1.setText(subTotal);
					String Total=String.format("$%.2f",MilesK8+totalCost);
					textField_2.setText(Total);
					textField_12.setText(Total);
					
					textField_3.setText("STD");
					textField_4.setText("One Match");
					textField_5.setText("One");
					textField_6.setText("One");					
					
				}
				
				if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& (rdbtnChild.isSelected())
						&&(comboBox_1.getSelectedItem().equals("Arsenal Vs Fulham"))) {
					totalCost=(tax+MilesK8)/100;
					String  sTax=String.format("$%.2f",totalCost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f",MilesK30);
					textField_1.setText(subTotal);
					String Total=String.format("$%.2f",MilesK8+totalCost);
					textField_2.setText(Total);
					textField_12.setText(Total);
					
					textField_3.setText("Economy");
					textField_4.setText("One Match");
					textField_5.setText("One");
					textField_6.setText("One");					
					
				}
				if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& (rdbtnChild.isSelected())
						&&(comboBox_1.getSelectedItem().equals("Arsenal Vs Fulham"))) {
					totalCost=(tax+MilesK12)/100;
					String  sTax=String.format("$%.2f",totalCost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f",MilesK20);
					textField_1.setText(subTotal);
					String Total=String.format("$%.2f",MilesK20+totalCost);
					textField_2.setText(Total);
					textField_12.setText(Total);
					
					textField_3.setText("FristClass");
					textField_4.setText("One Match");
					textField_5.setText("One");
					textField_6.setText("One");					
					
				}
				
				
			}
		});
		btnNewButton.setToolTipText("Total Cost of Tickets");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//========================Time=======================//
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTimer=new SimpleDateFormat("HH:mm:ss");
				textField_10.setText(tTimer.format(timer.getTime()));
				
				//===============Date=================================//
				SimpleDateFormat Tdate= new SimpleDateFormat("dd:MM:YYYY");
				textField_11.setText(Tdate.format(timer.getTime()));
				
				textField_8.setText((String)comboBox.getSelectedItem()+"*");
				textField_7.setText((String)comboBox_1.getSelectedItem()+"*");
				
				//============================Random Number Generator =================//
				
				int num1;
				String q1="";
				num1=12345+ (int) (Math.random()*4238);
				q1+=num1+1325;
				textField_9.setText(q1);	
				
				//=======================================================//
				textField_13.setText((String)comboBox_1.getSelectedItem());
				
			}
		});
		btnNewButton.setBounds(70, 482, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setToolTipText("Reset System");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				comboBox.setSelectedItem("Matches");
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(214, 482, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setToolTipText("Exit System");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame =new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm, If you want to Exit.", "Ticketing System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
		}
		});
		btnNewButton_2.setBounds(371, 482, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(549, 176, 1, 350);
		frame.getContentPane().add(separator_4);
		
		JLabel lblClass_1 = new JLabel("Class");
		lblClass_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClass_1.setBounds(658, 179, 84, 38);
		frame.getContentPane().add(lblClass_1);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicket.setBounds(790, 179, 84, 38);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdult.setBounds(912, 176, 84, 38);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChild.setBounds(1037, 172, 84, 38);
		frame.getContentPane().add(lblChild);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(656, 226, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(788, 227, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(912, 226, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(1035, 226, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(588, 284, 552, 2);
		frame.getContentPane().add(separator_5);
		
		JLabel lblFrom = new JLabel("First Match");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(588, 321, 84, 38);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("Second Match");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(580, 383, 123, 38);
		frame.getContentPane().add(lblTo);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(694, 334, 180, 38);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(694, 393, 180, 41);
		frame.getContentPane().add(textField_8);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(815, 311, 1, 123);
		frame.getContentPane().add(separator_6);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(933, 321, 84, 38);
		frame.getContentPane().add(lblTicketNo);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(899, 322, 1, 240);
		frame.getContentPane().add(separator_7);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(933, 365, 123, 28);
		frame.getContentPane().add(textField_9);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(588, 445, 84, 38);
		frame.getContentPane().add(lblTime);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(588, 488, 84, 38);
		frame.getContentPane().add(lblDate);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(656, 455, 116, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(656, 506, 116, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(933, 400, 84, 38);
		frame.getContentPane().add(lblPrice);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(933, 445, 107, 27);
		frame.getContentPane().add(textField_12);
		
		JLabel lblMatch = new JLabel("Match");
		lblMatch.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMatch.setBounds(933, 475, 84, 38);
		frame.getContentPane().add(lblMatch);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(933, 524, 207, 38);
		
		frame.getContentPane().add(textField_13);
		

	}
}
