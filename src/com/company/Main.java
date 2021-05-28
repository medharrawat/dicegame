package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Arrays;

public class Main {

    private JPanel panel1;
    JTabbedPane tabbedPane1;
   // private JPanel panel1;
    JTextField computerdicenumbers;
    public static void main(String[] args) {

        JFrame frame = new JFrame("My app");  // create an instance, title in ""
        frame.setContentPane(new dicegameui().getPanel1());  // adds the panel
        frame.setSize(800,600);         // set it’s size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200,100);     // where to place it
        frame.setVisible(true);         // show it
        }
    //public void dicegameui{
      //  computerdicenumbers.setText(Arrays.toString(comp));
    //}
    public JPanel getPanel1() {
        return panel1;
    }

    public static int [] roll(){
        Random r = new Random();
        int [] arr = new int [5];
        for (int i = 0; i < arr.length; i++){
            arr [i] = r.nextInt(6) + 1;
        }
        return arr;
        //hello
    }

    public static int total (int [] arr){
        int temp = 0;
        for (int j = 0; j < arr.length; j++){
            temp += arr [j];
        }
        return temp;
    }

    public static String compare (int p, int c){
        if (p > c){
            return "Player";
        } else if (c > p){
            return "Computer";
        } else {
            return "Tie";
        }
    }
}
