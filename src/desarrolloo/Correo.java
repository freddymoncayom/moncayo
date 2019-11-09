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
public class Correo extends observador{
    
    @Override
    public void actualizar(String a, String l){
        System.out.println("Enviando correo, Accion" +a+ "Lugar:"+l);
        }
    }//extend implementa interface observador

