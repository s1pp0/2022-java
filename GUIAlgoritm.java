import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{


	Font  f2  = new Font("Courier New", Font.BOLD, 14);
	int[] yList = new int[120];
	
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Lös skiten")) {

			this.dispose();
			// sortera från lågt till högt.
			for (var i = 1; i < yList.length; i++) {
				var temp = yList[i];
				var j = i - 1;
				while (j >= 0 && yList[j] > temp) {
					yList[j + 1] = yList[j];
					j--;
				}
				yList[j + 1] = temp;
	        }
			
			

			JFrame newFrame = new JFrame();
			newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newFrame.setSize(900,500);
			newFrame.getContentPane().setBackground(new Color(255,255,255)); // Bakgrundsfärg	
			newFrame.setLayout(null);
			newFrame.setResizable(false);


			JButton space = new JButton();
			newFrame.add(space);
			JButton resetBtn = new JButton("Avsluta");
			resetBtn.setFont(f2);
			resetBtn.setForeground(new Color(240, 240, 240));
			resetBtn.setBackground(new Color(124, 3, 240));
			resetBtn.setBounds(750, 430, 120, 25);
			resetBtn.addActionListener(this);
			newFrame.add(resetBtn);
			
			int x = 10;
					

			for (int i = 13; i < yList.length; i++) {
				JPanel redpanel = new JPanel();
				redpanel.setBackground(new Color(124, 3, 240));
				redpanel.setBounds(x, 0, 5, yList[i]);
				newFrame.add(redpanel);

				x += 8;

				
				
			}


			ImageIcon img = new ImageIcon("C:/Users/samue/Downloads/connection.png");
			newFrame.setIconImage(img.getImage());
			newFrame.setTitle("  𝚂𝚊𝚖𝚎𝚡 -  𝚊𝚕𝚐𝚘𝚛𝚒𝚝𝚖𝙰𝚙𝚙𝚕𝚒𝚔𝚊𝚝𝚒𝚘𝚗 ✓");
			newFrame.setVisible(true);
		}
		else if (e.getActionCommand().equals("Slumpa ny")) {
			dispose();
			MyFrame myFrame = new MyFrame();
			
		}
		else if (e.getActionCommand().equals("Avsluta")) {
			System.exit(0);
		}
		
	}
	
	
	MyFrame() {
		
		
		
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,500);
		this.getContentPane().setBackground(new Color(255,255,255)); // Bakgrundsfärg	
		this.setLayout(null);
		this.setResizable(false);

		JButton hide = new JButton();
		this.add(hide);
		
		JButton startButton = new JButton("Lös skiten");
		startButton.setFont(f2);
		startButton.setForeground(new Color(240, 240, 240));
		startButton.setBackground(new Color(124, 3, 240));
		startButton.setBounds(750, 430, 120, 25);
		
		startButton.addActionListener(this);
		
		this.add(startButton);
		
		JButton newButton = new JButton("Slumpa ny");
		newButton.setBounds(610, 430, 120, 25);
		newButton.setFont(f2);
		newButton.setForeground(new Color(240, 240, 240));
		newButton.setBackground(new Color(124, 3, 240));
		
		newButton.addActionListener(this);
		
		this.add(newButton);

		
	
		
		
		int x = 15;
		int y;
				
		int counter = 0;
		
		int min = 10;
		int max = 400;
		
		while (counter <= 106) {
			
			y = (int)Math.floor(Math.random()*(max-min+1)+min);
			
			JPanel redpanel = new JPanel();
			redpanel.setBackground(new Color(124, 3, 240));
			redpanel.setBounds(x, 0, 5, y);
			this.add(redpanel);
			
			yList[counter] = y;
			
			x += 8;
			counter += 1;
		}
		
		
		
	
		
		ImageIcon img = new ImageIcon("C:/Users/samue/Downloads/connection.png");
		this.setIconImage(img.getImage());
		this.setTitle("  𝚂𝚊𝚖𝚎𝚡 -  𝚊𝚕𝚐𝚘𝚛𝚒𝚝𝚖𝙰𝚙𝚙𝚕𝚒𝚔𝚊𝚝𝚒𝚘𝚗");
		this.setVisible(true);
	

	}
}
