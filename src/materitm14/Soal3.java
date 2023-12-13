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
public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        if (isPalindrome(kata)) {
            System.out.println("Kata '" + kata + "' adalah palindrom.");
        } else {
            System.out.println("Kata '" + kata + "' bukan palindrom.");
        }
    }

    public static boolean isPalindrome(String kalimat) {
        if (kalimat.length() <= 1) {
            return true;
        } else {
            char firstChar = kalimat.charAt(0);
            char lastChar = kalimat.charAt(kalimat.length() - 1);

            if (firstChar == lastChar) {
                String substring = kalimat.substring(1, kalimat.length() - 1);
                return isPalindrome(substring);
            } else {
                return false;
            }
        }
    }

}
