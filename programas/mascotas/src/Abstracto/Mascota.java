/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracto;

/**
 *
 * @author Juferoga
 */
public abstract class Mascota {
    
    public Mascota(){};
    
    //metodo abstracto para devolver el almacen en las clases que lo implementen
    public String Seleccionar(){
        return "Escojer almacen preferido";
    }
    
}
