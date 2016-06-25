package com.chandni.boxLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        final JButton button = new JButton("Button");
        final JButton button1 = new JButton("Button 1");

        panel.add(button);
        panel.add(button1);

        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
