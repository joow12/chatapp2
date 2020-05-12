package com.example.stdjavaprograms;

public class Country implements Measurable{
    public Country(String country, double area) {
        this.country = country;
        this.area = area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private double area;
    private String country;

    public Country(){


    }


 /*   public double getArea(){

        return area;
    }*/


    @Override
    public double getMeasurable() {
        return area;
    }
}
