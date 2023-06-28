/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Persona;
import model.personaConsulta;

public class personaController {

    public boolean guardarPersona(String identificacion, String nombre, String apellido, int edad, int indice) {
        if (indice >= 0) {
            //Si el indice es mayor se actualizar, recuerde que el indice inicia en cero
            return personaConsulta.modificarPersona(identificacion, nombre, apellido, edad, indice);
        } else {
            //menor agregar
            return personaConsulta.agregarPersona(identificacion, nombre, apellido, edad);
        }
    }
    
    public void eliminarPersona(int indice) {
        personaConsulta.eliminarPersona(indice);
    }

    public Persona consultaPersona(int indice) {
        return personaConsulta.consultaPersona(indice);
    }

    public ArrayList consultarListPersona() {
        return personaConsulta.consultarListPersona();
    }



}
