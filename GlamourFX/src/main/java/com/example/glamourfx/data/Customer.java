package com.example.glamourfx.data;

public class Customer extends User {
    private String password2;
    private String email;
    private String phoneNumber;

    public Customer(String name, String password, String password2, String email, String phoneNumber) {
        super(name, password);
        this.password2 = password2;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return super.toString() + ", " + email + ", " + phoneNumber;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
