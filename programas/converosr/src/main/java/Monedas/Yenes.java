package Monedas;

import Abstracto.Comun;

/**
*
* @author Juferoga
*/

public class Yenes extends Comun{

	//metodo abstracto que devuelve la selecion	
	@Override
    public String Escojer(){
        return " Yenes";
    }
	//metodo abstracto que hace la conversion de pesos a yenes
	@Override
	public Double Divisa(Double pes) {
		
		Double pesos=pes;
		Double yenes= 0.03 ; 
		Double resultado= pesos*yenes;
		resultado = Math.round(resultado*100.0)/100.0;
		return resultado;	
	}
}
