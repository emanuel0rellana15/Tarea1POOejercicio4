/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Guardar e imprimir 10 nombres en arreglo");
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];
        //Guardar los nombres en el arreglo
        //Aqui pongo 3 solo para el ejemplo, pero se cambiará a 10
        for(int i=0; i<3; i++){
            System.out.print("Ingresa el nombre#"+(i+1)+": ");
            nombres[i]=scanner.nextLine();
        }
        //Imprimir los nombres
        System.out.println("Nombres ingresados ");
        for(int i=0; i<3; i++){
             System.out.println(nombres[i]);
        }
        
                
    }
}
