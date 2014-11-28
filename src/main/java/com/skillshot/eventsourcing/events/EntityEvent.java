package com.skillshot.eventsourcing.events;

/**
 * @author Nikita Matrosov
 */
public interface EntityEvent {

    String getEntityClass();

    ActionType getActionType();

    boolean isHandled();

    void setHandled(boolean handled);

    enum ActionType {
        CREATE, MODIFY, DELETE
    }

}
