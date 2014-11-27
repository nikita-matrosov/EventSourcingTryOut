package com.skillshot.eventsourcing;

import com.google.common.eventbus.EventBus;
import com.skillshot.eventsourcing.handlers.EntityEventHandler;
import com.skillshot.eventsourcing.service.TicketService;

/**
 * @author Nikita Matrosov
 */
public class Program {

    //publishers and subscribers communicating by event bus
    //it can be a singleton in a common container (e.g. spring bean)

    //emulating singleton for application
    public static final EventBus eventBus = new EventBus();

    public static void main(String[] args) {
        //somewhere in the place that handles events
        EntityEventHandler entityEventHandler = new EntityEventHandler();
        eventBus.register(entityEventHandler);


        //some code at the module publishing events
        TicketService ticketService = new TicketService();
        ticketService.addTicket("Beautiful Flowers: The Rat", 80);
    }

}
