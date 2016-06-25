package com.chandni.textInput;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int numberOfCharacters = 20;
        final JTextField textField = new JTextField(numberOfCharacters);
        final JTextField textField1 = new JTextField("Your Name");


        System.out.println("text from textField: " + textField.getText());
        System.out.println("text from textField1: " + textField1.getText());

        Thread.sleep(3000);

        textField.setText("Whatever");
        textField1.setText("");

        System.out.println("text from textField: " + textField.getText());
        System.out.println("text from textField1: " + textField1.getText());
        final MyActionListener myActionListener = new MyActionListener();
        textField.addActionListener(myActionListener);

        textField.selectAll();

        Thread.sleep(3000);

        textField1.requestFocus();

        frame.getContentPane().add(BorderLayout.NORTH, textField);
        frame.getContentPane().add(BorderLayout.SOUTH, textField1);

        frame.setSize(300, 300);
        frame.setVisible(true);


    }
}
