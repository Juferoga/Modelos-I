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
public class Gato extends Mascota {
    //metodo abstacto que devuelve Gato
	@Override
    public String Seleccionar(){
        return " Usted ha seleccionado un Gato =^..^=";
    }
}
