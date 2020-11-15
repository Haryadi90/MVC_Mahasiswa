package com.model;

import com.Controller.Controller_charmer;
import com.koneksi.Koneksi;
import com.view.Form_Mahasiswa;
import com.view.data_charmer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model_charmer implements Controller_charmer{
    @Override
    public void simpan(data_charmer chr) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
        try{
            Connection con = Koneksi.getKoneksi();
           // String sql ="insert into data_charmer values(',Dana_Kuliah,Service_motor,Bayar_Listrik,Bayar_Bpjs,Bayar_Kuota,mamah,Tabungan_Wajib,Simpananf)";
             String sql ="insert into data_charmer values(?,?,?,?,?,?,?,?)";
            
            PreparedStatement prepare = con.prepareStatement(sql);
            //
            prepare.setString(1,chr.data1.getText());
            prepare.setString(2,chr.data2.getText());
            prepare.setString(3,chr.data3.getText());
            prepare.setString(4,chr.data4.getText());
            prepare.setString(5,chr.data5.getText());
            prepare.setString(6,chr.data6.getText());
            prepare.setString(7,chr.data7.getText());
            prepare.setString(8,chr.data8.getText());
            prepare.executeUpdate();

            JOptionPane.showMessageDialog(null,"data berhasildisimpan");
            prepare.close();

       }catch (Exception e){
           System.out.println(e);
       }
       finally{
            Tampil(chr);
            chr.setLebarKolom();
        }

    
    }

    @Override
    public void ubah(data_charmer chr) throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     try {
            Connection con = Koneksi.getKoneksi();
            String sql = "update data_charmer set Service_motor= ?, Bayar_Listrik= ?, Bayar_Bpjs= ?,Bayar_Kuota= ?,mamah= ?,Tabungan_Wajib= ?,Simpananf=? where Dana_Kuliah= ?";   
            PreparedStatement prepare= con.prepareStatement(sql);
            prepare.setString(8,chr.data1.getText());
            prepare.setString(1,chr.data2.getText());
            prepare.setString(2,chr.data3.getText());
            prepare.setString(3,chr.data4.getText());
            prepare.setString(4,chr.data5.getText());
            prepare.setString(5,chr.data6.getText());
            prepare.setString(6,chr.data7.getText());
            prepare.setString(7,chr.data8.getText());
            prepare.executeUpdate();

            prepare.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            Tampil(chr);
           chr.setLebarKolom();
            baru(chr);
        }

    }

    @Override
    public void hapus(data_charmer chr) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    try {
            Connection con = Koneksi.getKoneksi();
            String sql = "delete from data_charmer where Dana_Kuliah= ?";
            PreparedStatement prepare= con.prepareStatement(sql);
            
            prepare.setString(1, chr.data1.getText());
            /*prepare.setString(2, chr.data2.getText());
            prepare.setString(3, chr.data3.getText());
            prepare.setString(4, chr.data4.getText());
            prepare.setString(5, chr.data5.getText());
            prepare.setString(6, chr.data6.getText());
            prepare.setString(7, chr.data7.getText());
            prepare.setString(8, chr.data8.getText());
            */
            prepare.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Hpus");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            Tampil(chr);
            chr.setLebarKo1lom();
            baru(chr);
        }
    }

    @Override
    public void tampil(data_charmer chr) throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       chr.tblmodel.getDataVector().removeAllElements();
      chr.tblmodel.fireTableDataChanged();
        try {
          Connection con = Koneksi.getKoneksi();
          Statement stt = con.createStatement();
          String sql = "select * from data_charmer order by Dana_Kuliah asc";
          ResultSet res = stt.executeQuery(sql);
          while(res.next())
          {
              Object[] ob= new Object[8]; // di ubah "8"
              ob[0] = res.getString(1);
              ob[1] = res.getString(2);
              ob[2] = res.getString(3);
              ob[3] = res.getString(4);
              ob[4] = res.getString(5);
              ob[5] = res.getString(6);
              ob[6] = res.getString(7);
              ob[7] = res.getString(8);
              chr.tblmodel.addRow(ob);
          } 
      } catch (Exception e) {
          System.out.println(e);
      }
    }

    @Override
    public void baru(data_charmer chr) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
      chr.data1.setText("");
      chr.data2.setText("");
      chr.data3.setText("");
      chr.data4.setText("");
      chr.data5.setText("");
      chr.data6.setText("");
      chr.data7.setText("");
      chr.data8.setText("");
      }

    @Override
    public void Tabel(data_charmer chr) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  try {
                      int pilih = chr.Tabel.getSelectedRow();
                      if (pilih == -1 ){    
                      }
                 chr.data1.setText(chr.tblmodel.getValueAt(pilih, 0).toString());
                 chr.data2.setText(chr.tblmodel.getValueAt(pilih, 1).toString());
                 chr.data3.setText(chr.tblmodel.getValueAt(pilih, 2).toString());
                 chr.data4.setText(chr.tblmodel.getValueAt(pilih, 3).toString());
                 chr.data5.setText(chr.tblmodel.getValueAt(pilih, 4).toString());
                 chr.data6.setText(chr.tblmodel.getValueAt(pilih, 5).toString());
                 chr.data7.setText(chr.tblmodel.getValueAt(pilih, 6).toString());
                 chr.data8.setText(chr.tblmodel.getValueAt(pilih, 7).toString());
                 

                 } catch (Exception e) {
                 }
                 
    
    }

    private void Tampil(data_charmer chr) throws SQLException{
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    
      chr.tblmodel.getDataVector().removeAllElements();
      chr.tblmodel.fireTableDataChanged();
      try {
          Connection con = Koneksi.getKoneksi();
          Statement stt = con.createStatement();
          String sql = "select * from data_charmer order by Dana_Kuliah asc";
          ResultSet res = stt.executeQuery(sql);
          while(res.next())
          {
              Object[] ob= new Object[8]; // di ubah "8"
              ob[0] = res.getString(1);
              ob[1] = res.getString(2);
              ob[2] = res.getString(3);
              ob[3] = res.getString(4);
              ob[4] = res.getString(5);
              ob[5] = res.getString(6);
              ob[6] = res.getString(7);
              ob[7] = res.getString(8);
              
              chr.tblmodel.addRow(ob);
          } 
      } catch (Exception e) {
          System.out.println(e);
      }
    }    
    
    
}
