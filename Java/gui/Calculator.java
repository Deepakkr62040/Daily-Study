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
    
    double num1, num2, result;
    String operator;

    boolean isOperatorClicked = false;

    Calculator(){
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10,10));

        getContentPane().setBackground(new Color(25, 25, 25));
        
        display = new JTextField();
        display.setFont(new Font("Segoe UI", Font.BOLD, 32));

        display.setBackground(new Color(15, 15, 15));
        display.setForeground(Color.white);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        display.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));

        add(display, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
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
        btnEqual = createOperatorButton("=");

        btnClear = createClearButton("Clear");

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
        buttonPanel.add(btnEqual);

        add(buttonPanel, BorderLayout.CENTER);

        JPanel clearPanel = new JPanel(new BorderLayout());
        clearPanel.setBackground(new Color(25, 25, 25));
        clearPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        clearPanel.add(btnClear, BorderLayout.CENTER);

        add(clearPanel, BorderLayout.SOUTH);


        btn0.addActionListener(e -> display.setText(display.getText() + "0"));
        btn1.addActionListener(e -> display.setText(display.getText() + "1"));
        btn2.addActionListener(e -> display.setText(display.getText() + "2"));
        btn3.addActionListener(e -> display.setText(display.getText() + "3"));
        btn4.addActionListener(e -> display.setText(display.getText() +  "4"));
        btn5.addActionListener(e -> display.setText(display.getText() + "5"));
        btn6.addActionListener(e -> display.setText(display.getText() + "6"));
        btn7.addActionListener(e -> display.setText(display.getText() + "7"));
        btn8.addActionListener(e -> display.setText(display.getText() + "8"));
        btn9.addActionListener(e -> display.setText(display.getText() + "9"));

        btnDot.addActionListener(e -> display.setText(display.getText() + "."));


        btnAdd.addActionListener(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        });

        btnSub.addActionListener(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        });

        btnMul.addActionListener(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        });

        btnDiv.addActionListener(e -> {
            num1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        });




        btnEqual.addActionListener(e -> {

            num2 = Double.parseDouble(display.getText());

            switch(operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
        });

        btnClear.addActionListener(e -> {
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = "";
        });


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

    JButton createClearButton(String text){
        JButton btn = new JButton(text);

        btn.setFont(new Font("Arial", Font.BOLD, 24));

        btn.setBackground(new Color(25, 140, 0));

        btn.setFocusPainted(false);

        btn.setForeground(Color.red);

        return btn;
    }
    public static void main(String args[]){
        new Calculator();
    }
}
