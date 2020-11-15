package com.Controller;

import com.view.Form_Mahasiswa;   // fungsi ini memanggil Form_Mahasiswa yang di dalam package com.view
import java.sql.SQLException;



public interface Controller_Mahasiswa {
    public void Simpan(Form_Mahasiswa mhs) throws SQLException;         //Jika kita menggunakan perintah sql
    public void Ubah(Form_Mahasiswa mhs) throws SQLException;
    public void Hapus(Form_Mahasiswa mhs) throws SQLException;
    public void Tampil(Form_Mahasiswa mhs) throws SQLException;
    public void Baru(Form_Mahasiswa mhs);                               // kita melakukan perintah dasar saja
    public void KlikTabel(Form_Mahasiswa mhs) throws SQLException;
}
