/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variable;

import java.util.Scanner;

/**
 *
 * @author reate
 */
public class ejercicio4 {
    public static void main(String[] args) {
        //variable en string
        String  texto = "esto es un hola";
        System.out.println(texto);
        
        //variable tupo numero en var
        var num = 5;
        System.out.println("esto es un numero = " + num);
        
        // variable boleana
        var boleana = true;
        System.out.println("esto es  = " + boleana );
        
        //variable tabular
        var palabraSaludar ="hola pool";
        var palabraDespedir="chau pool";
        System.out.println(palabraSaludar+"\t"+palabraDespedir);
        //caracteres comillas dobles
        var nombre = "juan";
        var apellido = "flores";
        System.out.println("nombre: \t" + "apellido");
        // caracter   comilla simples
        System.out.println("\'"+nombre + "\t" + "\t" + apellido + "\'");
        
        System.out.println("Nombre:\r  " + nombre);
        
        //scanner basico
        Scanner insertar = new Scanner(System.in);
           System.out.println("Escriba nombre de usuario");
           var usuario = insertar.nextLine();
           System.out.println("Usuario: " + usuario);
        // suma simple en var
           var i = 5;
           var j = 3;
           System.out.println(i + j + "La Suma es:");
    }
}
