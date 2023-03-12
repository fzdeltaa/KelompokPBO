/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author angga
 */
public class BangunDatar {

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        String ulang;
        double r;
        System.out.println("Menu Utama");
        System.out.print("Input Jari - jari: ");
        Scanner input = new Scanner(System.in);

        r = input.nextDouble();
        Lingkaran lingkaranku = new Lingkaran(r);
        lingkaranku.hitungLuas();
        System.out.println("Luas Lingkaran= " + lingkaranku.getLuas());

        System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
        ulang = input.next();

        if (ulang.equals("1")) {
            menu();
        }
    }
}
