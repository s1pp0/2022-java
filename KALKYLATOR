
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	
	JPanel panel;
	Font myFont = new Font("Arial", Font.BOLD, 25);
	
	
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	Main() {
		
		frame = new JFrame("  𝙆 𝘼 𝙇 𝙆 𝙔 𝙇 𝘼 𝙏 𝙊 𝙍  ━  𝙎𝙖𝙢𝙚𝙭"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.decode("#000814"));
		frame.setResizable(false);
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("C");
		negButton = new JButton("(-)");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		for(int i = 0; i < 9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setBackground(Color.BLACK);
			functionButtons[i].setForeground(Color.white);
		}
		
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i)); 
			numberButtons[i].setBackground(Color.BLACK);
		    numberButtons[i].setForeground(Color.white);
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		negButton.setBounds(50, 100, 68, 50);
		delButton.setBounds(128, 100, 144, 50);
		clrButton.setBounds(282, 100, 66, 50);
		
		
		panel = new JPanel();
		panel.setBounds(50, 165, 300, 300);
		panel.setLayout(new GridLayout(4,4, 10, 10));
		panel.setBackground(Color.black);

		frame.getContentPane();	
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);		
		panel.add(equButton);
		panel.add(divButton);
		
		
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.add(negButton);
		
		ImageIcon img = new ImageIcon("C:/Users/samue/Downloads/calculator.png");
		frame.setIconImage(img.getImage());
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		Main calc = new Main();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
		}
		if(e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		
		if(e.getSource() == subButton) {
			if (textfield.getText() == "") {
				System.out.println("tomt");
			}
			else {
				num1 = Double.parseDouble(textfield.getText());
				operator = '-';
				textfield.setText("");	
			}
			
		}
		
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case'+':
				result = num1 + num2;
				break;
			case'-':
				result = num1 - num2;
				break;
			case'*':
				result = num1 * num2;
				break;
			case'/':
				result = num1 / num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
			
			
		}
		
		if(e.getSource() == clrButton) {
			textfield.setText("");
		}
		
		if(e.getSource() == delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for (int i = 0; i < string.length()-1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
			
		}
		
		if(e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
			
		
		
	}

}
