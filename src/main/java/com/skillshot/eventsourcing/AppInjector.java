package com.skillshot.eventsourcing;

import com.google.inject.AbstractModule;
import com.skillshot.eventsourcing.repository.InMemoryTicketRepository;
import com.skillshot.eventsourcing.repository.TicketRepository;
import com.skillshot.eventsourcing.service.SimpleTicketService;
import com.skillshot.eventsourcing.service.TicketService;

/**
 * @author Nikita Matrosov
 */
public class AppInjector extends AbstractModule {

    @Override
    protected void configure() {
        //bind the service to implementation class
        bind(TicketRepository.class).to(InMemoryTicketRepository.class);
        bind(TicketService.class).to(SimpleTicketService.class);
    }

}
