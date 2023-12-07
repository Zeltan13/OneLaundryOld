/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.ModelLogin;
/**
 *
 * @author Fathan Askar
 */
public class LoginController {
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";
    private String username, password;
    private int idAdmin;
    /**
     * Creates new form Admin1
     */
    public boolean LoginController(String usr, String pwd) {
        //initComponents();
        ArrayList<ModelLogin> x = new ArrayList();
        x = getLoginData();
        
        for(ModelLogin ML:x){
            if (usr.equals(ML.getUsername())&& pwd.equals(ML.getPassword())){
                return true;
            }
        };
        return false;
    }
    public ArrayList<ModelLogin> getLoginData(){
        ArrayList listAdmin = new ArrayList();
        String sql = "Select admin.idAdmin, admin.username, admin.password from admin";
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3307/onelaundry", "username", "password");
            PreparedStatement Ps = Con.prepareStatement(sql);
            Rs = Ps.executeQuery();
            while (Rs.next()){
                int idAdmin =  Rs.getInt("idAdmin");
                String username = Rs.getString("username");
                String password = Rs.getString("password");
                listAdmin.add(new ModelLogin(idAdmin,username,password));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAdmin;
    }
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginController().setVisible(true);
//            }
//        });
//    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
