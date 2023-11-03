/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

/**
 *
 * @author BEN
 */
public class Dni {
    private int numDNI;
    private String nif;
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    public Dni(int numDNI){}
    
    public int getDNI(){
    return numDNI;
    }
    public String getNIF(){
        String cadenaNIF;
        char letraNIF;
        
        letraNIF = Dni.calcularLetraNIF(numDNI);
        cadenaNIF = Integer.toString(numDNI) + String.valueOf(letraNIF);
        return cadenaNIF;
    }

    public void setNumDNI(int numDNI) throws Exception {
        if (numDNI>999999 && numDNI<99999999){
            this.numDNI = numDNI;
        }
        else {
            throw new Exception ("DNI inválido: " + String.valueOf(numDNI));
        }
    }

    public void setNif(String nif) throws Exception {
        if (validarNIF(nif)) {
            this.numDNI = Dni.extraerNumeroNIF(nif);
        }
        else {
            throw new Exception ("NIF inválido: " + nif);
        }
    }

    private static char calcularLetraNIF(int numDNI){
    char letra;
    letra = LETRAS_DNI.charAt(numDNI%23);
    return letra;
    }
    
    private static char extraerLetraNIF(String nif){
    char letra = nif.charAt(nif.length()-1);
    return letra;
    }
    private static int extraerNumeroNIF(String nif){
    int numero = Integer.parseInt(nif.substring(0, nif.length()-1));
    return numero;
    }
    
    private static boolean validarNIF(String nif){
        boolean valido = true;
        char letra_calculada;
        char letra_leida;
        int dni_leido;
        
        if (nif == null){
            valido = false;
        }
        else if (nif.length()<8 || nif.length()>9){ 
            valido = false; 
        }
        else {
            letra_leida = Dni.extraerLetraNIF(nif);
            dni_leido = Dni.extraerNumeroNIF(nif);
            letra_calculada = Dni.calcularLetraNIF(dni_leido);
            if (letra_leida == letra_calculada){
            valido = true;
            }
            else {
            valido = false;
            }
        } return valido;
    }
}
