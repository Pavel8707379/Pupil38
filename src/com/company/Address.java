package com.company;

public class Address {
    public String displayInfo;
    private String city;
    private String street;
    private int home;
    private int apartment;

    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getHome() {
        return home;
    }
    public int getApartment() {
        return apartment;
    }
    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }
    public String  displayInfo(){
        return "Адрес" + " " + city + " " + street + " " + home + " " + apartment;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHome(int home) {
        this.home = home;
    }
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}


