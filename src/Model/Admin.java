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
public class Admin extends Person implements ManageInventory{
    private String username;
    private String password;
    private Transaksi[] transaksi;

    public Admin(String nama, String alamat, String noTelp, String jenisKelamin, String username, String password, Transaksi[] transaksi) {
        super(nama, alamat, noTelp, jenisKelamin);
        this.username = username;
        this.password = password;
        this.transaksi = transaksi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Transaksi[] getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Transaksi[] transaksi) {
        this.transaksi = transaksi;
    }
    
    @Override
    public void addItem(Item item){
        
    }
    
    @Override
    public void getItemDetails(Item item){
        System.out.println("ID barang : "+item.getIdItem());
        System.out.println("Berat barang: "+item.getBerat());
        System.out.println("Harga pencucian barang : "+item.getHarga());
    }
    
    @Override
    public void updateItem(){
    }
    
    @Override
    public void removeItem(){
        
    }
}
