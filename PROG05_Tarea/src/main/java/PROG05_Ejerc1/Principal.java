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
    static Scanner scn = new Scanner(System.in); //Introducimos el objeto Scanner para poder leer la entrada del teclado del usuario
    
    static Vehiculo nuevoV = new Vehiculo();
    
    public static void Configurar(){
        System.out.println("Marca del vehiculo:");
        nuevoV.setMarca(scn.nextLine());
        System.out.println("Introduzca la matricula:");
        nuevoV.setMatricula(scn.nextLine());
        System.out.println("Introduzca los kilometros del vehiculo:");
        nuevoV.setKilometros(Integer.parseInt(scn.nextLine()));
        System.out.println("Introduzca la fecha de matriculacion (dia/mes/año):");
        /*fechaMatriculacion = LocalDate.parse(scn.nextLine(), DateTimeFormatter.ofPattern("dd MM yyyy"));*/
        nuevoV.setFechaMatriculacion(scn.nextLine());
        System.out.println("Introduzca el precio del vehiculo:");
        nuevoV.setPrecio(Integer.parseInt(scn.nextLine()));
        System.out.println("Introduzca el nombre del propietario:");
        nuevoV.setPropietario(scn.nextLine());
        System.out.println("Introduzca el DNI del propietario:");
        nuevoV.setDniPropietario(scn.nextLine());
        }
    
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
        
        //Procedemos a imprimir por pantalla el menú
        byte opcion = 0;
        do {
        Menu();
        System.out.println("\nEscriba el número de la opción deseada\n");
        opcion = Byte.parseByte(scn.nextLine());
        
            switch (opcion){
                case 1:{
                    Configurar();
                    break;
                }
                case 2:{
                    System.out.println(nuevoV.getMatricula());
                    break;
                }
                case 3:{
                    System.out.println(nuevoV.getKilometros());
                    break;
                }
                case 4:{
                    nuevoV.ActualizaKms();
                    break;
                }
                case 5:{
                    System.out.println("El vehículo tiene " + nuevoV.get_Anios() + " años");
                    break;
                }
                case 6:{
                    System.out.println("Propietario:\n" + nuevoV.getPropietario());
                    break;
                }
                case 7:{
                    System.out.println(nuevoV.toString());
                    break;
                }
                case 8:{
                    System.out.println("El vehiculo tiene un valor de: " + nuevoV.getPrecio());
                    break;
                }
                case 9:{
                    opcion = 10;
                }
            }
        }
        while (opcion <10);
        
    }
}
