package com.skillshot.eventsourcing.handlers;

import com.google.common.eventbus.EventBus;
import com.skillshot.eventsourcing.events.EntityEvent;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * @author Nikita Matrosov
 */
public abstract class EventHandler<T extends EntityEvent> {

    @PostConstruct
    @Inject
    private void initialize(EventBus eventBus) {
        eventBus.register(this);
    }

    public abstract void handleEvent(T event);

}
