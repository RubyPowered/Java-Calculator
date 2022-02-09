package javacalculator;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class Frame implements ActionListener {
		
	
	JFrame frame = new JFrame("JavaCalculator 2.01");
	JPanel p = new JPanel();
	ImageIcon icon = new ImageIcon("./sign.png");
	JButton mulbutton = new JButton("Multiply");
	JButton divbutton = new JButton("Divide");
	JButton addbutton = new JButton("Add");
	JButton subbutton = new JButton("Subtract");
	JLabel l = new JLabel();
	Boolean IsActivated = false;
		
	public Frame(){
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String n = System.getProperty("user.name");
		System.out.println(n);
		
		frame.setIconImage(icon.getImage());
		frame.setSize(400, 280);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		p.setLayout(null);
		p.setSize(400, 280);
		p.setBackground(Color.white);
		p.setVisible(true);
		
		mulbutton.setBounds(0, 55, 400, 50);
		mulbutton.setVisible(true);
		mulbutton.addActionListener(this);
		mulbutton.setFocusable(false);
		mulbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mulbutton.setOpaque(false);
		
		addbutton.setBounds(00, 00, 400, 50);
		addbutton.setVisible(true);
		addbutton.setBackground(Color.lightGray);
		addbutton.addActionListener(this);
		addbutton.setFocusable(false);
		addbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addbutton.setOpaque(false);
		
		divbutton.setBounds(00, 110, 400, 50);
		divbutton.setVisible(true);
		divbutton.setBackground(Color.lightGray);
		divbutton.addActionListener(this);
		divbutton.setFocusable(false);
		divbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		divbutton.setOpaque(false);
		
		subbutton.setBounds(0, 165, 400, 50);
		subbutton.setVisible(true);
		subbutton.setBackground(Color.lightGray);
		subbutton.addActionListener(this);
		subbutton.setFocusable(false);
		subbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		subbutton.setOpaque(false);
		
		
		l.setBounds(20, 190, 400, 50);
		l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l.setVisible(true);
		
		
		
		
		frame.add(p);
		
		p.add(mulbutton);
		p.add(divbutton);
		p.add(addbutton);
		p.add(subbutton);
		p.add(l);

		
		if(IsActivated==false) {
			
			
			
		}
		
		
	
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String lf;
		
		
		if(e.getSource()==mulbutton) {
			
				String fnum = JOptionPane.showInputDialog("hello, and welcome to JavaCalculator v2.1_beta please enter your first number");
		        String snum = JOptionPane.showInputDialog("Enter second number");
		        double num1 = Double.parseDouble(fnum);
		        double num2 = Double.parseDouble(snum);
		       
		        final double sum = num1 * num2;
		        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Multiplication", -1);
				frame.dispose();
				Frame frame = new Frame();
		}
		if(e.getSource()==divbutton) {
			
			String fnum = JOptionPane.showInputDialog("hello, and welcome to JavaCalculator v2.1_beta please enter your first number");
	        final String snum = JOptionPane.showInputDialog("Enter second number");
	        final double num1 = Double.parseDouble(fnum);
	        final double num2 = Double.parseDouble(snum);
	       
	        final double sum = num1 / num2;
	        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Division", -1);
			frame.dispose();
			Frame frame = new Frame();
	}
		if(e.getSource()==addbutton) {
			
			
			String fnum = JOptionPane.showInputDialog("hello, and welcome to JavaCalculator v2.1_beta please enter your first number");
	        String snum = JOptionPane.showInputDialog("Enter second number");
	        final String tnum = JOptionPane.showInputDialog("Enter third number or leave a zero");
	        final String xnum = JOptionPane.showInputDialog("Enter second number or leave a zero");
	        final double num1 = Double.parseDouble(fnum);
	        final double num2 = Double.parseDouble(snum);
	        final double num3 = Double.parseDouble(tnum);
	        final double num4 = Double.parseDouble(xnum);
	       
	        final double sum = num1 + num2 + num3 + num4;
	        JOptionPane.showMessageDialog(null, "The answer is " + sum, "Addition", -1);
			frame.dispose();
			Frame frame = new Frame();

	}
		if(e.getSource()==subbutton) {
			String fnum = JOptionPane.showInputDialog("hello, and welcome to JavaCalculator v2.1_beta please enter your first number");        
			final String snum = JOptionPane.showInputDialog("Enter second number");
			final String tnum = JOptionPane.showInputDialog("Enter third number or leave a zero");
			final String xnum = JOptionPane.showInputDialog("Enter second number or leave a zero");
			final double num1 = Double.parseDouble(fnum);
			final double num2 = Double.parseDouble(snum);
			final double num3 = Double.parseDouble(tnum);
			final double num4 = Double.parseDouble(xnum);
       
			final double sum = num1 - num2 - num3 - num4;
			JOptionPane.showMessageDialog(null, "The answer is " + sum, "Subtract", -1);
			frame.dispose();
			Frame frame = new Frame();
			}
			
		
	
	
	
	
	
	
	}
	
	}
