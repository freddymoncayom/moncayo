/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrolloo;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class Prueba {
    Sujeto sujeto;//atributos
    Correo correo;
    Auditor auditor;
    Informador informador;
    
   /*metodo */ public void ejecutaPrueba(){
        sujeto = new Sujeto();//instancia sujeto
        correo = new Correo();
        auditor = new Auditor();
        informador = new Informador();
        String accion="", lugar="";//string que guardaran accion y lugar
        int opAccion;//para crear menu dond seleccionara opciones
        Scanner sc = new Scanner(System.in);//objeto clase scanner para recibir teclado
        
       /*menu hasta que salga del programa 0 */ do{
            escribirMenu();
            opAccion = sc.nextInt();//se captura opcion 
            sc = new Scanner(System.in);//para no crear otro objeto scanner, instanciamos como nuevo objeto
            switch(opAccion){
                case 1:
                    System.out.print("Escriba la accion: ");//solicitamos escriba accion
                    accion = sc.nextLine();//capturamos accion
                    System.out.print("Escriba el lugar: ");//solicitamos lugar
                    lugar = sc.nextLine();//capturamos
                    sujeto.ejecutarAccion(accion, lugar);//al objeto sujeto le ejecutamos el metodo ejuctar accion
                    System.out.print("\n\n");//para organizar
                    break;
                case 2:
                    escribeSeleccion();//ejecutamos metodo
                    agregarObservador(sc.nextInt());//ejecuta metodo agregar obs con parametro lo que puso el usuario
                    break;
                case 3:
                    escribeSeleccion();
                    retirarObservador(sc.nextInt());//ejecuta metodo retiraer observador, recibe entero como parametro
                    break;
                case 0:
                    System.exit(0);
                    break;
                   default:
                       System.out.println("Opcion erronea!");
            }
            }while(opAccion!=0);//para salir 
        }
       /*metodo escribe menu */ public void escribirMenu(){
            System.out.println("**************************");
            System.out.println(" Escoge una opcion       *");
            System.out.println(" 1.- Realizar Accion     *");
            System.out.println(" 2.- Agregar Observador  *");
            System.out.println(" 3.- Retirar Observador  *");
            System.out.println(" 0.- Salir               *");
            System.out.println("**************************");    /*enviara a pantalla este menu*/  
            
        }
       /*metodo escri seleccion*/ public void escribeSeleccion(){
            System.out.println("**************************");
            System.out.println(" Escoge una opcion       *");
            System.out.println(" 1.- Enviar correo       *");
            System.out.println(" 2.- Registrar Accion *");
            System.out.println(" 3.- Informar al Jefe    *");
            System.out.println("**************************"); 
        }
        /*este metodo recibe entero*/public void agregarObservador(int o){
          boolean ok = true;
          switch(o){
              case 1:
                  sujeto.registrarObs(correo);//a sujeto se le agrega observador correo
                  break;
              case 2:
                  sujeto.registrarObs(auditor);//a sujeto se le agrega observador auditor
                  break;
              case 3:
                  sujeto.registrarObs(informador);//a sujeto se le agrega observador informador
                  break;
                  default:
                      ok= false;
                      System.out.println("Opcion erronea");//si no es correcta sale mensaje error
                     if(ok) System.out.println("Observador Agregado");//si variable es correcta se agrega
          }
        }
           /*metodo recibe como parametro entero*/     public void retirarObservador(int o){
          boolean ok = true;//variale controla usuario haya seleccionado opcion valida
          switch(o){
              case 1:
                  sujeto.retirarObs(correo);//al sujeto retirarmos observadores correo
                  break;
              case 2:
                  sujeto.retirarObs(auditor);//al sujeto retirarmos observadores auditor
                  break;
              case 3:
                  sujeto.retirarObs(informador);//al sujeto retirarmos observadores informador
                  break;
                  default:
                      ok= false;
                      System.out.println("Opcion erronea");
                     if(ok) System.out.println("Observador Retirado");
          }
        }
                public static void main(String args[]){
                    Prueba p = new Prueba();
                    p.ejecutaPrueba();//metodo main cual se instancia objeto prueba y ejecutamos codigo
                }
    }
    

