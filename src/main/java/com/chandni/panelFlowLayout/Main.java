package com.chandni.panelFlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel panel = new JPanel(); //This has a default flow layout
        panel.setBackground(Color.gray);
        final JButton button = new JButton("Button 1");
        final JButton button1 = new JButton("Button 2");

        panel.add(button);
        panel.add(button1);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
