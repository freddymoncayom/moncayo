/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrolloo;

import java.util.ArrayList;

/**
 *
 * @author Beto
 */
public class Sujeto {
    private ArrayList<observador> observadores;//atributo que sera lista de observadores
    private String accion; //atributo que cambia accion de sujeto
    private String lugar;//atributo que cambia lugar de sujeto
    
    public Sujeto(){
        observadores = new ArrayList<observador>();
    } //constructor instanceado lista observadores
    public void registrarObs(observador o){
        observadores.add(o);
    }//metodo llamado registrar observadores recibe un observador y agrega a lista
    
    public void retirarObs(observador o){
        observadores.remove(o);
    }//recibe como parametro observador y retira d elista
    public void ejecutarAccion(String a, String l){
        this.accion = a;
        this.lugar = l;
        notificar();
    }//recibe los dos parametros de accion y lugar  
    public void notificar(){
        for(observador o:observadores){
            o.actualizar(this.accion, this.lugar);
        }
    }


}

