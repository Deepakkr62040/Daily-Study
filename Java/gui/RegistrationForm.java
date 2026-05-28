package Java.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame {
    JPanel p;
    JLabel lfname, llname, lemail, lpassword, lrepassword, lcontact, lgender;
    JTextField tf, tl, te, tc;
    JPasswordField tp, tre;
    JButton btn;

    RegistrationForm(){
        setSize(450, 450);
        setTitle("Registration Form");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p = new JPanel();
        p.setLayout(new GridLayout(0, 2, 10, 10));

        lfname = new JLabel("First Name: ");
        tf = new JTextField(15);
        llname = new JLabel("Last Name: ");
        tl = new JTextField(15);

        lemail = new JLabel("Email: ");
        te = new JTextField(30);

        lpassword = new JLabel("Password: ");
        tp = new JPasswordField(15);
        lrepassword = new JLabel("Re-type Password: ");
        tre = new JPasswordField(15);

        lcontact = new JLabel("Contact: ");
        tc = new JTextField(15);

        btn = new JButton("Submit");

        p.add(lfname);
        p.add(tf);
        p.add(llname);
        p.add(tl);
        p.add(lemail);
        p.add(te);
        p.add(lpassword);
        p.add(tp);
        p.add(lrepassword);
        p.add(tre);
        p.add(lcontact);
        p.add(tc);
        p.add(btn);


        add(p);
        
        setVisible(true);
    }
    public static void main(String args[]){
        new RegistrationForm();
    }
}
