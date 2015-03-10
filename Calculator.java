import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.text.DecimalFormat;
import java.text.Format;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import static java.lang.System.*;

import javax.swing.border.MatteBorder;
import javax.swing.JToolBar;

/**
 * <h1>Fleckster v0.1 Beta - Calculator</h1>
 * The Calculator program is a OSX Calculator look alike with limited 
 * functionality compared to the actual OSX Calculator. Thus this being
 * a calculator, no introduction how to use it is necessary.
 * <p>
 * <b>Note:</b> The source code is adequately commented for easy reading
 * but make no promises that it makes sense. Enjoy!
 * 	
 * @author Tyler Fleckenstein
 * @version 0.1
 * @since 2015-03-10
 */

/**
 * This is the main class Calculator that holds the variables to be used
 */
public class Calculator {

	private JFrame frmFlecksterVBeta;
	
	double firstNumber;
	String stringfirstNumber = Double.toString(firstNumber); //Converts 'double firstNumber' to a string
	
	double secondNumber;
	String stringsecondNumber = Double.toString(secondNumber); //Converts 'double secondNumber' to a string
	
	double result;
    String stringResult = Double.toString(result); //Converts result to a string
    
    String textField; // Holds value of 'textArea.getText()' or value is 'null' when 'textArea.getText()' is empty
    
    /**
     * Other variables used but not show above:
     * String oldStr; 
     * 
     * This variable is only used once and looks like this when used:
     * String oldStr = stringfirstNumber;
     */
    

    
    /**
     * Below will run the calculator
     */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmFlecksterVBeta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * This method initializes the calculator
	 */
	public Calculator() {
		
		initialize(); // Calls on the method initialize()
		
		
	}

