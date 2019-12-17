/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public abstract class MataKuliah {
    public int idMatkul,jumlahSks;
    private String namaMatkul;
    
    public abstract void deleteMatkulByUsrSmtr();
    public abstract void insertKRS();
    
}
