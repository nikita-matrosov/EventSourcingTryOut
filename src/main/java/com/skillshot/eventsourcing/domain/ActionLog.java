package com.skillshot.eventsourcing.domain;

import java.util.Date;
import java.util.Random;

/**
 * @author Nikita Matrosov
 */
public class ActionLog implements Entity {

    private long id = new Random().nextLong();
    private final String actionType;
    private final String entityType;
    private final Date date;

    public ActionLog(String actionType, String entityType) {
        this.actionType = actionType;
        this.entityType = entityType;
        this.date = new Date();
    }

    public String getActionType() {
        return actionType;
    }

    public String getEntityType() {
        return entityType;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public long getId() {
        return id;
    }
}
