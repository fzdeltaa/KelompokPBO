/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

import bangundatar.Lingkaran;
import static java.lang.Math.sqrt;
//import bangunruang.MenghitungRuang;

/**
 *
 * @author angga
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {
    private double tinggi, luasPermukaan, volume, sisiMiring;
    
    public Kerucut() {
    }
    
    public Kerucut(double r, double t) {
        super(r);
        tinggi = t;
    }

    public void setSisiMiring()
    {
        sisiMiring = sqrt(getJari()*getJari()+tinggi*tinggi);
    }
    
    @Override
    public void hitungVolume()
    {
        volume = getLuas()*tinggi/3;
    }
    
    @Override
    public void hitungLuasPermukaan()
    {
        luasPermukaan = getKeliling()*sisiMiring+getLuas();
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}
