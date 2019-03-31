package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Add_Students extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Students frame = new Add_Students();
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
	public Add_Students() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 319, 1014, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 25, 145, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblGurdiansName = new JLabel("Gurdian's Name");
		lblGurdiansName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblGurdiansName.setBounds(59, 101, 145, 32);
		contentPane.add(lblGurdiansName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblGender.setBounds(59, 184, 145, 32);
		contentPane.add(lblGender);
		
		JTextArea stuname = new JTextArea();
		stuname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuname.setBounds(235, 26, 166, 37);
		contentPane.add(stuname);
		
		JTextArea partname = new JTextArea();
		partname.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		partname.setBounds(235, 102, 166, 37);
		contentPane.add(partname);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(235, 172, 75, 32);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(235, 213, 138, 26);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup btg=new ButtonGroup();
		btg.add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton);
		
		
		JLabel lblDob = new JLabel("DD/MM/YYYY");
		lblDob.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDob.setBounds(481, 25, 158, 32);
		contentPane.add(lblDob);
		
		JComboBox date = new JComboBox();
		for(int i=1;i<=31;i++)
		{
			String str=String.valueOf(i);
			date.addItem(str);
		}
		date.setBounds(662, 32, 48, 27);
		contentPane.add(date);
		
		JComboBox month = new JComboBox();
		month.setBounds(739, 32, 75, 27);
		month.addItem("Jan");
		month.addItem("Feb");
		month.addItem("Mar");
		month.addItem("Apr");
		month.addItem("May");
		month.addItem("Jun");
		month.addItem("Jul");
		month.addItem("Aug");
		month.addItem("Sep");
		month.addItem("Oct");
		month.addItem("Nov");
		month.addItem("Dec");
		contentPane.add(month);
		
		JComboBox year = new JComboBox();
		for(int i=1901;i<=2018;i++)
		{
			String str=String.valueOf(i);
			year.addItem(str);
		}
		year.setBounds(841, 32, 109, 27);
		contentPane.add(year);
		
		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblRollNo.setBounds(481, 184, 158, 32);
		contentPane.add(lblRollNo);
		
		JLabel lblClassTeacher = new JLabel("Class Teacher");
		lblClassTeacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClassTeacher.setBounds(481, 261, 145, 32);
		contentPane.add(lblClassTeacher);
		
		JTextArea roll = new JTextArea();
		roll.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		roll.setBounds(662, 185, 166, 37);
		contentPane.add(roll);
		
		JLabel lblSection = new JLabel("Section ");
		lblSection.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSection.setBounds(481, 101, 169, 32);
		contentPane.add(lblSection);
		
		JTextArea teacher = new JTextArea();
		teacher.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		teacher.setBounds(662, 262, 166, 37);
		contentPane.add(teacher);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblClass.setBounds(59, 261, 145, 32);
		contentPane.add(lblClass);
		
		JTextArea stuclass = new JTextArea();
		stuclass.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		stuclass.setBounds(235, 262, 166, 37);
		contentPane.add(stuclass);

		JTextArea section = new JTextArea();
		section.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		section.setBounds(662, 110, 166, 37);
		contentPane.add(section);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
				
					String name=stuname.getText();
					String writer= partname.getText();
					String  condition="Male";
					String source=stuclass.getText();
					String publisher=roll.getText();
					String prc=teacher.getText();
					String dt=(String) date.getSelectedItem();
					String mnth=(String) month.getSelectedItem();
					String yr=(String) year.getSelectedItem();
					
					if(name != "" && writer != "" && source != null && prc != null && publisher != null)
					{
						String n="\n";
						
						
						JOptionPane.showMessageDialog(btnNewButton,"Congratulations,"+n+"Book is added sucessfully"+n+"Thankyou.");
					}
					else
					{

						JOptionPane.showMessageDialog(btnNewButton,"Please,enter the informations");
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btnNewButton.setBounds(376, 318, 197, 80);
		contentPane.add(btnNewButton);
		
	}
}