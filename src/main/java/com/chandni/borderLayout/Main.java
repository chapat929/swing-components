package com.chandni.borderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JButton north = new JButton("North");
        final JButton east = new JButton("East");
        final JButton south = new JButton("South");
        final JButton west = new JButton("West");
        final JButton center = new JButton("Center");

        final Font largeFont = new Font("serif", Font.BOLD, 28);
        north.setFont(largeFont);

        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
