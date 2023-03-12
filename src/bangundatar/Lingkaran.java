/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author angga
 */
public class Lingkaran implements MenghitungBidang {
    private double jari, luas, keliling;
    
    public Lingkaran() {
    }
    
    public Lingkaran(double r) {
        jari = r;
    }
    
    @Override
    public void hitungLuas() {
        luas = jari*jari*Math.PI;
    }
    
    @Override
    public void hitungKeliling() {
       keliling = 2*Math.PI*jari; 
    }
    
    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() {
        return keliling;
    }
    
    public double getJari() {
        return jari;
    }
}
