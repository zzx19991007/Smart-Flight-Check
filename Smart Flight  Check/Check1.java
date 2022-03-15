import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

import java.awt.event.*;

public class Check1 extends JFrame{
	private JPanel Check1Panel;
	
	public Check1(){
		setTitle("Check With Booking Number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 576, 360);
		setResizable(false);//Prohibition maximization
		setLocationRelativeTo(null);//mediate
		
		/*main panel*/
		Check1Panel = new JPanel();
		Check1Panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(Check1Panel);
		Check1Panel.setLayout(null);
		
		/*background image*/
		ImageIcon backimg;
		backimg=new ImageIcon("image.jpeg");
		
		/*Create a title label*/
		JLabel TitleLabel = new JLabel("SMART FLIGHT CHECK");
		TitleLabel.setFont(new Font("华文彩云", Font.BOLD, 35));
		TitleLabel.setForeground(Color.LIGHT_GRAY);
		TitleLabel.setBounds(90, 0, 400, 80);
		TitleLabel.setOpaque(false);
		Check1Panel.add(TitleLabel);
		
		/*Create a access label*/
		JLabel AssLabel = new JLabel();
		AssLabel.setBackground(Color.decode("#687FC3"));
		AssLabel.setBounds(10, 70, 200, 200);
		AssLabel.setOpaque(true);
		Check1Panel.add(AssLabel);
		
		/*Create a subtitle label*/
		/*JLabel SubTitleLabel = new JLabel("Please input your booking num:");
		SubTitleLabel.setFont(new Font("华文彩云", Font.BOLD, 13));
		SubTitleLabel.setForeground(Color.black);
		SubTitleLabel.setBounds(10, 15, 180, 20);
		SubTitleLabel.setOpaque(false);
		AssLabel.add(SubTitleLabel);*/
		
		/*Create a booking num label*/
		final JFormattedTextField bookingNum = new JFormattedTextField();
		bookingNum.setForeground(Color.LIGHT_GRAY);
		bookingNum.setToolTipText("Please input your booking num.");
		bookingNum.setBorder(BorderFactory.createTitledBorder("Booking Num"));
		bookingNum.setText("Please input your booking num.");
		bookingNum.setBounds(10, 50, 180, 40);
		AssLabel.add(bookingNum);
		/*Add a text box event*/
		bookingNum.addMouseListener(new MouseListener(){
			public void mousePressed(MouseEvent e) {
				if(bookingNum.getText().equals("Please input your booking num."))
				bookingNum.setText(null);
				bookingNum.setForeground(Color.BLACK);
			}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});
		
		/*create a button*/
		JButton jb = new JButton("Search");
		jb.setBounds(60, 120, 80, 20);
		AssLabel.add(jb);
		/*Legitimacy test*/
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		        System.out.println(bookingNum.getText());
				if(bookingNum.getText()==null){
					JOptionPane.showMessageDialog(null, "<html><body>Figure Error!" + "<br>" + "Please enter the correct booking num!</html>", "Alert", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else{
					if(bookingNum.getText().length()!=13){
					    JOptionPane.showMessageDialog(null, "<html><body>Figure Error!" + "<br>" + "Please enter the correct booking num!</html>", "Alert", JOptionPane.ERROR_MESSAGE); 
					    return;
				    }
				    else{
					    for(int i = 0; i<bookingNum.getText().length(); i++){
					        if(bookingNum.getText().charAt(i)<'0'||bookingNum.getText().charAt(i)>'9'){
						        JOptionPane.showMessageDialog(null, "<html><body>Formal Error!" + "<br>" + "Please enter the correct booking num!</html>", "Alert", JOptionPane.ERROR_MESSAGE); 
						        break;
					        }
				        }
						    dispose();
					        Operation opera = new Operation();
					        opera.setVisible(true);
				    }
				}
	        }
		});
		
		/*create a button*/
		JButton jb1 = new JButton("Back");
		jb1.setBounds(60, 150, 80, 20);
		AssLabel.add(jb1);
		/*Return to previous page*/
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			    Search search = new Search();
			    search.setVisible(true);
			}
		});
		
		JLabel BackgroundLabel = new JLabel(backimg);
		//BackgroundLabel.setBounds(0, 0, 700, 500);
		BackgroundLabel.setBounds(0, 0, backimg.getIconWidth(), backimg.getIconHeight());
		Check1Panel.add(BackgroundLabel);
	}
    
}