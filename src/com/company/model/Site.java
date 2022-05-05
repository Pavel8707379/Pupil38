package com.company.model;

public class Site implements Comparable<Site> {
    private String name;
    private int area;
    private int price;

    public Site(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name" + name +
                "area" + area +
                "price" + price;
    }
    public int compareTo (Site arg0){
        return this.area - arg0.area;
    }
}
