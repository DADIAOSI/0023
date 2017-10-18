package textArea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.graphics.Font;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JPanel textPanel = new JPanel();
	private final JPanel btnPanel = new JPanel();
	private final JPanel operPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(new BorderLayout());
		textPanel.setLayout(new FlowLayout());
		textPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(textPanel, BorderLayout.NORTH);
		btnPanel.setLayout(new GridLayout(3,3));
		//btnPanel.setPreferredSize(new Dimension(600,250));
		//btnPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(btnPanel, BorderLayout.CENTER);
		//操作区域
		operPanel.setLayout(new GridLayout(3,2));
		//operPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(operPanel, BorderLayout.EAST);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(100,100));
		textPanel.add(textField);
		textField.setColumns(80);
		
		JButton[] btnButton = new JButton[9];
		int i=0;
		String[] btnNames=new String[9];
		for(i=0;i<9;i++)
		{
			btnNames[i]=Integer.toString(i+1);
		}
		for(i=0;i<btnButton.length;i++)
		{
			btnButton[i]=new JButton(btnNames[i]);
			btnButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String text = textField.getText();
                    textField.setText(text + button.getText());
                }
            });
			btnButton[i].setPreferredSize(new Dimension(100,100));
			btnPanel.add(btnButton[i]);
		}
		JButton[] operButton = new JButton[6];
		String[] operNames= {"0",".","+","-","*","/"};
		for(i=0;i<operButton.length;i++)
		{
			operButton[i]=new JButton(operNames[i]);
			operButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String text = textField.getText();
                    textField.setText(text + button.getText());
                }
            });
			operButton[i].setPreferredSize(new Dimension(100,100));
			operPanel.add(operButton[i]);
		}
		
	}

}
