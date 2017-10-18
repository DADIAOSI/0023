package textArea;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class s3 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			s3 dialog = new s3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public s3() {
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(124, 12, 518, 50);
		contentPanel.add(textField);
		textField.setColumns(10);
		JButton[][] operButton= new JButton[4][3];
		int i=0;
		int j=0;
		String[][]operLabel= {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"0","."," "}};
		int xButton=0;
		int yButton=100;
		 final int x_Step=150;
		 final int y_Step=100;
		 int x_beginPos=50;
		 int y_beginPos=100;
		 int intCount=0;
		for(i=0;i<4;i++)
		{
			yButton=y_beginPos+y_Step*i;
			xButton=x_beginPos;
			for(j=0;j<3;j++)
			{
				operButton[i][j]=new JButton(operLabel[i][j]);
				xButton=x_beginPos+x_Step*j;
				operButton[i][j].addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    JButton button = (JButton) e.getSource();
	                    String text = textField.getText();
	                    textField.setText(text + button.getText());
	                }
	            });
				operButton[i][j].setBounds(xButton, yButton, 100, 50);
				contentPanel.add(operButton[i][j]);
			}
		
		}
	}
}
