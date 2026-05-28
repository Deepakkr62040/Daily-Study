package Java.gui;

import java.awt.*;

public class FrameDemo extends Frame{
    Frame f = new Frame();
    FrameDemo(){
        setSize(300, 400);
        setTitle("Frame");
        setVisible(true);
    }

    public static void main(String args[]){
        new FrameDemo();
    }
}
