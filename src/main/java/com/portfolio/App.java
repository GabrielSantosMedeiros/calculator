package com.portfolio;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args ) {
        JFrame mainFrame = new JFrame("Calculator");
        mainFrame.setSize(300, 400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(mainFrame.DISPOSE_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}