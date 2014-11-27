package com.skillshot.eventsourcing.events;

import com.skillshot.eventsourcing.Program;

/**
 * @author Nikita Matrosov
 */
public class EventPublisher {

    public void newCreateEntityEvent(String entityClassName, Object data) {
        Program.eventBus.post(new CreateEntityEvent(entityClassName, data));
    }

    /*public void newModifyEntityEvent(String entityClassName) {
        Program.eventBus.post(new CreateEntityEvent(entityClassName));
    }

    public void newDeleteEntityEvent(String entityClassName) {
        Program.eventBus.post(new CreateEntityEvent(entityClassName));
    }*/

}
