package com.doorshouse;

//import java.util.function.Supplier;


public class ShopDoors {
    public ShopDoors(Product product, Staff staff, Stock stock, Customer customer, Finance finance, Transport transport, Supplier
                     supplier){
        this.product = product;
        this.staff = staff;
        this.stock = stock;
        this.customer = customer;
        this.finance = finance;
        this.transport = transport;
        this.supplier = supplier;
    }
    private Product product;
    private Staff staff;
    private Stock stock;
    private Customer customer;
    private Finance finance;
    private Transport transport;
    private Supplier supplier;
}
