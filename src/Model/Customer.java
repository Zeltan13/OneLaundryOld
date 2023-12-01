/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DHAFINDRA
 */
public class Customer extends Person{
    private String idCustomer;
    private Item[] items;

    public Customer(String nama, String alamat, String noTelp, String jenisKelamin, String idCustomer, Item[] items) {
        super(nama, alamat, noTelp, jenisKelamin);
        this.idCustomer = idCustomer;
        this.items = items;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
}
