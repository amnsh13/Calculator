package com.aman.Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Calculator extends JFrame implements ActionListener  {
	JTextArea area;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bans, bdot, bclr;
	boolean add, sub, mul, div;
	double var1, var2;
	private JLabel label;

	private static final long serialVersionUID = 1L;

	public Calculator() {
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		this.setResizable(false);

		area = new JTextArea();
		area.setBounds(5, 5, 375, 50);

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bdot = new JButton(".");
		bans = new JButton("=");
		bclr = new JButton("CLR");

		b1.setBounds(5, 70, 60, 40);
		b2.setBounds(85, 70, 60, 40);
		b3.setBounds(170, 70, 60, 40);
		b4.setBounds(5, 115, 60, 40);
		b5.setBounds(85, 115, 60, 40);
		b6.setBounds(170, 115, 60, 40);
		b7.setBounds(5, 160, 60, 40);
		b8.setBounds(85, 160, 60, 40);
		b9.setBounds(170, 160, 60, 40);
		b0.setBounds(5, 205, 60, 40);
		bdot.setBounds(85, 205, 60, 40);
		badd.setBounds(250, 70, 60, 40);
		bsub.setBounds(250, 115, 60, 40);
		bmul.setBounds(250, 160, 60, 40);
		bdiv.setBounds(250, 205, 60, 40);
		bans.setBounds(170, 205, 60, 40);
		bclr.setBounds(320, 70, 60, 175);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdot.addActionListener(this);
		bans.addActionListener(this);
		bclr.addActionListener(this);

		label = new JLabel("@b_sky99|2018");
		label.setBounds(150, 235, 700, 30);

		Font f = new Font("Arial", Font.PLAIN, 30);
		area.setFont(f);

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b0);
		this.add(badd);
		this.add(bsub);
		this.add(bmul);
		this.add(bdiv);
		this.add(bans);
		this.add(bdot);
		this.add(area);
		this.add(label);
		this.add(bclr);

	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			area.setText(area.getText() + "1");
			// JOptionPane.showMessageDialog(null, "you pressed 1");
		} else if (e.getSource().equals(b2)) {
			area.setText(area.getText() + "2");
			// JOptionPane.showMessageDialog(null, "you pressed 2");
		} else if (e.getSource().equals(b3)) {
			area.setText(area.getText() + "3");
			// JOptionPane.showMessageDialog(null, "you pressed 3");
		} else if (e.getSource().equals(b4)) {
			area.setText(area.getText() + "4");
			// JOptionPane.showMessageDialog(null, "you pressed 4");
		} else if (e.getSource().equals(b5)) {
			area.setText(area.getText() + "5");
			// JOptionPane.showMessageDialog(null, "you pressed 5");
		} else if (e.getSource().equals(b6)) {
			area.setText(area.getText() + "6");
			// JOptionPane.showMessageDialog(null, "you pressed 6");
		} else if (e.getSource().equals(b7)) {
			area.setText(area.getText() + "7");
			// JOptionPane.showMessageDialog(null, "you pressed 7");
		} else if (e.getSource().equals(b8)) {
			area.setText(area.getText() + "8");
			// JOptionPane.showMessageDialog(null, "you pressed 8");
		} else if (e.getSource().equals(b9)) {
			area.setText(area.getText() + "9");
			// JOptionPane.showMessageDialog(null, "you pressed 9");
		} else if (e.getSource().equals(b0)) {
			area.setText(area.getText() + "0");
			// JOptionPane.showMessageDialog(null, "you pressed 0");
		} else if (e.getSource().equals(bdot)) {
			area.setText(area.getText() + ".");
			// JOptionPane.showMessageDialog(null, "you pressed .");
		} else if (e.getSource().equals(badd)) {
			var1 = Double.parseDouble(area.getText() + "");
			add = true;
			area.setText(null);
			// JOptionPane.showMessageDialog(null, "you pressed +");
		} else if (e.getSource().equals(bmul)) {
			var1 = Double.parseDouble(area.getText() + "");
			mul = true;
			area.setText("");
			// JOptionPane.showMessageDialog(null, "you pressed *");
		} else if (e.getSource().equals(bsub)) {
			var1 = Double.parseDouble(area.getText() + "");
			sub = true;
			area.setText("");
			// JOptionPane.showMessageDialog(null, "you pressed -");
		} else if (e.getSource().equals(bdiv)) {
			var1 = Double.parseDouble(area.getText() + "");
			div = true;
			area.setText("");
			// JOptionPane.showMessageDialog(null, "you pressed /");
		} else if (e.getSource().equals(bans)) {
			var2 = Double.parseDouble(area.getText() + "");
			try {
				if (add == true) {
					area.setText(var1 + var2 + "");
					add = false;
				}
				if (sub == true) {
					area.setText(var1 - var2 + "");
					sub = false;
				}
				if (mul == true) {
					area.setText(var1 * var2 + "");
					mul = false;
				}
				if (div == true) {
					area.setText(var1 / var2 + "");
					div = false;
				}

			} catch (ArithmeticException e2) {
				String error = "Syntax Error";
				area.setText(error);
				e2.printStackTrace();
				
			}
		} else if (e.getSource().equals(bclr)) {
			area.setText(null);
			// JOptionPane.showMessageDialog(null, "CLEAR");
		}

	}

}
