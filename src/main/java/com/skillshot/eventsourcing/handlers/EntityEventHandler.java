package com.skillshot.eventsourcing.handlers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.skillshot.eventsourcing.domain.ActionLog;
import com.skillshot.eventsourcing.events.CreateEntityEvent;
import com.skillshot.eventsourcing.events.EntityEvent;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Nikita Matrosov
 */
@Singleton
public class EntityEventHandler {

    @Inject
    public EntityEventHandler(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void handleAllEntityEvents(EntityEvent event) {
        System.out.println("Received event " + event.getClass().getName()
            + " with content " + event.toString());
        ActionLog actionLog = new ActionLog(event.getActionType().toString(), event.getEntityClass());
        // someRepository.save(actionLog);
        System.out.println("Saved ActionLog record");
    }

    @Subscribe
    public void handleCreateEntityEvent(CreateEntityEvent event) {
        System.out.println("Received create entity event " + event.getClass().getName());
        //additional logic based on create entity event type
        System.out.println("Processing create entity event with additional logic...");
    }


}
