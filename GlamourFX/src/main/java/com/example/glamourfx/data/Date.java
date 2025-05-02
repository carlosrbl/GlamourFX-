package com.example.glamourfx.data;


import java.time.LocalDateTime;
import java.util.List;

public class Date {
    private String name;
    private LocalDateTime time;
    private Customer customer;
    private Hairdresser hairdresser;
    private List<Service> services;
    private double totalPrice;
    private int totalDuration;

    public Date(String name, LocalDateTime time, Customer customer,
               Hairdresser hairdresser, List<Service> services, double totalPrice, int totalDuration) {
        this.name = name;
        this.time = time;
        this.customer = customer;
        this.hairdresser = hairdresser;
        this.services = services;
        this.totalPrice = totalPrice;
        this.totalDuration = totalDuration;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public Hairdresser getHairdresser() {
        return hairdresser;
    }

    public void setHairdresser(Hairdresser hairdresser) {
        this.hairdresser = hairdresser;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    @Override
    public String toString() {
        return "Date{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", customer=" + customer +
                ", hairdresser=" + hairdresser +
                ", services=" + services +
                ", totalPrice=" + totalPrice +
                ", totalDuration=" + totalDuration +
                '}';
    }
}
