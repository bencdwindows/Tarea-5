/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import java.util.Scanner;

/**
 *
 * @author BEN
 */


public class Principal {
    
    public static void Menu(){
        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Ver Matrícula");
        System.out.println("3. Ver Número de Kilómetros");
        System.out.println("4. Actualizar Kilómetros");
        System.out.println("5. Ver años de antigüedad");
        System.out.println("6. Mostrar propietario");
        System.out.println("7. Mostrar descripción");
        System.out.println("8. Mostrar precio");
        System.out.println("9. Salir");  
    }
    
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in); //Introducimos el objeto Scanner para poder leer la entrada del teclado del usuario
        
        //Procedemos a imprimir por pantalla el menú
        Menu();
        System.out.println("Escriba el número de la opción deseada");
        byte opcion = Byte.parseByte(scn.nextLine());
        
        
    }
}
