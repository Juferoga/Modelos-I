/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_fabrica;

/**
 *
 * @author Juferoga
 */
import Fabrica.fabrica;
import java.util.Scanner;
import Abstracto.Mascota;

public class Practica_fabrica {

  
    
    public static void main(String[] args) {
    	
        
        
        
        // TODO code application logic here
    	
        Scanner sc =new Scanner(System.in);
        
        //se crea objeto tipo comun
        Mascota Micomun;
        
        //se crea objeto tipo fabrica
        fabrica Mifabrica;
        
        //se guarda  el objeto a crear como seleccion
        System.out.println("Digite el almacen seleccionado:   ");
        String  seleccion=sc.nextLine();
        
        //se manda por el constructor la seleccion del usuario
        Mifabrica = new fabrica(seleccion);
        
        //se llama al metodo crear_seleccion del objeto mifabrica
        Micomun =  Mifabrica.crear_selecion();
        
        /*Se llama al metodo escojer del objeto MiComun que proviene de la clase abstracta
        Mascota, en este caso el metodo escojer lo tendria la clase que fue seleccionada por el usuario */
        String salir="Seleccione el almacen....:" + Micomun.Seleccionar();
        
        //salir del programa
        System.out.println(salir);
        
    }
    
}
