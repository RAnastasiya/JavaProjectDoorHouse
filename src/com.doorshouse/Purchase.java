package com.doorshouse;

import java.util.Date;

public class Purchase {

    public Purchase(Product product, int amount, Date date, Supplier supplier, Stock stock) {
        this.product = product;
        this.amount = amount;
        this.date = date;
        this.supplier = supplier;
        this.stock = stock;
    }

    private Product product;
    private int amount;
    private Date date;
    private Supplier supplier;
    private Stock stock;
}
