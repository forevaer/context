package com.godme.consumer;

import com.godme.bean.Ticket;

public class Shop extends Thread{
    private Ticket ticket;
    public Shop(Ticket ticket){
        this.ticket = ticket;
        this.start();
    }
    private void sale(){
        while(ticket.hasMore()){
            ticket.decrease();
            System.out.println(Thread.currentThread().getName() + " consumer : " + ticket.count());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.ticket.disable();
    }
    @Override
    public void run() {
       while (true){
           while(!ticket.isReady()){
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           sale();
       }
    }
}
