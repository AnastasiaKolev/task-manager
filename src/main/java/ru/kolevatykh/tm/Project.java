package ru.kolevatykh.tm;

public class Project {

    private String name;
    private int id;

    Project(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
