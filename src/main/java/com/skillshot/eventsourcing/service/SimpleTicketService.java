package com.skillshot.eventsourcing.service;

import com.skillshot.eventsourcing.domain.Ticket;
import com.skillshot.eventsourcing.events.EventPublisher;
import com.skillshot.eventsourcing.repository.TicketRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Nikita Matrosov
 */
@Singleton
public class SimpleTicketService implements TicketService {

    @Inject
    TicketRepository repository;

    public long addTicket(String name, int price) {
        //business logic here
        final long ticketId = repository.save(new Ticket(name, price));
        final Ticket savedTicket = repository.findOne(ticketId);
        System.out.println("processing new ticket. assigned new id: " + ticketId);

        //publish event about creating new entity
        new EventPublisher().newCreateEntityEvent(savedTicket.getClass().getName(), savedTicket);

        return ticketId;
    }
}
