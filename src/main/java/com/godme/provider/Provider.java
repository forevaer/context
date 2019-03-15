package com.godme.provider;

import com.godme.bean.Ticket;


public class Provider extends Thread {
    private Ticket ticket;
    public Provider(Ticket ticket){
        this.ticket = ticket;
        this.start();
    }
    private void publish(){
       for(int count = 1; count <= 20; count++){
           ticket.increase();
           System.out.println(Thread.currentThread().getName() + " provider : " + ticket.count());
       }
        this.ticket.ready();
    }
    @Override
    public void run() {
        while(true){
            while(ticket.isReady()){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            publish();
        }
    }
}
