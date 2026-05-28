package Java.gui;

import javax.swing.JFrame;

public class JFrameDemo extends JFrame {
    JFrame f;

    JFrameDemo(){
        setTitle("JFrame Demo");
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        new JFrameDemo();
    }
}
