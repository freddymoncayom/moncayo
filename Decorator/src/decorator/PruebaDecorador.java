/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Scanner;//importamos clase scanner para recibir datos de teclado

/**
 *
 * @author Beto
 */
/*clase pruebadecorador*/public class PruebaDecorador {
    /*metodo main que ejecutara todo el programa*/public static void main(String... args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("****Bienvenidos a Mcdonalds****");
        System.out.println("*******************************");
        System.out.println();//ver por pantalla inicio programa
        
        Hamburguesa hamburguesa = new Hamburguesa();//creamos objeto hamburguesa
        
        int opcion = 0;//creamos ciclo para que pueda a;adir en cualquier orden
        do{
            System.out.println("Seleccione los ingredientes para su hamburguesa: ");//seleccione dicio
            System.out.println("1=Lechuga, 2=Tomate, 3=Queso,4=Tocino 0=Termimar orden");//opciones a añadir
            opcion = sc.nextInt();//capturamos el dato
            switch(opcion){
                case 0:
                    break;
                case 1:
                    hamburguesa=new Lechuga(hamburguesa);//objeto hamburguesa crea nueva instancia lechuga
                    break;
                case 2:
                    hamburguesa=new Tomate(hamburguesa);//objeto hamburguesa crea nueva instancia tomate
                    break;
                case 3:
                    hamburguesa=new Queso(hamburguesa);//objeto hamburguesa crea nueva instancia queso
                    break;
                case 4:
                    hamburguesa=new Tocino(hamburguesa);//objeto hamburguesa crea nueva instancia tocino
                default:
                    System.out.println("Opcion no valida"); //si digita mal la opcion               
            }//env
        }while(opcion!=0);
        
        System.out.println();//sistema informa que esta entregando
        System.out.println("Entregando...");
        System.out.println(hamburguesa.getDescripcion());//muestra por pantalla hamburgues amas lo que aniadio
        System.out.println("Listo,Disfrute su pedido :)");
        
    }
}
