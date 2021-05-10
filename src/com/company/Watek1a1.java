package com.company;

public class Watek1a1 extends Thread{
    String s;
    int i = 0;
    int ms;
    public Watek1a1(String s, int ms){
        this.s = s;
        this.ms = ms;
    }
    public void run(){
        while(true){
            i++;
            System.out.println(s + " " + i);
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
