/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrolloo;

/**
 *
 * @author Beto
 */
public class Informador extends observador {

    @Override
    public void actualizar(String a, String l){
        System.out.println("Información al jefe, Accion: " +a+"Lugar:"+l);
        }
    }//sobrescribimos metodos actualizar para informar al jefe la accion y lugar que se da

