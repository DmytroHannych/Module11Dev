package org.example;

import org.example.Entity.Client;
import org.example.Entity.Ticket;
import org.example.Flyway.FlywayDatabaseInitService;
import org.example.service.ClientCrudService;
import org.example.service.TicketCrudService;

public class Main {
    public static void main(String[] args) {
//        FlywayDatabaseInitService databaseInitService = new FlywayDatabaseInitService();
//        databaseInitService.initData();
//        ClientCrudService clientCrudService = new ClientCrudService();
//        Client byid = clientCrudService.getByid(7l);
//        System.out.println("byid = " + byid);
        TicketCrudService ticketCrudService =new TicketCrudService();
//        System.out.println("ticketCrudService.getByid(2L) = " + ticketCrudService.getByid(2L));
//        System.out.println("ticketCrudService.listAll() = " + ticketCrudService.listAll());

    }
}