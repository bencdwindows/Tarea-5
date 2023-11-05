/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import java.time.LocalDate;
import static java.time.LocalDate.of;
import java.time.format.DateTimeFormatter;
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
    /*private LocalDate fechaMatriculacion;*/
    private String fechaMatriculacion;
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

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }
    
    

    /*public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }*/

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
    
    public void ActualizaKms(){
        System.out.println("Sumar nuevo kilometraje:");
        int kmAñadidos = Integer.parseInt(scn.nextLine());
        this.kilometros = kilometros + kmAñadidos;
    }
    
    public int get_Anios(){
        LocalDate fechaActual = LocalDate.now();
        int anoActual = fechaActual.getYear();
        LocalDate anoMatriculacion = LocalDate.parse(fechaMatriculacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int anoAntiguo = anoMatriculacion.getYear();
        return anoActual-anoAntiguo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula + ", kilometros=" + kilometros + ", fechaMatriculacion=" + fechaMatriculacion + ", precio=" + precio + ", propietario=" + propietario + ", dniPropietario=" + dniPropietario + '}';
    }
    
}
