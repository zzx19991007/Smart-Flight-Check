import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

import java.awt.event.*;

public class Operation extends JFrame{
    private JPanel OperaPanel;
	
	public Operation(){
		setTitle("Check With Booking Number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 576, 360);
		setResizable(false);//Prohibition maximization
		setLocationRelativeTo(null);//mediate
		
		/*main panel*/
		OperaPanel = new JPanel();
		OperaPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(OperaPanel);
		OperaPanel.setLayout(null);
		
		/*background image*/
		ImageIcon backimg;
		backimg=new ImageIcon("image.jpeg");
		
		/*Create a title label*/
		JLabel TitleLabel = new JLabel("SMART FLIGHT CHECK");
		TitleLabel.setFont(new Font("华文彩云", Font.BOLD, 35));
		TitleLabel.setForeground(Color.LIGHT_GRAY);
		TitleLabel.setBounds(90, 0, 400, 80);
		TitleLabel.setOpaque(false);
		OperaPanel.add(TitleLabel);
		
		/*Create a form*/
		
		JLabel BackgroundLabel = new JLabel(backimg);
		//BackgroundLabel.setBounds(0, 0, 700, 500);
		BackgroundLabel.setBounds(0, 0, backimg.getIconWidth(), backimg.getIconHeight());
		OperaPanel.add(BackgroundLabel);
	}
}