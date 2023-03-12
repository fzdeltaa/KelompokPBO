/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

//import bangunruang.Tabung;
import java.util.Scanner;

/**
 *
 * @author angga
 */

public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
   static void menu() {
       String pilih, ulang;
       double r,t;
       System.out.print("Menu Utama\n"
               + "==========\n"
               + "1. Hitung Bola\n"
               + "2. Hitung Tabung\n"
               + "3. Hitung Kerucut\n"
               + "4. Exit\n"
               + "Pilih: ");
       Scanner input =  new Scanner(System.in);
       pilih = input.nextLine();
       
       switch(pilih) {
           case "1":
               System.out.print("Input Jari - jari: ");
               r = input.nextDouble();
               
               Bola bolaku = new Bola(r);
               bolaku.hitungLuas();               
               bolaku.hitungKeliling();
               bolaku.hitungVolume();
               bolaku.hitungLuasPermukaan();
               System.out.println("Volume Bola= "+bolaku.getVolume());
               System.out.println("Luas Permukaan Bola= "+bolaku.getLuasPermukaan());
            break;
            
            case "2":
               System.out.print("Input Tinggi: ");
               t = input.nextDouble();
               System.out.print("Input Jari - jari: ");
               r = input.nextDouble();
               
               Tabung tabungku = new Tabung(r,t);
               tabungku.hitungLuas();               
               tabungku.hitungKeliling();
               tabungku.hitungVolume();
               tabungku.hitungLuasPermukaan();
               System.out.println("Volume Tabung= "+tabungku.getVolume());
               System.out.println("Luas Permukaan Tabung= "+tabungku.getLuasPermukaan());
            break;
            
            case "3":
               System.out.print("Input Tinggi: ");
               t = input.nextDouble();
               System.out.print("Input Jari - jari: ");
               r = input.nextDouble();
               
               Kerucut kerucutku = new Kerucut(r,t);
               kerucutku.hitungLuas();               
               kerucutku.hitungKeliling();
               kerucutku.hitungVolume();
               kerucutku.hitungLuasPermukaan();
               System.out.println("Volume Kerucut= "+kerucutku.getVolume());
               System.out.println("Luas Permukaan Kerucut= "+kerucutku.getLuasPermukaan());
            break;
            
            default:
                System.out.println("Salah input");
            break;
       }
       System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
       ulang = input.next();
       
       if(ulang.equals("1")) menu();
   }
}