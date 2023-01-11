/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan6.tugas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt ();

        System.out.print("Masukkan perkalian : ");
        int kali = input.nextInt ();

        int jumlah = bilangan * kali;

        System.out.print("Jumlah perkalian (dibulatkan : " +
       jumlah);
        }
        
        //berjalan jika pada input menggunakan tipe data string
        catch(InputMismatchException e) {
        System.out.println("Harap masukkan angka saja!");
        }
        
        try{
           String[] karyawan = new String[2];
           karyawan[0] = "Hamdi";
           karyawan[1] = "Nur";
           // pemanggilan data array yang berpotensi mengakibatkan Exception
           System.out.println(karyawan[29]);
        }
        
        //berjalan jika data yang ingin pada array tidak ada
        catch(ArrayIndexOutOfBoundsException e) {
             System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }
        
        try{
            // pernyataan yang berpotensi mengakibatkan Exception
           int angka = 30;
           int jml = angka/0;
           System.out.println(jml);
        }
        
        catch(ArithmeticException ex){
            // pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Tidak bisa membagi dengan angka 0");
        }
        
        /* Pernyataan disini akan di eksekusi jika terjadi Exception
            Ataupun tidak terjadi Exception */
        finally {
            System.out.println("akhir program");
         }
    }
 }

