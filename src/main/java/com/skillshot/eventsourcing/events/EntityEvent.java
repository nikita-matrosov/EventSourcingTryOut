package com.skillshot.eventsourcing.events;

/**
 * @author Nikita Matrosov
 */
public interface EntityEvent {

    String getEntityClass();

    ActionType getActionType();

    enum ActionType {
        CREATE, MODIFY, DELETE
    }

}
