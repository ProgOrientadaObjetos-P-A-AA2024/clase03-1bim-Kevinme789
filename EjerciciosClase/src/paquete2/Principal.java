/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        i1.establecerNombre("Universidad Tecnica Particular de Loja");
        i1.establecerInstitucion("Universidad");
        i1.establecerAlumnos(34200);
        i1.establecerNumeroDocentes(600);
        i1.establecerNumeroCedes(10);
        
        System.out.printf("Institucion Educativa: %s\nTipo de institucion"
                + ": %s\nNumero de Alumnos: %d\nNumero de docentes: %d\n"
                + "Numero de Cedes: %d\n", i1.obtenerNombre(),
                i1.obtenerInstitucion(), i1.obtenerAlumnos(), 
                i1.obtenerNumeroDocentes(),i1.obtenerNumeroCedes());
    }
}
