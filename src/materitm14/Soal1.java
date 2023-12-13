/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materitm14;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata;
        char huruf;

        System.out.println("Inputkan Kalimat =");
        kata = input.next();

        System.out.println("Inputkan huruf yang ingin di inputkan =");
        huruf = input.next().charAt(0);

        int hasil = hitunghuruf(huruf, kata);
        System.out.println("Jumlah Kemunculan Huruf " + huruf + " dari kalimat " + kata + " = " + hasil);
    }

    public static int hitunghuruf(char huruf, String kata) {
        if (kata.length() == 0) {
            return 0;
        } else {
            char katapertama = kata.charAt(0);
            int hitung = (katapertama == huruf) ? 1 : 0;
            return hitung + hitunghuruf(huruf, kata.substring(1));
        }

    }

    
}
