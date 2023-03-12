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
public class Bola extends Lingkaran implements MenghitungRuang {
    private double luasPermukaan, volume;
    
    public Bola() {
    }
    
    public Bola(double r) {
        super(r);
    }    
    
    @Override
    public void hitungVolume()
    {
        volume = getLuas()*getJari()*4/3;
    }
    
    @Override
    public void hitungLuasPermukaan()
    {
        luasPermukaan = getLuas()*4;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}
