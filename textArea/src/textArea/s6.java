package textArea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class s6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					s6 frame = new s6();
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
	public s6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(156, 48, 77, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		JButton[][] btnButton =new JButton[3][3];
		int i=0;
		int j=0;
		int x_step=200;
		int y_step=50;
		int yPos=173;
		int xPos=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				xPos=79+x_step*j;
				btnButton[i][j] = new JButton(String.valueOf(i+1));
				btnButton[i][j].setBounds(xPos, yPos, 117, 25);
				contentPane.add(btnButton[i][j]);
				System.out.println(xPos +"  " +yPos);
			}
			yPos+=y_step;
			
		}
		/*
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(79, 173, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(279, 173, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(477, 195, 117, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(79, 261, 117, 25);
		contentPane.add(btnNewButton_3);
		*/
	}
}
