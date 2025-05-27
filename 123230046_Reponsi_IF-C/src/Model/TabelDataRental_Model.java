/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Lab Informatika
 */
public class TabelDataRental_Model extends AbstractTableModel {
    List<DataRental> dr;

    public TabelDataRental_Model(List<DataRental> dr) {
        this.dr = dr;
    }
    @Override
    public int getRowCount(){
        return dr.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "nama";
                
            case 1:
                return "kontak";
                
            case 2:
                return "jenis_mobil";
                
            case 3:
                return "durasi";
                
            case 4:
                return "total_biaya";
                
            case 5:
                return "status_pembayaran";
                
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dr.get(rowIndex).getNama();
            case 1:
                return dr.get(rowIndex).getKontak();
            case 2:
                return dr.get(rowIndex).getJenis_mobil();
            case 3:
                return dr.get(rowIndex).getDurasi();
            case 4:
                double totalharga = 300000 * dr.get(rowIndex).getDurasi();
                NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
                return nf.format(totalharga);
            case 5:
                return dr.get(rowIndex).getStatus_pembayaran();
            default:
                return null;
        }
    }
   
}
