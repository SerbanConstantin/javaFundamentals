package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        // Get the user's name.
        String name = JOptionPane.showInputDialog("What is your name? ");

        // Display message
        JOptionPane.showMessageDialog(null, "Hello " + name);

        
    }
}

