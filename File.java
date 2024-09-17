package com.company;

// File class
public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(String indent) {
        System.out.println(indent + "File: " + name);
    }

}
