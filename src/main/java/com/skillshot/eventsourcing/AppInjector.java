package com.skillshot.eventsourcing;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.skillshot.eventsourcing.repository.InMemoryTicketRepository;
import com.skillshot.eventsourcing.repository.TicketRepository;
import com.skillshot.eventsourcing.service.SimpleTicketService;
import com.skillshot.eventsourcing.service.TicketService;

/**
 * @author Nikita Matrosov
 */
public class AppInjector extends AbstractModule {

    private EventBus eventBus = new EventBus();

    @Override
    protected void configure() {
        //global event bus registration
        bind(EventBus.class).toInstance(eventBus);
        //bind to implementation classes
        bind(TicketRepository.class).to(InMemoryTicketRepository.class);
        bind(TicketService.class).to(SimpleTicketService.class);
    }

}
