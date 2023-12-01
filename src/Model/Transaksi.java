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
public class Transaksi {
    private String noTransaksi;
    private String idCustomer;
    private String layanan;
    private String status;
    private String tgl;
    private Item[] item;
    private double total;

    public Transaksi(String noTransaksi, String idCustomer, String layanan, String status, String tgl, Item[] item, double total) {
        this.noTransaksi = noTransaksi;
        this.idCustomer = idCustomer;
        this.layanan = layanan;
        this.status = status;
        this.tgl = tgl;
        this.item = item;
        this.total = total;
    }

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public double getTotal() {
        return total;
    }

    public void calcTotal() {
        int sum = 0;
        for (Item i : this.item) {
            sum += i.getHarga();
        }
        this.total = sum;
    }
    
    
    
    
}
