package com.example.mama.lab4start;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class DbPlace {

    @PrimaryKey(autoGenerate = true)
    private int id;


    private String name;

    private Object location;

    public DbPlace(String name, Object location) {
        this.name = name;
        this.location = location;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }


}
