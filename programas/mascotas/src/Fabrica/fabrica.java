/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author Juferoga
 */

import Mascotas.Perro;
import Mascotas.Gato;
import Mascotas.Canario;
import Abstracto.Mascota;

public class fabrica {
    protected String seleccion;
    
    //constructor con argumentos 
    public fabrica(String sel){
        seleccion=sel;
    }
   
    public Mascota crear_selecion(){
    	//retorna un objeto si la seleccion fue perro
        if(seleccion.equalsIgnoreCase("Perro")){
            return new Perro();
        //retorna un objeto si la seleccion fue canario
        }else if(seleccion.equalsIgnoreCase("Canario")){
            return new Canario();
        }
        //retorna un objeto si la seleccion fue gato
        else {
            return new Gato();
        }
    }
    
  
}

