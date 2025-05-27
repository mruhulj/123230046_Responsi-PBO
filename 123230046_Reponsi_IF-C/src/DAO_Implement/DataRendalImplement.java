/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO_Implement;
import Model.DataRental;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public interface DataRendalImplement {
    public void insert(DataRental dp);
    public List<DataRental>getall(DataRental dp);
    public void update(DataRental dp);
    public void delete(int idRental);
}