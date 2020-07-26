import javax.swing.*;
import java.awt.event.*;

public class Calculate3 {
	public static void main(String[] args){
		JFrame window = new JFrame();
		
		window.setTitle("Simple Calculator");
		window.setSize(250,350);
		
		JLabel lb = new JLabel();
		lb.setText("Enter first number:");
		
		
		final JTextField t1 = new JTextField();
		//t1.setBounds(arg0, arg1, arg2, arg3);
		t1.setColumns(10);
		
		JLabel lb2 = new JLabel();
		lb2.setText("Enter second number:");
		
		final JTextField t2 = new JTextField();
		t2.setColumns(10);
		
		JLabel lb3 = new JLabel();
		lb3.setText("Enter operation (+,-,*,/:)");
		
		final JTextField t3 = new JTextField();
		t3.setColumns(10);
		
		JButton calculateButton = new JButton();
		calculateButton.setText("Calculate");
		
		JPanel panel = new JPanel();
		
	    panel.add(lb);
		panel.add(t1);
		panel.add(lb2);
		panel.add(t2);
		panel.add(lb3);
		panel.add(t3);
		panel.add(calculateButton);
		
		calculateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String input1;
				String input2;
				String op;
				final Double result;
				
				
				Double converted1;
				Double converted2;
				
				String plus = "+";
				String minus = "-";
				String mult = "*";
				String div = "/";
				
				input1 = t1.getText();
				input2 = t2.getText();
				op = t3.getText();
				
				//System.out.println(input1 + input2);
				
				
				converted1 = Double.parseDouble(input1);
				converted2 = Double.parseDouble(input2);
				
				if(op.equals(plus)){
					result = converted1 + converted2;
				}
				else if(op.equals(minus)){
					result = converted1 - converted2;
				}
				else if(op.equals(mult)){
					result = converted1 * converted2;
				}
				else if(op.equals(div)){
					result = converted1 / converted2;
				}
				else{
					result = null;
				}
				String out;
				
				out = String.valueOf(result);
				System.out.println(out);
				
				JOptionPane ob1 = new JOptionPane();
				ob1.showMessageDialog(null, "The result is " + out);
				
			}
		});
		
		window.add(panel);
		
		window.setVisible(true);
	}
	
}
