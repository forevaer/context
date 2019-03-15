package com.godme.main;

import com.godme.bean.Ticket;
import com.godme.consumer.Shop;
import com.godme.provider.Provider;

public class TicketMain {
    public static void main(String[] args) {
        Ticket ticket= new Ticket();
        new Shop(ticket);
        new Shop(ticket);
        new Provider(ticket);
        ticket.ready();
    }
}
