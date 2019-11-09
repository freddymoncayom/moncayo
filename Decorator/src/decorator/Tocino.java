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
/*clase tocino extiende decorador hambur*/ public class Tocino extends DecoradorHamburguesa {
    private Hamburguesa hamburguesa;//atributo de tipo hamburguesa
    public Tocino(Hamburguesa h){
        this.hamburguesa = h;//constructor de tipo hamburguesa
    }
    @Override
    public String getDescripcion(){
        return hamburguesa.getDescripcion()+" + Tocino ";//retorna descripcion del oobj hamburguesa y le agrega +tocino
    }//sobrescribe metodo getdescrip
}