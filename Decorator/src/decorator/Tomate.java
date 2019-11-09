/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Beto
 */
/*clase tomate extiende decorador hambur*/public class Tomate extends DecoradorHamburguesa {
    private Hamburguesa hamburguesa;//atributo de tipo hamburguesa
    public Tomate(Hamburguesa h){
        this.hamburguesa = h;//constructor de tipo hamburguesa
    }
    @Override//sobrescribir metodo
    public String getDescripcion(){
        return hamburguesa.getDescripcion()+" + Tomate";//retorna descripcion del oobj hamburguesa y le agrega +tomate
    }//sobrescribe metodo getdescrip
}