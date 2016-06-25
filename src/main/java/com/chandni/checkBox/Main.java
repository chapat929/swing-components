package com.chandni.checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main implements ItemListener {

    private final JCheckBox check = new JCheckBox("Goes to 11");

    public static void main(String[] args) {
        final Main main = new Main();
        main.go();
    }

    private void go() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        check.addItemListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, check);


        frame.setSize(300, 300);
        frame.setVisible(true);

        defaultStateToChecked();
    }

    private void defaultStateToChecked() {
        check.setSelected(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (check.isSelected()) onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
