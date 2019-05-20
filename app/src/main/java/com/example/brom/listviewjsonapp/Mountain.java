package com.example.brom.listviewjsonapp;

public final class Mountain {
    public final String iD;
    public final String name;
    public final String type;
    public final String company;
    public final String location;
    public final String category;
    public final long size;
    public final long cost;
    public final String auxdata;


    public Mountain(String iD, String name, String type, String company, String location, String category, long size, long cost,String auxdata){
        this.iD = iD;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.size = size;
        this.cost = cost;
        this.auxdata = auxdata;
    }

    @Override
    public String toString()
    {
        return name;
    }
}