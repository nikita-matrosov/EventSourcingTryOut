package com.skillshot.eventsourcing.events;

import com.google.common.base.MoreObjects;

/**
 * @author Nikita Matrosov
 */
public class CreateEntityEvent implements EntityEvent {

    private final String entityClass;
    private final ActionType actionType;
    private final Object payload;

    public CreateEntityEvent(String entityClass, Object payload) {
        this.entityClass = entityClass;
        this.actionType = ActionType.CREATE;
        this.payload = payload;
    }

    @Override
    public String getEntityClass() {
        return entityClass;
    }

    @Override
    public ActionType getActionType() {
        return actionType;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("entityClass", entityClass)
                .add("actionType", actionType)
                .add("payload", payload)
                .toString();
    }

    public Object getPayload() {
        return payload;
    }
}
