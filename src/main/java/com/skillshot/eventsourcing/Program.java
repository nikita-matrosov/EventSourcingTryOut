package com.skillshot.eventsourcing;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.skillshot.eventsourcing.handlers.EntityEventHandler;
import com.skillshot.eventsourcing.service.TicketService;

/**
 * @author Nikita Matrosov
 */
public class Program {

    //publishers and subscribers communicating by event bus
    //it can be a singleton in a common container (e.g. spring bean)

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());


        //somewhere in the place that handles events
        final EntityEventHandler eventHandler = injector.getInstance(EntityEventHandler.class);


        //some code at the module publishing events
        final TicketService ticketService = injector.getInstance(TicketService.class);
        ticketService.addTicket("Beautiful Flowers: The Rat", 80);
    }

}
