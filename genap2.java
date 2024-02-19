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

public class genap2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan: ");
        double tabungan = scanner.nextDouble();

        System.out.print("Apakah Anda memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        boolean nikah = (tabungan > 100000000) && calonPasangan;
        
        if (nikah) {
            System.out.println("Selamat! Anda bisa menikah.");
        } else {
            System.out.println("Maaf, Anda belum bisa menikah.");
        }

        scanner.close();
    }
}
