package com.godme.bean;

import java.util.concurrent.atomic.AtomicInteger;

public class Ticket {
    private  AtomicInteger total = new AtomicInteger(10);
    private boolean ready = false;
    public  int count(){
        return total.get();
    }
    public void decrease(){
        this.total.decrementAndGet();
    }
    public void increase(){
        this.total.incrementAndGet();
    }
    public boolean hasMore(){
        return total.get() > 0;
    }
    public boolean isReady(){
        return this.ready;
    }
    public void ready(){
        this.ready = true;
    }
    public void disable(){
        this.ready = false;
    }
}
