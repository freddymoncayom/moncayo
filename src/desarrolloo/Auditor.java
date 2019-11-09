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
public class Auditor extends observador {

    @Override
    public void actualizar(String a, String l){
        System.out.println("Guardado en la BD, Accion: " +a+"Lugar:"+l);
        }
    }//sobreescribe metodo actualizar para informar que esta guardando base de datos audoria accion y lugar de sujeto

