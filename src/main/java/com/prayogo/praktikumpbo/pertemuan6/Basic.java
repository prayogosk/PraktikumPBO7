/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        int[] myNumbers = {1,2,3, };
        
        try {
            System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erroy : Index Array Kelebihan!");
        }
        
        System.out.println("Program Selesai");
    }
}
