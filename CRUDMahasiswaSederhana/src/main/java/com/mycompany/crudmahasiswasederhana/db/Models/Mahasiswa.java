/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.db.Models;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059) 
 */
public class Mahasiswa {
    
    public static Object getnama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nim;
    private String nama; 
    private String alamat; 
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String nim, String nama, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
}
