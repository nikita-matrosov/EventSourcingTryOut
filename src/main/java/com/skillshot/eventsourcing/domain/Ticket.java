package com.skillshot.eventsourcing.domain;

/**
 * @author Nikita Matrosov
 */
public class Ticket implements Entity {

    private long id = -1l;

    private String name;
    private int price;

    public Ticket(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
