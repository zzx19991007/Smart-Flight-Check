import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

import java.awt.event.*;

public class Search extends JFrame{
	
	private JPanel SearchPanel;
	
	public Search(){
		/*main frame*/
		/*JFrame jf = new JFrame("Search");
		//jf.setSize(400, 250);
		//jf.setLocation(400, 300);
		jf.setBounds(400, 300, 400, 250);
		jf.setResizable(false);//Prohibition maximization
		jf.setLocationRelativeTo(null);//mediate		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
		setTitle("Search System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 576, 360);
		setResizable(false);//Prohibition maximization
		setLocationRelativeTo(null);//mediate
		
		/*main panel*/
		SearchPanel = new JPanel();
		SearchPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(SearchPanel);
		SearchPanel.setLayout(null); 
		
		/*background image*/
		ImageIcon backimg;
		backimg=new ImageIcon("image.jpeg");
		
		/*Create a title label*/
		JLabel TitleLabel = new JLabel("SMART FLIGHT CHECK");
		TitleLabel.setFont(new Font("华文彩云", Font.BOLD, 35));
		TitleLabel.setForeground(Color.LIGHT_GRAY);
		TitleLabel.setBounds(90, 0, 400, 80);
		TitleLabel.setOpaque(false);
		SearchPanel.add(TitleLabel);
		
		/*Create a access label*/
		JLabel AssLabel = new JLabel();
		AssLabel.setBackground(Color.decode("#687FC3"));
		AssLabel.setBounds(10, 70, 200, 200);
		AssLabel.setOpaque(true);
		SearchPanel.add(AssLabel);
		
		/*Create a subtitle label*/
		JLabel SubTitleLabel = new JLabel("The methods of check-in:");
		SubTitleLabel.setFont(new Font("华文彩云", Font.BOLD, 13));
		SubTitleLabel.setForeground(Color.black);
		SubTitleLabel.setBounds(10, 15, 180, 20);
		SubTitleLabel.setOpaque(false);
		AssLabel.add(SubTitleLabel);
		
		/*Create a jcombobox*/
		JComboBox <String> jc = new JComboBox <String>();
		//String []access = {"Input booking number", "Enter surname and ID number", "Scan ID document"};
		jc.addItem("Input booking number");
		jc.addItem("Enter surname and ID number");
		jc.addItem("Scan ID document");
		//JComboBox jc = new JComboBox(access);
		jc.setBounds(10, 50, 180, 20);
		AssLabel.add(jc);
		
		/*create a button*/
		JButton jb = new JButton("Enter");
		jb.setBounds(60, 150, 80, 20);
		AssLabel.add(jb);
		/*Add click events*/
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		        System.out.println(jc.getSelectedIndex());
				if(jc.getSelectedIndex() == 0) {
					dispose();
					Check1 ch1 = new Check1();
					ch1.setVisible(true);
				}
				else if(jc.getSelectedIndex() == 1) {}
				else {}
	        }
		});
		
		
		JLabel BackgroundLabel = new JLabel(backimg);
		//BackgroundLabel.setBounds(0, 0, 700, 500);
		BackgroundLabel.setBounds(0, 0, backimg.getIconWidth(), backimg.getIconHeight());
		SearchPanel.add(BackgroundLabel);
	}
	
    public static void main(String[] args) {
	    Search search = new Search();
		search.setVisible(true);
	}
} 