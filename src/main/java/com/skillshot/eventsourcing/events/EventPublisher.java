package com.skillshot.eventsourcing.events;

import com.google.common.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Nikita Matrosov
 */
@Singleton
public class EventPublisher {

    @Inject
    private EventBus eventBus;

    public void newCreateEntityEvent(String entityClassName, Object data) {
        eventBus.post(new CreateEntityEvent(entityClassName, data));
    }

    /*public void newModifyEntityEvent(String entityClassName) {
        Program.eventBus.post(new CreateEntityEvent(entityClassName));
    }

    public void newDeleteEntityEvent(String entityClassName) {
        Program.eventBus.post(new CreateEntityEvent(entityClassName));
    }*/

}
