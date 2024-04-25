/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;

    /*Crear los método necesarios*/
    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerInstitucion(String c) {
        tipoInstitucion = c;
    }

    public void establecerAlumnos(int c) {
        numeroAlumnos = c;
    }

    // public void establecerValorFactura(){
    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }

    public void establecerNumeroCedes(int c) {
        numeroSedes = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerAlumnos() {
        return numeroAlumnos;
    }

    // public void establecerValorFactura(){
    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroCedes() {
        return numeroSedes;
    }

}
