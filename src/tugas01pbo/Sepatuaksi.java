/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01pbo;

/**
 *
 * @author ASUS
 */
public class Sepatuaksi {
    public static void main(String[] args) {
        Sepatu nevada= new Sepatu ();
        Sepatu nike= new Sepatu ();
        Sepatu adidas= new Sepatu ();
        
        nevada.merk="Nevada";
        nevada.bahan="Nubuck";
        nevada.ukuran="40";
        nevada.warna="Coklat";
        nevada.jenis="Sepatu Santai";
        
        nike.merk="Nike";
        nike.bahan="Suede";
        nike.ukuran="40";
        nike.warna="Maroon";
        nike.jenis="Sepatu Olahraga";
        
        adidas.merk="Adidas";
        adidas.bahan="Brush Off";
        adidas.ukuran="40";
        adidas.warna="Black";
        adidas.jenis="Sepatu Olahraga";
    }
    
}
