package com.example.cyber.tnguid;

/**
 * Customer Class for location.
 */
public class location {
    /**
     * Global variables.
     */
    private String name;
    private String description;
    private String number;
    private String map;
    private int imageResourceId;

    /**
     * Create a new location object.
     *
     * @param name        it is name place
     * @param description description place
     * @param number      phone number place
     * @param map         location of place
     * @param ,           ImageResourceId Image place
     */
    public location(String name, String description, String number, String map, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.number = number;
        this.map = map;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Methods.
     *
     * @return Object.
     */
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMap() {
        return map;
    }

    public String getNumber() {
        return number;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
