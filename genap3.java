/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package latihan1;

/**
 *
 * @author pasha
 */
import java.util.Scanner;

public class genap3 {
    
    public static void main(String[] args) {
        char karakterX = 'X';
        char karakterY = 'y';

        int nilaiASCII_X = (int) karakterX;
        int nilaiASCII_Y = (int) karakterY;

        int hasilJumlah = nilaiASCII_X + nilaiASCII_Y;

        System.out.println("Nilai ASCII dari karakter 'X': " + nilaiASCII_X);
        System.out.println("Nilai ASCII dari karakter 'y': " + nilaiASCII_Y);
        System.out.println("Hasil penjumlahan nilai ASCII: " + hasilJumlah);
    }
}
