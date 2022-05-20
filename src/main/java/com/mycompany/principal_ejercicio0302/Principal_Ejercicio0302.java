/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal_ejercicio0302;
        
//import java.awt.Dimension;        

/**
 *
 * @author alexa
 */
public class Principal_Ejercicio0302 {

    public static void main(String[] args) {
        
        var v1 = new ventanaInscribete(" INSCRÍBETE ");
        v1.setVisible(true);
        
        var v2 = new ventanaDatosPersonales(" DATOS PERSONALES ");
        v2.setVisible(true);        
        
        var v3 = new ventanaInformacionCarrera(" INFORMACIÓN DE CARRERA ");
        v3.setVisible(true);        

        var v4 = new ventanaCrearGrupo(" CREAR GRUPO ");
        v4.setVisible(true);                
        
        var v5 = new ventanaFinal("Ventana Final");
        v5.setVisible(true);         
        
    }
        
}
