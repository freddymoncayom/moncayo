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
/*clase queso extiende decorador hambur*/public class Queso extends DecoradorHamburguesa {
    private Hamburguesa hamburguesa;//atributo de tipo hamburguesa
    public Queso(Hamburguesa h){
        this.hamburguesa = h;//constructor devuelve objeto tipo hamburguesa va a decorar
    }
    @Override
    public String getDescripcion(){
        return hamburguesa.getDescripcion()+" + Queso ";//retorna descripcion del oobj hamburguesa y le agrega +queso
    }//sobrescribe metodo getdescrip 
}