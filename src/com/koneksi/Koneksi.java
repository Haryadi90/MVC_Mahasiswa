package com.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;


public class Koneksi {
    
    private static Connection koneksi;
    public static Connection getKoneksi(){  
    
         if(koneksi == null){

        try{
                String url="jdbc:mysql://localhost/MVC_Mahasiswa";
                String username= "root";     
                String password= "";         
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return koneksi;
    }

  //  public static Connection getKoneksi() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    

}