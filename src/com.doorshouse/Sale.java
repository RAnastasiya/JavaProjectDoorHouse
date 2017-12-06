package com.doorshouse;

import java.util.Date;

public class Sale {
    public Sale(Product product, int amount, Date saleDate, Customer customer) {
        this.product = product;
        this.amount = amount;
        this.saleDate = saleDate;
        this.customer = customer;
    }

    private Product product;
    private int amount;
    private Date saleDate;
    private Customer customer;
}
