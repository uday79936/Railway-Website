package com.railway.model;

public class Train {
    private int id;
    private String name;
    private String source;
    private String destination;

    public Train(int id, String name, String source, String destination) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
}