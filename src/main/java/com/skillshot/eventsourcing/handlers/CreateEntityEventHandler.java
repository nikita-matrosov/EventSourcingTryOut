package com.skillshot.eventsourcing.handlers;

import com.google.common.eventbus.Subscribe;
import com.skillshot.eventsourcing.events.CreateEntityEvent;

import javax.inject.Singleton;

/**
 * @author Nikita Matrosov
 */
@Singleton
public class CreateEntityEventHandler extends EventHandler<CreateEntityEvent> {

    @Subscribe
    public void handleEvent(CreateEntityEvent event) {
        System.out.println("Received create entity event " + event.getClass().getName());
        //additional logic based on create entity event type
        System.out.println("Processing create entity event with additional logic...");

        //set handled to true if event should not be handled by event supertypes

        //event.setHandled(true);
    }

}
