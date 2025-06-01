package com.xx;

import javax.swing.*;

public class Myframe extends JFrame {
    private Mypanel mp;
    public Myframe() {
        mp = new Mypanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Myframe();
    }
}
