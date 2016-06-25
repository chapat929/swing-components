package com.chandni.basicSwing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JButton button = new JButton("Click Me");

        frame.getContentPane().add(BorderLayout.WEST, button);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
