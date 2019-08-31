package com.etc.vo;

public class HouseSearch02 {
    private String name;
    private String floorage;

    public HouseSearch02() {
    }

    public HouseSearch02(String name, String floorage) {
        this.name = name;
        this.floorage = floorage;
    }

    @Override
    public String toString() {
        return "HouseSearch02{" +
                "name='" + name + '\'' +
                ", floorage='" + floorage + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloorage() {
        return floorage;
    }

    public void setFloorage(String floorage) {
        this.floorage = floorage;
    }
}
