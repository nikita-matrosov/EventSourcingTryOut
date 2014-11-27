package com.skillshot.eventsourcing.repository;

import com.skillshot.eventsourcing.domain.Ticket;

/**
 * @author Nikita Matrosov
 */
public interface TicketRepository {

    Ticket findOne(long id);

    long save(Ticket ticket);

}
