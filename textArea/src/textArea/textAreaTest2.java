package textArea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class textAreaTest2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					textAreaTest2 frame = new textAreaTest2();
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
	public textAreaTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));//居中，水平间距和垂直间距
		JButton[] btnButton = new JButton[9];
		int i=0;
		String[] btnNames= {"Quit","ClickHere","1","2"};
		for(i=0;i<btnButton.length;i++)
		{
			btnButton[i]=new JButton(String.valueOf(i+1));
			btnButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String text = textField.getText();
                    textField.setText(text + button.getText());
                }
            });
			btnButton[i].setPreferredSize(new Dimension(100,100));
			contentPane.add(btnButton[i]);
		}
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(500,100));
		contentPane.add(textField);
		textField.setColumns(30);
	}

}
