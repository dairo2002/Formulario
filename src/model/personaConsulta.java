/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class personaConsulta {

    // las consultas necesarias de la persona 
    public static ArrayList<Persona> listaPersona = new ArrayList<>();

    //Metodo para agregar persona 
    public static boolean agregarPersona(String identificacion, String nombre, String apellido, int edad) {
        try {
            Persona per = new Persona();
            per.setIdentificacion(identificacion);
            per.setNombre(nombre);
            per.setApellido(apellido);
            per.setEdad(edad);
            listaPersona.add(per);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean modificarPersona(String identificacion, String nombre, String apellido, int edad, int indice) {
        try {
            Persona per = new Persona();
            per.setIdentificacion(identificacion);
            per.setNombre(nombre);
            per.setApellido(apellido);
            per.setEdad(edad);
            listaPersona.add(indice, per);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean eliminarPersona(int indice) {
        try {
            listaPersona.remove(indice);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static Persona consultaPersona(int indice) {
        return listaPersona.get(indice);
    }

    //metodo consultar la lista persona 
    public static ArrayList consultarListPersona() {
        return listaPersona;
        //for (Persona p : listaPersona) {
        //  System.out.println("Nombre: "+p.getNombre());
    }
}
