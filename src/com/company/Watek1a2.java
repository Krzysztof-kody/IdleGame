package com.company;

public class Watek1a2 extends Thread{
    String s;
    int ms;
    public Watek1a2(String s, int ms){
        this.s = s;
        this.ms = ms;
    }
    public void run(){

        while(true) {
            System.out.println(s);

            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
