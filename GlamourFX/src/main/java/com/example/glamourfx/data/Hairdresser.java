package com.example.glamourfx.data;

public class Hairdresser extends Person {

    double stars;

    public Hairdresser(String name,double stars)
    {
        super(name);
        this.stars = stars;
    }

    public double getStars()
    {
        return stars;
    }

    public void setStars(double stars)
    {
        this.stars = stars;
    }

    @Override
    public String toString()
    {
        return name + " " + stars + " stars";
    }

}
