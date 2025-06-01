package com.xx;

import java.util.Random;

public class enemytanker extends Tanker implements Runnable{
    Random rand = new Random();
    public enemytanker(){
        super();
    }

    @Override
    public void run() {
        while(true){

            int x=(int)(rand.nextInt(4));
            switch (x) {
                case 0:setX(getX()+1);
                case 1:setY(getY()+1);
                case 2:setX(getX()-1);
                case 3:setY(getY()-1);
        }
    }

    }
}
