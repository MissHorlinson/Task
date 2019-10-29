package model;

import util.Clothes;

public class Order {
    private String firstName;
    private String lastName;
    private Clothes product;
    private int number;

    public Order() { }

    public Order(String firstName, String lastName, Clothes product, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.product = product;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Clothes getProduct() {
        return product;
    }

    public void setProduct(Clothes product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
