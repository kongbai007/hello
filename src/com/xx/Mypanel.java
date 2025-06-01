package com.xx;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Vector;

public class Mypanel extends JPanel implements KeyListener {
        Tanker tanker;
        Vector<enemytanker> enemytankers=new Vector<>();
        Random rand=new Random();
        public Mypanel(){
            tanker=new Tanker();
            for (int i = 0; i <3; i++) {
                    enemytanker enemytanker = new enemytanker();
                    enemytanker.setX(20*i);
                    enemytanker.setY(0);
                    enemytankers.add(enemytanker);
                    new Thread(enemytanker).start();
                }
        }
        @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawtanker(tanker,g);
            for (int i = 0; i <enemytankers.size(); i++) {
                drawtanker(enemytankers.get(i),g);
            }
      //  g.setColor(Color.MAGENTA);
        //g.fillOval(tanker.getX(),tanker.getY(),20,20);
        //g.drawOval(tanker.getX(),tanker.getY(),20,20);
       // Image image = Toolkit.getDefaultToolkit().getImage();
        //g.drawImage(image,200,200,this);
     //   g.setFont(new
            //Font("隶书",Font.BOLD,20));
       // g.drawString("hello world",200,200);
    }
    public void drawtanker(Tanker tanker,Graphics g){
            g.setColor(Color.RED);
            g.fillOval(tanker.getX(),tanker.getY(),20,20);
            g.drawOval(tanker.getX(),tanker.getY(),20,20);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            tanker.setY(tanker.getY()+5);
           repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            tanker.setY(tanker.getY()-5);
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            tanker.setX(tanker.getX()-5);
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            tanker.setX(tanker.getX()+5);
            repaint();
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
