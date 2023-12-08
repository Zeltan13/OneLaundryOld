/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.TambahAdmin;
import java.util.ArrayList;
import Model.Admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DHAFINDRA
 */
public class AdminController {
    private TambahAdmin view;
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";

    public boolean AdminController() {
        ArrayList<Admin> a = new ArrayList();
        a = getAdminData();
        
//        for(Admin adm:a){
//            if(){
//                return true;
//            }
//        }
        return false;
    }
    
    public ArrayList<Admin> getAdminData(){
        ArrayList listAdmin = new ArrayList();
        return listAdmin;
    }
    
    private void simpanButtonClicked() {
        // Handle the "Simpan" button click event
        // Retrieve data from the view and perform necessary actions
        String nama = view.getTextFieldNama().getText();
        String alamat = view.getTextFieldAlamat().getText();
        String noTelp = view.getTextFieldnoTelp().getText();
        // Extract other data as needed

        // Perform actions with the data, for example, save it to a database
        // You can add your business logic here
        System.out.println("Data saved: Nama=" + nama + ", Alamat=" + alamat + ", No. Telp=" + noTelp);
    }
    
    
}
