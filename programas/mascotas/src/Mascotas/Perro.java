/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotas;

/**
 *
 * @author Juferoga
 */
import Abstracto.Mascota;
public class Perro extends Mascota{
    //metodo abstracto que devuelve exito
    @Override
    public String Seleccionar(){
        return " Usted ha seleccionado un Perro :3";
    }
}
