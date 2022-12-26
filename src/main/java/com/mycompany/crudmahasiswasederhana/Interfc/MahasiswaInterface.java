/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.Interfc;

import com.mycompany.crudmahasiswasederhana.db.Models.Mahasiswa;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public interface MahasiswaInterface {
    Mahasiswa insert (Mahasiswa o) throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    
    void  delete (String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;
    
}
