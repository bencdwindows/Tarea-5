/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author BEN
 */
public class Vehiculo {
    Scanner scn = new Scanner(System.in);
    
    private String marca; /*Declaramos los atributos de la clase Vehículo,
                                que son comunes a todos los ojetos de esta clase*/
    private String matricula;
    private int kilometros;
    private LocalDate fechaMatriculacion;
    private int precio;
    private String propietario;
    private String dniPropietario;
    
    public Vehiculo(){}

    public Vehiculo(String marca, String matricula, int kilometros, String fechaMatriculacion, int precio, String propietario, String dniPropietario){}
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void NuevoVehiculo(){
        System.out.println("Marca del vehiculo:");
        marca = scn.nextLine();
        System.out.println("Introduzca la matricula:");
        matricula = scn.nextLine();
        System.out.println("Introduzca los kilometros del vehiculo:");
        kilometros = Integer.parseInt(scn.nextLine());
        System.out.println("Introduzca la fecha de matriculacion (dia-mes-año):");
        int dia = Integer.parseInt(scn.nextLine());
        int mes = Integer.parseInt(scn.nextLine());
        int ano = Integer.parseInt(scn.nextLine());
        fechaMatriculacion = scn.nextLine();
        System.out.println("Introduzca el precio del vehiculo:");
        precio = Integer.parseInt(scn.nextLine());
        System.out.println("Introduzca el nombre del propietario:");
        propietario = scn.nextLine();
        System.out.println("Introduzca el DNI del propietario:");
        dniPropietario = scn.nextLine();
        }
    
    public void ActualizaKms(){
        System.out.println("Sumar nuevo kilometraje:");
        int kmAñadidos = Integer.parseInt(scn.nextLine());
        this.kilometros = kilometros + kmAñadidos;
    }
    
    public int get_Anios(){
        LocalDate fechaActual = LocalDate.now();
        
    }
}
