/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author Mimas
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clave, nombre, creditos, hrTeo, HrPr, carrera
        //tipoMat
        String clave, nombre, carrera;
        int creditos, hrTeo, hrPr;
        boolean tipoMat;
        //CAPTURAR
        Scanner captura = new Scanner (System.in);
        System.out.println("Introducir Clave de Asignatura: ");
        clave = captura.nextLine();
         System.out.println("Introducir Nombre del Alumno: ");
        nombre = captura.nextLine();
         System.out.println("Introducir Carrera en Curso: ");
        carrera = captura.nextLine();
       
        System.out.println("Introducir Creditos:");
        creditos = captura.nextInt();
        System.out.println("Introducir Horas Teoricas:");
        hrTeo = captura.nextInt();
        System.out.println("Introducir Hors Practicas:");
        hrPr = captura.nextInt();
        System.out.println("Introducir Tipo de Asignatura TRUE=Asignatura generica FALSE= Asignatura Especialidad :");
        tipoMat = captura.nextBoolean();
        System.out.println("Sus Datos Introducidos Son Los Siguientes:");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(hrTeo);
        System.out.println(hrPr);
        System.out.println(tipoMat);
        
        
        
        
        
        
        
        
        
    }
    
}
