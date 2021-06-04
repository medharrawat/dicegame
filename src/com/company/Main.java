package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Arrays;

public class Main {

    //private static ImageIcon dieFace;
    private JPanel panel1;
    JTabbedPane tabbedPane1;
    JTextField computerdicenumbers;
    ImageIcon dieFace;
    private JLabel ImageIcon;
    public static void main(String[] args) {

        JFrame frame = new JFrame("My app");  // create an instance, title in ""
        frame.setContentPane(new dicegameui().getPanel1());  // adds the panel
        frame.setSize(800,600);         // set it’s size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200,100);     // where to place it
        frame.setVisible(true);         // show it
        }

    public JPanel getPanel1() {
        return panel1;
    }

    public static int [] computerroll(){
        Random r = new Random();
        int [] arr = new int [5];
        for (int i = 0; i < arr.length; i++){
            arr [i] = r.nextInt(6) + 1;
        }

        return arr;
    }
    public static int [] playerroll(){
        Random r = new Random();
        int [] playerarr = new int [5];
        for (int i = 0; i < playerarr.length; i++){
            playerarr [i] = r.nextInt(6) + 1;

        }

        return playerarr;
    }
   /* private void dice1(int playerarr[]){
        int face = playerarr[0];
        System.out.println(face);
        if (face == 4){
            String face4 = "f4.png";
            ImageIcon = new JLabel(new ImageIcon(face4));
            ImageIcon.setSize(20,20);
        }

    } */


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