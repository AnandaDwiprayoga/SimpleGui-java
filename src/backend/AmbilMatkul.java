/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class AmbilMatkul extends MataKuliah{
    private int id,semester;
    private User user;
    private String namaMatkul;

    public AmbilMatkul(){}
    public AmbilMatkul(int semester, User user){  
        this.semester = semester;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public int getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(int idMatkul) {
        this.idMatkul = idMatkul;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    

    
    public ArrayList<AmbilMatkul> getMatkulByUsrSmtr(){
        ArrayList<AmbilMatkul> list = new ArrayList();
        
        String SQL = "SELECT a.id, m.nama,m.jumlah  FROM ambil_matkul a JOIN matkul m ON a.id_matkul = m.id_matkul WHERE a.id_user ='"+user.getNim()+"' AND a.semester='"+this.semester +"'";
        ResultSet rs = DBHelper.selectQuery(SQL);
        
        try {
            while(rs.next()){
                AmbilMatkul am = new AmbilMatkul();
                am.setId(rs.getInt("id"));
                am.setNamaMatkul(rs.getString("nama"));
                am.setJumlahSks(rs.getInt("jumlah"));
                list.add(am);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public void deleteMatkulByUsrSmtr(){
        String SQL = "DELETE FROM ambil_matkul WHERE id = " + this.getId() +" AND id_user = " + this.getUser().getNim();
        DBHelper.executeQuery(SQL);
    }
    
    @Override
    public void insertKRS(){
        String SQL = "INSERT INTO ambil_matkul (semester, id_user,id_matkul) VALUES ('"+this.getSemester()+"','"+this.user.getNim()+"','"+this.getIdMatkul()+"')";
        DBHelper.executeQuery(SQL);
    }
    
    public ArrayList<AmbilMatkul> getAll(){
        String sql =  "SELECT * FROM matkul";
        ArrayList<AmbilMatkul> listMatkul = new ArrayList();
        ResultSet resultSet  = DBHelper.selectQuery(sql);
        
        try {
            while(resultSet.next()){
                AmbilMatkul matkul = new AmbilMatkul();
                
                matkul.setIdMatkul(resultSet.getInt("id_matkul"));
                matkul.setNamaMatkul(resultSet.getString("nama"));
                matkul.setJumlahSks(resultSet.getInt("jumlah"));
                
                listMatkul.add(matkul);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMatkul;
    }
}
