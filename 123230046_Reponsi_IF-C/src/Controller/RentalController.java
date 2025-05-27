/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO_Data.DataRentalDAO;
import DAO_Implement.DataRendalImplement;
import Model.DataRental;
import Model.TabelDataRental_Model;
import View.DashboardPage;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Lab Informatika
 */
public class RentalController {
    DashboardPage dashboardPage;
    DataRendalImplement implementRental;
    List<DataRental> dr;

    public RentalController(DashboardPage dashboardPage) {
        this.dashboardPage = dashboardPage;
        implementRental = new DataRentalDAO();
        dr = implementRental.getall(new DataRental());
    }

    public void isiTabel() {
        dr = implementRental.getall(new DataRental());
        TabelDataRental_Model mp = new TabelDataRental_Model(dr);
        dashboardPage.getjTablerental().setModel(mp);
        
    }

    public void insert() {
        DataRental dr = new DataRental();
        
        dr.setNama(dashboardPage.getjTextFieldnama().getText());
        dr.setKontak(dashboardPage.getjTextFieldkontak().getText());
        dr.setJenis_mobil(dashboardPage.getjTextFieldjenismobil().getText());
        dr.setDurasi(dashboardPage.getjTextFielddurasi().getText());
        dr.setTotal_biaya(dashboardPage.getjTextFieldtotalbiaya().getText());
        dr.setStatus_pembayaran(dashboardPage.getjTextFieldstatuspembayaran().getText());
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
