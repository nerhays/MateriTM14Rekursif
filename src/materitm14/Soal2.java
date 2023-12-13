/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materitm14;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangArray, hasil;

        System.out.print("Masukkan panjang array: ");
        panjangArray = input.nextInt();

        int[] data = new int[panjangArray];

        //System.out.println("Masukkan data array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("masukan data array ke-" + (i + 1) + "= ");
            data[i] = input.nextInt();
        }

        hasil = jumlahArrayRekursif(data, 0, 0);

        System.out.println("Jumlah seluruh data array: " + hasil);
    }

    public static int jumlahArrayRekursif(int[] data, int i, int total) {
        if (i == data.length) {
            return total;
        } else {
            return jumlahArrayRekursif(data, i + 1, total + data[i]);

        }
    }

}
