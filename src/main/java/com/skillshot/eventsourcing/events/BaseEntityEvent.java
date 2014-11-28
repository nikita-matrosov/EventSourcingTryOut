package com.skillshot.eventsourcing.events;

/**
 * @author Nikita Matrosov
 */
abstract class BaseEntityEvent implements EntityEvent {

    private boolean handled = false;

    @Override
    public boolean isHandled() {
        return handled;
    }

    @Override
    public void setHandled(boolean handled) {
        this.handled = handled;
    }
}