	/**
	 * This method initializes the content of the JFrame
	 * and holds all the operations for buttons
	 * on the calculator
	 */
	private void initialize() {
		frmFlecksterVBeta = new JFrame();
		frmFlecksterVBeta.setResizable(false);
		frmFlecksterVBeta.setTitle("Fleckster v0.1 BETA");
		frmFlecksterVBeta.setBounds(5, 100, 306, 317);
		UIManager.getSystemLookAndFeelClassName();
		frmFlecksterVBeta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
        Color orangeColor=new Color(247,146,70);
		Color darkgrayColor=new Color(140,140,140);
		Color grayColor=new Color(214,214,214);
		Color lightgrayColor=new Color(224,224,224);
        
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		frmFlecksterVBeta.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		final JTextArea textArea = new JTextArea(" ");
		textArea.setAutoscrolls(false);
		textArea.setForeground(Color.WHITE);
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		textArea.setEditable(false);
		textArea.setBorder(null);
		textArea.setBackground(darkgrayColor);
		textArea.setBounds(1, 1, 304, 48);
		panel.add(textArea);
		
		
		JButton btn_0 = new JButton("    0");
		btn_0.setHorizontalTextPosition(SwingConstants.LEFT);
		btn_0.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		btn_0.setHorizontalAlignment(SwingConstants.LEFT);
		btn_0.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_0.setForeground(Color.BLACK);
		btn_0.setOpaque(true);
		btn_0.setBackground(lightgrayColor);
		btn_0.setBorder(null);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
				textField = null;
			}
		});
		btn_0.setBounds(62, 246, 121, 48);
		panel.add(btn_0);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_1.setForeground(Color.BLACK);
		btn_1.setOpaque(true);
		btn_1.setBackground(lightgrayColor);
		btn_1.setBorder(null);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("1");
				textField = null;
			}
		});
		btn_1.setBounds(62, 197, 60, 48);
		panel.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_2.setForeground(Color.BLACK);
		btn_2.setOpaque(true);
		btn_2.setBackground(lightgrayColor);
		btn_2.setBorder(null);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("2");
				textField = null;
			}
		});
		btn_2.setBounds(123, 197, 60, 48);
		panel.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_3.setForeground(Color.BLACK);
		btn_3.setOpaque(true);
		btn_3.setBackground(lightgrayColor);
		btn_3.setBorder(null);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				textField = null;
			}
		});
		btn_3.setBounds(184, 197, 60, 48);
		panel.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_4.setForeground(Color.BLACK);
		btn_4.setOpaque(true);
		btn_4.setBackground(lightgrayColor);
		btn_4.setBorder(null);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				textField = null;
			}
		});
		btn_4.setBounds(62, 148, 60, 48);
		panel.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_5.setForeground(Color.BLACK);
		btn_5.setOpaque(true);
		btn_5.setBackground(lightgrayColor);
		btn_5.setBorder(null);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				textField = null;
			}
		});
		btn_5.setBounds(123, 148, 60, 48);
		panel.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_6.setForeground(Color.BLACK);
		btn_6.setOpaque(true);
		btn_6.setBackground(lightgrayColor);
		btn_6.setBorder(null);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				textField = null;
			}
		});
		btn_6.setBounds(184, 148, 60, 48);
		panel.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_7.setForeground(Color.BLACK);
		btn_7.setOpaque(true);
		btn_7.setBackground(lightgrayColor);
		btn_7.setBorder(null);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				textField = null;
			}
		});
		btn_7.setBounds(62, 99, 60, 48);
		panel.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_8.setForeground(Color.BLACK);
		btn_8.setOpaque(true);
		btn_8.setBackground(lightgrayColor);
		btn_8.setBorder(null);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				textField = null;
			}
		});
		btn_8.setBounds(123, 99, 60, 48);
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_9.setForeground(Color.BLACK);
		btn_9.setOpaque(true);
		btn_9.setBackground(lightgrayColor);
		btn_9.setBorder(null);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
				textField = null;
			}
		});
		btn_9.setBounds(184, 99, 60, 48);
		panel.add(btn_9);
		
		JButton btn_Dot = new JButton(".");
		btn_Dot.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Dot.setForeground(Color.BLACK);
		btn_Dot.setOpaque(true);
		btn_Dot.setBackground(lightgrayColor);
		btn_Dot.setBorder(null);
		btn_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = textArea.getText();
				if (textField != null && textField.contains(".")) { 
					if (textField.charAt(0) == '=' && textField.endsWith(".0")) {
						stringResult = stringResult.replaceAll("(?<=^\\d+)\\.0*$", "");
						textArea.setText(stringResult + ".");
						textField = textArea.getText();
					}
					else if (textField.endsWith(".") != true && textField.contains(".")
							&& textField.matches("[^A-Za-z0-9]") != true) {
						textArea.setText(textField + ".");
					}
					else if (textField.contains(".") && textField.endsWith(".") != true) {
						textArea.setText(textField);
						textField = textArea.getText();
					}
				}
				else {
					textArea.append(".");
					textField = textArea.getText();
				}	
			}
		});
		btn_Dot.setBounds(184, 246, 60, 48);
		panel.add(btn_Dot);
		
		JButton btn_Clear = new JButton("AC");
		btn_Clear.setBackground(grayColor);
		btn_Clear.setBorder(null);
		btn_Clear.setOpaque(true);
		btn_Clear.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Clear.setForeground(Color.BLACK);
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				textField = null;
			}
		});
		btn_Clear.setBounds(1, 50, 60, 48);
		panel.add(btn_Clear);
		
		JButton btn_Multiply = new JButton("x");
		btn_Multiply.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Multiply.setOpaque(true);
		btn_Multiply.setBackground(orangeColor);
		btn_Multiply.setBorder(null);
		btn_Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField == null) {
					textArea.append("*");
				}
				else if (textField.charAt(0) == '=') {
					textArea.setText(stringResult + "*");
				}
			}
		});
		btn_Multiply.setForeground(Color.WHITE);
		btn_Multiply.setBounds(245, 50, 60, 48);
		panel.add(btn_Multiply);
		
		JButton btn_Add = new JButton("+");
		btn_Add.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Add.setOpaque(true);
		btn_Add.setBackground(orangeColor);
		btn_Add.setBorder(null);
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField != null && textField.contains("+") != true) {
					if (textField.charAt(0) == '=') {
						textArea.setText(stringResult + "+");
					}
					else {
						textArea.append("+");
					}
				}
				else {
					textArea.append("+");
				}
			}
		});
		btn_Add.setForeground(Color.WHITE);
		btn_Add.setBounds(245, 197, 60, 48);
		panel.add(btn_Add);
		
		JButton btn_Subtract = new JButton("-");
		btn_Subtract.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Subtract.setOpaque(true);
		btn_Subtract.setBackground(orangeColor);
		btn_Subtract.setBorder(null);
		btn_Subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField == null) {
					textArea.append("-");
				}
				else if (textField.charAt(0) == '=') {
					textArea.setText(stringResult + "-");
				}
			}
		});
		btn_Subtract.setForeground(Color.WHITE);
		btn_Subtract.setBounds(245, 148, 60, 48);
		panel.add(btn_Subtract);
		
		JButton btn_Divide = new JButton("÷");
		btn_Divide.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Divide.setOpaque(true);
		btn_Divide.setBackground(orangeColor);
		btn_Divide.setBorder(null);
		btn_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField == null) {
					textArea.append("/");
				}
				else if (textField.charAt(0) == '=') {
					textArea.setText(stringResult + "/");
				}
			}
		});
		btn_Divide.setForeground(Color.WHITE);
		btn_Divide.setBounds(245, 99, 60, 48);
		panel.add(btn_Divide);
		
		JButton btn_Sqrt = new JButton("√");
		btn_Sqrt.setBackground(grayColor);
		btn_Sqrt.setBorder(null);
		btn_Sqrt.setOpaque(true);
		btn_Sqrt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField == null) {
					result = Math.sqrt((Double.parseDouble(textArea.getText())));
					stringResult = Double.toString(result);
					textArea.setText("=" + stringResult);
					textField = textArea.getText();
				}
				else if (textField.charAt(0) == '=') {
					textArea.setText(stringResult);
					result = Math.sqrt((Double.parseDouble(textArea.getText())));
					stringResult = Double.toString(result);
					textArea.setText("=" + stringResult);
				}
			}
		});
		btn_Sqrt.setForeground(Color.BLACK);
		btn_Sqrt.setBounds(1, 148, 60, 48);
		panel.add(btn_Sqrt);
		
		JButton btn_Square = new JButton("x²");
		btn_Square.setBackground(grayColor);
		btn_Square.setBorder(null);
		btn_Square.setOpaque(true);
		btn_Square.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Square.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField == null) {
						result = Math.pow((Double.parseDouble(textArea.getText())), 2);
						stringResult = Double.toString(result);
						textArea.setText("=" + stringResult);
						textField = textArea.getText();
					}
					else if (textField.charAt(0) == '=') {
						textArea.setText(stringResult);
						result = Math.pow((Double.parseDouble(textArea.getText())), 2);
						stringResult = Double.toString(result);
						textArea.setText("=" + stringResult);
					}
				}
			});

		btn_Square.setForeground(Color.BLACK);
		btn_Square.setBounds(1, 246, 60, 48);
		panel.add(btn_Square);
		JButton btn_Power = new JButton("x^y");
		btn_Power.setBackground(grayColor);
		btn_Power.setBorder(null);
		btn_Power.setOpaque(true);
		btn_Power.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textArea.getText());
				textArea.append("^");
				stringfirstNumber = textArea.getText();
			}
		});
		btn_Power.setForeground(Color.BLACK);
		btn_Power.setBounds(1, 197, 60, 48);
		panel.add(btn_Power);
		
		
		JButton btn_Result = new JButton("=");
		btn_Result.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Result.setOpaque(true);
		btn_Result.setBackground(orangeColor);
		btn_Result.setBorder(null);
		btn_Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");
			    if (textField == null) {
					try {
						stringResult = String.valueOf(engine.eval(textArea.getText()));
						textArea.setText(null);
						textArea.append("=" + stringResult);
						textField = textArea.getText();
					} catch (ScriptException e1) {
						e1.printStackTrace();
					}
			    }
			    else if (stringfirstNumber.contains("^") == true) {
			    	String oldStr = stringfirstNumber;
			    	stringfirstNumber = textArea.getText();
			    	stringfirstNumber = stringfirstNumber.replace(oldStr, "");
			    	secondNumber = Double.parseDouble(stringfirstNumber);
		    		result = Math.pow(firstNumber, secondNumber); 
		    		textArea.setText(null);
		    		stringResult = Double.toString(result);
		    		textArea.append("=" + stringResult);
		    		textField = textArea.getText();
			    }
			    else if (textField.charAt(0) == '=') {
					try {
						textArea.setText(stringResult.replaceAll("=", ""));
						stringResult = String.valueOf(engine.eval(textArea.getText()));
						textArea.setText(null);
						textArea.append("=" + stringResult);
						textField = textArea.getText();
					} catch (ScriptException e1) {
						e1.printStackTrace();
					}
			    }
			}
		});
		btn_Result.setForeground(Color.WHITE);
		btn_Result.setBounds(245, 246, 60, 48);
		panel.add(btn_Result);
		
		JButton btn_ParLeft = new JButton("(");
		btn_ParLeft.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_ParLeft.setOpaque(true);
		btn_ParLeft.setBackground(grayColor);
		btn_ParLeft.setBorder(null);
		btn_ParLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField = textArea.getText();
				if (textField.charAt(0) == '=') {
					textArea.setText(stringResult + "*(");
				}
				else if (textField.matches("[0-9]") != true) {
					textArea.append("*(");
				}
				else {
					textArea.append("(");
				}
			}
		});
		btn_ParLeft.setForeground(Color.BLACK);
		btn_ParLeft.setBounds(62, 50, 60, 48);
		panel.add(btn_ParLeft);
		
		JButton btn_ParRight = new JButton(")");
		btn_ParRight.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_ParRight.setBorder(null);
		btn_ParRight.setBackground(grayColor);
		btn_ParRight.setOpaque(true);
		btn_ParRight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField == null) {
						textArea.append(")");
					}
					else if (textField.charAt(0) == '=') {
						textArea.setText(stringResult + ")");
					}
				}
			});
		btn_ParRight.setForeground(Color.BLACK);
		btn_ParRight.setBounds(123, 50, 60, 48);
		panel.add(btn_ParRight);
		
		JButton btn_Remainder = new JButton("%");
		btn_Remainder.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Remainder.setBackground(grayColor);
		btn_Remainder.setBorder(null);
		btn_Remainder.setOpaque(true);
		btn_Remainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField == null) {
					textArea.append("%");
				}
				else if (textField.charAt(0) == '=') {
					textArea.setText(stringResult + "%");
				}
			}
		});
		btn_Remainder.setForeground(Color.BLACK);
		btn_Remainder.setBounds(184, 50, 60, 48);
		panel.add(btn_Remainder);
		
		JButton btn_Pi = new JButton("π");
		btn_Pi.setBackground(grayColor);
		btn_Pi.setBorder(null);
		btn_Pi.setOpaque(true);
		btn_Pi.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btn_Pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					result = Math.PI;
					stringResult = Double.toString(result);
					textArea.append(stringResult);
			}
		});
		btn_Pi.setForeground(Color.BLACK);
		btn_Pi.setBounds(1, 99, 60, 48);
		panel.add(btn_Pi);
		
	}
}
