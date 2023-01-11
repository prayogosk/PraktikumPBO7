/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan6;

import java.util.InputMismatchException; 
import java.util.Scanner;


class MultiException { 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt ();

        System.out.print("Masukkan pembagi : ");
        int pembagi = input.nextInt ();

        int hasil = bilangan / pembagi;

        System.out.print("Hasil pembagian (dibulatkan: " +
       hasil);
        }

        catch(ArithmeticException e) {
        System.out.println("Bilangan tidak bisa dibagi 0!");
        }

        catch(InputMismatchException e) {
        System.out.println("Harap masukkan angka saja!");
        }
     }
   }
