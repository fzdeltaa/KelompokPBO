/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

import bangundatar.Lingkaran;
//import bangunruang.MenghitungRuang;

/**
 *
 * @author angga
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi, luasPermukaan, volume;
    
    public Tabung() {
    }
    
    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }    
    
    @Override
    public void hitungVolume()
    {
        volume = getLuas()*tinggi;
    }
    
    @Override
    public void hitungLuasPermukaan()
    {
        luasPermukaan = getLuas()*2+getKeliling()*tinggi;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}
