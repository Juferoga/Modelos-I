package Abstracto;

/**
*
* @author Juferoga
*/

public class Comun {
	public Comun(){};
     
    //metodo abstracto para seleccionar la moneda 
    public String Escojer(){
        return "Seleccione la moneda a convertir  ";
    }
    //metodo abstracto para la conversion de monedas 
    public Double Divisa(Double pes) {
    	Double pesos = pes;
    	return pesos;
    }
    
}
