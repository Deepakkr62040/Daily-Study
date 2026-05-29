package Java.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

    JTextField display;

    JButton btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnMul, btnDiv,
            btnEqual, btnDot, btnClear;
    
    

    Calculator(){
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10,10));

        getContentPane().setBackground(new Color(25, 25, 25));
        
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 32));

        display.setBackground(new Color(40, 40, 40));
        display.setForeground(Color.white);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        display.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));

        add(display, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBackground(new Color(25, 25, 25));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        btn1 = createButton("1");
        btn2 = createButton("2");
        btn3 = createButton("3");
        btnAdd = createOperatorButton("+");

        btn4 = createButton("4");
        btn5 = createButton("5");
        btn6 = createButton("6");
        btnSub = createOperatorButton("-");

        btn7 = createButton("7");
        btn8 = createButton("8");
        btn9 = createButton("9");
        btnMul = createOperatorButton("*");

        btn0 = createButton("0");
        btnDot = createButton(".");
        btnDiv = createOperatorButton("/");

        btnClear = createOperatorButton("C");

        btnEqual = createOperatorButton("=");

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnAdd);

        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnSub);

        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnMul);

        buttonPanel.add(btn0);
        buttonPanel.add(btnDot);
        buttonPanel.add(btnDiv);
        buttonPanel.add(btnClear);

        buttonPanel.add(btnEqual);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    JButton createButton(String text){
        JButton btn = new JButton(text);

        btn.setFont(new Font("Arial", Font.BOLD, 22));

        btn.setBackground(new Color(55, 55,55));

        btn.setFocusPainted(false);
        
        btn.setForeground(Color.white);

        return btn;
    }

    JButton createOperatorButton(String text){
        JButton btn = new JButton(text);

        btn.setFont(new Font("Arial", Font.BOLD, 22));

        btn.setBackground(new Color(255, 140, 0));

        btn.setFocusPainted(false);

        btn.setForeground(Color.white);

        return btn;
    }
    public static void main(String args[]){
        new Calculator();
    }
}
