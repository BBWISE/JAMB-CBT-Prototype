

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Calculator extends JFrame {
	public double S;
	public static double label1; static String label2="+";
	static String number;
	static JButton equalTo = new JButton("=");
	static JTextField text;
	static JButton plus = new JButton("+");
	static JButton minus = new JButton("-");
	static JLabel L1 = new JLabel("l1");
	static JLabel L2 = new JLabel("l2");
	static JButton division = new JButton("/");
	static JButton mult=new JButton("*");
	static JButton one=new JButton("1");
	static JButton two=new JButton("2");
	static JButton three=new JButton("3");
	static JButton four=new JButton("4");
	static JButton five=new JButton("5");
	static JButton six=new JButton("6");
	static JButton seven=new JButton("7");
	static JButton eight=new JButton("8");
	static JButton nine=new JButton("9");
	static JButton zeroa=new JButton("0");
	static JButton dota=new JButton(".");
	static JButton ce=new JButton("CE");
	
	static JPanel AllPanel;
	public static void CalFrame() {
		text = new JTextField(8);
		JPanel fPanel = new JPanel();
		fPanel.setLayout(new GridLayout(7,3));
		
		fPanel.add(new JLabel(" "));
		fPanel.add(new JLabel(" "));
		//fPanel.add(new JLabel(" "));
		fPanel.add(ce);
		ce.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 text.setText("");
			}
		});
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 number = String.format(one.getText());
				 text.setText(text.getText()+number);
			}
		});
		fPanel.add(one);
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(two.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(two);
		three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(three.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(three);
		four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(four.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(four);
		five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(five.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(five);
		six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(six.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(six);
		seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(seven.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(seven);
		eight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(eight.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(eight);
		nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(nine.getText());
				text.setText(text.getText()+number);
			}
		});
		fPanel.add(nine);

		
		fPanel.add(zeroa);
		
		plus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 L2.setText(label2);
				 if (label2.contentEquals("+")) {
					 label1 += Double.parseDouble(text.getText());
					 
				 }
				 else if(label2.contentEquals("-")) {
					 label1 -= Double.parseDouble(text.getText());
					 
				 }
				 else if (label2.contentEquals("/")) {
					 label1 /= Double.parseDouble(text.getText());
					 
				 }
				 else
				 {
					 label1 *= Double.parseDouble(text.getText());
					 
				 }
				 @SuppressWarnings("unused")
				 String m = Double.toString(label1);
				 text.setText(null);
				 label2 = String.format(plus.getText());
			}
		});
		plus.setBackground(Color.red);
		plus.setForeground(Color.green);
		plus.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(plus);
		
		minus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 L2.setText(label2);
				 if (label2.contentEquals("+")) {
					 label1 += Double.parseDouble(text.getText());
				 }
				 else if(label2.contentEquals("-")) {
					 label1 -= Double.parseDouble(text.getText());
				 }
				 else if (label2.contentEquals("/")) {
					 label1 /= Double.parseDouble(text.getText());
				 }
				 else
				 {
					 label1 *= Double.parseDouble(text.getText());
				 }
				 @SuppressWarnings("unused")
				 String m = Double.toString(label1);
				 text.setText(null);
				 label2 = String.format(minus.getText());
			}
		});
		minus.setBackground(Color.red);
		minus.setForeground(Color.green);
		minus.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(minus);
		zeroa.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(zeroa.getText());
				text.setText(text.getText()+number);
			}
		});
		mult.addActionListener(new ActionListener(){
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent event) {
				 L2.setText(label2);
				 if (label2.contentEquals("+")) {
					 label1 += Double.parseDouble(text.getText());
				 }
				 else if(label2.contentEquals("-")) {
					 label1 -= Double.parseDouble(text.getText());
				 }
				 else if (label2.contentEquals("/")) {
					 label1 /= Double.parseDouble(text.getText());
				 }
				 else
				 {
					 label1 *= Double.parseDouble(text.getText());
				 }
				 
				 String m = Double.toString(label1);
				 text.setText(null);
				 label2 = String.format(mult.getText());
			}
		});
		mult.setBackground(Color.red);
		mult.setForeground(Color.green);
		mult.setFont(new Font("Calibril", Font.BOLD,22));
		
		dota.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				number = String.format(dota.getText());
				text.setText(text.getText()+number);
			}
		});
		
		fPanel.add(dota);
		
		fPanel.add(mult);
		
		division.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				L2.setText(label2);
				 if (label2.contentEquals("+")) {
					 label1 += Double.parseDouble(text.getText());
				 }
				 else if(label2.contentEquals("-")) {
					 label1 -= Double.parseDouble(text.getText());
				 }
				 else if (label2.contentEquals("/")) {
					 label1 /= Double.parseDouble(text.getText());
				 }
				 else
				 {
					 label1 *= Double.parseDouble(text.getText());
				 }
				 
				 @SuppressWarnings("unused")
				String m = Double.toString(label1);
				 text.setText(null);
				 label2 = String.format(division.getText());
			}
		});
		division.setBackground(Color.red);
		division.setForeground(Color.green);
		division.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(division);
		
		equalTo.setToolTipText("This will sumup the values");
		equalTo.setBackground(Color.blue);
		equalTo.setFont(new Font("Calibril", Font.BOLD, 22));
		equalTo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				 L2.setText(label2);
				 if (label2.contentEquals("+")) {
					 label1 += Double.parseDouble(text.getText());
				 }
				 else if(label2.contentEquals("-")) {
					 label1 -= Double.parseDouble(text.getText());
				 }
				 else if (label2.contentEquals("/")) {
					 label1 /= Double.parseDouble(text.getText());
				 }
				 else
				 {
					 label1 *= Double.parseDouble(text.getText());
				 }
				 
				 String m = Double.toString(label1);
				 text.setText(m);
				 label1=0;
				 label2 = "+";
				 
				 
				 @SuppressWarnings("unused")
				double texta;
				 texta = Double.parseDouble(text.getText());
			}
		});
		
		fPanel.add(new JLabel(" "));
		fPanel.add(new JLabel(" "));
		
		fPanel.add(equalTo);
		
		JPanel sPanel = new JPanel();
		sPanel.setLayout(new BorderLayout());
		sPanel.add(new JLabel("B.B. WiSE CALCULATOR"), BorderLayout.NORTH);
		sPanel.add(L1);
		sPanel.add(L2);
		//text.addActionListener(handles);
		text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		text.setFont(new Font("Calibri", Font.BOLD,17));
		sPanel.add(text, BorderLayout.CENTER);
		
		AllPanel = new JPanel(new BorderLayout());
		AllPanel.add(sPanel, BorderLayout.NORTH);
		AllPanel.add(fPanel, BorderLayout.CENTER);
		
		JOptionPane.showConfirmDialog(null, AllPanel,"JAMB Prototype Calculator",JOptionPane.CLOSED_OPTION,JOptionPane.PLAIN_MESSAGE);
		
	}
/*	public static void main(String [] args) {
		CalFrame();
	}*/
	
}
