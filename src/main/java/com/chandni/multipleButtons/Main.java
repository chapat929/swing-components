package com.chandni.multipleButtons;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        final JButton button1 = new JButton("Button 1");
        final JButton button2 = new JButton("Button 2");
        final JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(300, 300);
        frame.setVisible(true);


    }
}
