package com.skillshot.eventsourcing.handlers;

import com.google.common.eventbus.Subscribe;
import com.skillshot.eventsourcing.domain.ActionLog;
import com.skillshot.eventsourcing.events.CreateEntityEvent;

/**
 * @author Nikita Matrosov
 */
public class EntityEventHandler {

    @Subscribe
    public void handleCreateEntityEvent(CreateEntityEvent event) {
        System.out.println("Received event " + event.getClass().getName()
            + " with content " + event.toString());
        ActionLog actionLog = new ActionLog(event.getActionType().toString(), event.getEntityClass());
        // someRepository.save(actionLog);
    }

}
