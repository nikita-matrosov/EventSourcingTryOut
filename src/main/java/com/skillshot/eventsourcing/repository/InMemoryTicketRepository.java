package com.skillshot.eventsourcing.repository;

import com.skillshot.eventsourcing.domain.Ticket;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Nikita Matrosov
 */
@Singleton
public final class InMemoryTicketRepository implements TicketRepository {

    private Map<Long, Ticket> tickets = new HashMap<Long, Ticket>();
    private final Random idGenerator = new Random();

    public Ticket findOne(long id) {
        return tickets.get(id);
    }

    public long save(Ticket ticket) {
        final long id = idGenerator.nextLong();
        ticket.setId(id);
        tickets.put(id, ticket);
        return id;
    }


}
