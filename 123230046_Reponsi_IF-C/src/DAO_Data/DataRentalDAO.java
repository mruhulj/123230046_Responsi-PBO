/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO_Data;
import DAO_Implement.DataRendalImplement;
import Koneksi.Connector;
import Model.DataRental;
import java.util.*;
import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class DataRentalDAO implements DataRendalImplement {
    Connection connection;
    String insert = "INSERT INTO sewa (id, nama, kontak, jenis_mobil, durasi, total_biaya, status_pembayaran) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
    String select = "SELECT * FROM sewa";
    String update = "UPDATE sewa SET nama = ?, kontak = ?, jenis_mobil = ?, durasi = ?, total_biaya = ?, status_pembayaran = ? WHERE id = ?";
    String delete = "DELETE FROM sewa WHERE id = ?";
    private Object PreparedStatement;
    private PreparedStatement statement;
    
    public DataRentalDAO() {
        connection = Connector.connection();
    }

    @Override
    public void insert(DataRental dp) {
        PreparedStatement = null;
        
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            
        } catch (Exception e) {
        }
    }

    @Override
    public List<DataRental> getall(DataRental dp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(DataRental dp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int idRental) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
