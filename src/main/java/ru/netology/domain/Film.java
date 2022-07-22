package ru.netology.domain;

public class Film {
    private String name;
    private int yearRelease;

    private int id;

    public Film(String name, int yearRelease, int id) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
