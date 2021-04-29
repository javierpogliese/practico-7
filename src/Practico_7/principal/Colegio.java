package Practico_7.principal;

import Practico_7.entidades.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia inglesI = new Materia(100,"Ingles I", 1);
        Materia matematicaI = new Materia(101,"Matemática I", 1);
        Materia laboratorioI = new Materia(102,"Laboratorio I", 1);
    
        Alumno lopez = new Alumno(1001, "López", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");
        
        lopez.agregarMateria(inglesI);
        lopez.agregarMateria(matematicaI);
        lopez.agregarMateria(laboratorioI);
        martinez.agregarMateria(inglesI);
        martinez.agregarMateria(matematicaI);
        martinez.agregarMateria(laboratorioI);
        martinez.agregarMateria(laboratorioI);

        System.out.println(lopez.getApellido()+": materias inscriptas: "+lopez.cantidadmaterias());
        System.out.println(martinez.getApellido()+": materias inscriptas: "+martinez.cantidadmaterias());
        
    }
    
}
