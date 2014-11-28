package com.skillshot.eventsourcing.handlers;

import com.google.common.eventbus.Subscribe;
import com.skillshot.eventsourcing.domain.ActionLog;
import com.skillshot.eventsourcing.events.EntityEvent;

import javax.inject.Singleton;

/**
 * @author Nikita Matrosov
 */
@Singleton
public class CommonEntityEventHandler extends EventHandler<EntityEvent> {

    /**
     * handles every event of the hierarchy of events
     * if it is not been handled yet
     * @param event
     */
    @Override
    @Subscribe
    public void handleEvent(EntityEvent event) {
        if (event.isHandled()) {
            return;
        }
        System.out.println("Received event " + event.getClass().getName()
                + " with content " + event.toString());
        ActionLog actionLog = new ActionLog(event.getActionType().toString(), event.getEntityClass());
        // someRepository.save(actionLog);
        System.out.println("Saved ActionLog record");
    }

}
