package com.Controller;

import com.view.data_charmer;
import java.sql.SQLException;




public interface Controller_charmer {

    public void simpan(data_charmer chr) throws SQLException;         //Jika kita menggunakan perintah sql
    public void ubah(data_charmer chr) throws SQLException;
    public void hapus(data_charmer chr) throws SQLException;
    public void tampil(data_charmer chr) throws SQLException;
    public void baru(data_charmer chr);                               // kita melakukan perintah dasar saja
    public void Tabel(data_charmer chr) throws SQLException;

}
