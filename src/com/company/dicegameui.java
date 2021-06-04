package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import static com.company.Main.*;

public class dicegameui
{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel computerdicenumbers;
    private JButton playButton;
    private JLabel userdicenumbers;
    private JLabel playerstotal;
    private JLabel computerstotal;
    private JLabel finalelabel;
    private JButton startPlayingButton;
    private JButton homeButton;
    private JLabel ImageIcon;
    private JPanel panel2;
    private JLabel winner;

    public dicegameui(){

        playButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int [] comp = computerroll();
                int [] player = playerroll();
              //  dice1();
                computerdicenumbers.setText(Arrays.toString(comp));
                userdicenumbers.setText(Arrays.toString(player));
                int playerTotal = total(player);
                int compTotal = total(comp);
                String winner = compare (playerTotal, compTotal);
                playerstotal.setText("Your total: " + playerTotal);
                computerstotal.setText("Computer's total: " + compTotal);
                finalelabel.setText(winner + " wins!");
            }
        });

        startPlayingButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tabbedPane1.setSelectedIndex(1);
            }
        });
        homeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tabbedPane1.setSelectedIndex(0);
            }
        });
    }
    public JPanel getPanel1() {
        return panel1;
    }


   /* private void createUIComponents(int playerarr[])
    {
        int face = playerarr[0];
        System.out.println(face);
        if (face == 4){
            String face4 = "f4.png";
            ImageIcon = new JLabel(new ImageIcon(face4));
            ImageIcon.setSize(20,20);
        }
    }


    private void createUIComponents()
    {
        Random r = new Random();
        int [] playerarr = new int [5];
        for (int i = 0; i < playerarr.length; i++){
            playerarr [i] = r.nextInt(6) + 1;
            int face = playerarr[0];
        }

        System.out.println(face);
        if (face == 4){
            String face4 = "f4.png";
            ImageIcon = new JLabel(new ImageIcon(face4));
            ImageIcon.setSize(20,20);
        }
    }

    */
}