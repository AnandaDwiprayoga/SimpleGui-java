/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class User {
    
    private String password,nama,alamat;
    private int nim;
    
    
    public User(){}
    public User(int nim, String password) {
        this.nim = nim;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

   
    
    public boolean login(){
        boolean login = false;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE NIM = '" + this.nim + "' AND password = '" + this.password + "'");
        
        try {
            while(rs.next()){
                login = true;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return login;
    }
    
    public User getUserLogin(){
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE NIM = '" + this.nim + "' AND password = '" + this.password + "'");
        User user = new User();
        
        try {
            while(rs.next()){
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setPassword(rs.getString("password"));
                user.setNim(rs.getInt("NIM"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public void ubah(){
        String SQL = "UPDATE user SET nama ='" + this.getNama()+"', password='"+ this.getPassword()+"',alamat='"+ this.getAlamat()+"' WHERE NIM = " + this.getNim();
        DBHelper.executeQuery(SQL);
    }
    
}
