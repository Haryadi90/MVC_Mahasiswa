package com.model;

import com.Controller.Controller_Mahasiswa;
import com.koneksi.Koneksi;
import com.view.Form_Mahasiswa;
import com.view.data_charmer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


    
public class Model_Mahasiswa implements Controller_Mahasiswa{
    String jk;
    
   
    @Override
    public void Ubah (Form_Mahasiswa mhs)throws SQLException{
  //      throw new UnsupportedOperationException("not support yet
               if(mhs.rbLaki.isSelected()){
            jk = "Laki-laki";
        }
        else{
            jk = "Perempuan";
        }
        
        try {
            Connection con = Koneksi.getKoneksi();
            String sql = "update data_siswa set Nama= ?, Jenis_Kelamin= ?, Jurusan= ? where NIM= ?";   
            PreparedStatement prepare= con.prepareStatement(sql);
            
            prepare.setString(4, mhs.txtNim.getText());
            prepare.setString(1, mhs.txtNama.getText());
            prepare.setString(2, jk);
            prepare.setString(3, (String) mhs.cbJurusan.getSelectedItem());
            prepare.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            Tampil(mhs);
           mhs.setLebarKolom();
            Baru(mhs);
        }
}
    @Override
    public void Hapus (Form_Mahasiswa mhs) throws SQLException{
      // throw new UnsupportedOperationException("not support yet");
                try {
           
            
            Connection con = Koneksi.getKoneksi();
            String sql = "delete from data_siswa where Nim= ?";
            PreparedStatement prepare= con.prepareStatement(sql);
            
            prepare.setString(1, mhs.txtNim.getText());
            prepare.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Hpus");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            Tampil(mhs);
            mhs.setLebarKo1lom();
            Baru(mhs);
        }
        
    }
    @Override
   public void Tampil (Form_Mahasiswa mhs) throws SQLException{
      // throw new UnsupportedOperationException("not support yet");
      mhs.tblmodel.getDataVector().removeAllElements();
      mhs.tblmodel.fireTableDataChanged();
      try {
          Connection con = Koneksi.getKoneksi();
          Statement stt = con.createStatement();
          String sql = "select * from data_siswa order by Nim asc";
          ResultSet res = stt.executeQuery(sql);
          while(res.next())
          {
              Object[] ob= new Object[4]; // di ubah "8"
              ob[0] = res.getString(1);
              ob[1] = res.getString(2);
              ob[2] = res.getString(3);
              ob[3] = res.getString(4);
              mhs.tblmodel.addRow(ob);
          } 
      } catch (Exception e) {
          System.out.println(e);
      }
       
   }
   
   
    @Override
    public void Simpan(Form_Mahasiswa mhs) throws SQLException {
        if(mhs.rbLaki.isSelected()){
           jk = "Laki_Laki";
       }
       else{
           jk ="Perempuan";
       }
       try{
            Connection con = Koneksi.getKoneksi();
            String sql ="insert into data_siswa values(?,?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            //
            prepare.setString(1,mhs.txtNim.getText());
            prepare.setString(2,mhs.txtNama.getText());
            prepare.setString(3, jk);
            prepare.setString(4,(String)mhs.cbJurusan.getSelectedItem());
            prepare.executeUpdate();

            JOptionPane.showMessageDialog(null,"data berhasildisimpan");
            prepare.close();

       }catch (Exception e){
           System.out.println(e);
       }
       finally{
            Tampil(mhs);
            mhs.setLebarKolom();
        }
    }

    @Override
    public void Baru(Form_Mahasiswa mhs) {
        //  throw new UnsupportedOperationException("not suport yet");
        mhs.txtNim.setText("");
        mhs.txtNama.setText("");
        mhs.rbLaki.setSelected(true);
        mhs.cbJurusan.setSelectedIndex(0);

    }

   @Override
    public void KlikTabel(Form_Mahasiswa mhs) throws SQLException { // REVISI
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  try {
                      int pilih = mhs.Tabel.getSelectedRow();
                      if (pilih == -1 ){    
                      }
                      mhs.txtNim.setText(mhs.tblmodel.getValueAt(pilih, 0).toString());
                      mhs.txtNama.setText(mhs.tblmodel.getValueAt(pilih, 1).toString());
                      mhs.cbJurusan.setSelectedItem(mhs.tblmodel.getValueAt(pilih, 3).toString());
                      jk = String.valueOf(mhs.tblmodel.getValueAt(pilih, 2));


                 } catch (Exception e) {
                 }
                 if(mhs.rbLaki.getText().equals(jk)){
                           mhs.rbLaki.setSelected(true);
                      } 
                 else{mhs.rbPerempuan.setSelected(true);}    
             }

    public void tampil(data_charmer aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Baru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Tabel(data_charmer aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void hapus(data_charmer aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
