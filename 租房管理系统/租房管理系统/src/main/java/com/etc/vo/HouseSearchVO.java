package com.etc.vo;

public class HouseSearchVO {

    private String name;
    private Double minRect;
    private Double maxRect;

    public HouseSearchVO() {
    }

    public HouseSearchVO(String name, Double minRect, Double maxRect) {
        this.name = name;
        this.minRect = minRect;
        this.maxRect = maxRect;
    }

    @Override
    public String toString() {
        return "HouseSearchVO{" +
                "name='" + name + '\'' +
                ", minRect=" + minRect +
                ", maxRect=" + maxRect +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinRect() {
        return minRect;
    }

    public void setMinRect(Double minRect) {
        this.minRect = minRect;
    }

    public Double getMaxRect() {
        return maxRect;
    }

    public void setMaxRect(Double maxRect) {
        this.maxRect = maxRect;
    }
}
