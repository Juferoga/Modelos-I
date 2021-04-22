/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author juferoga
 */
import Interface.Figuras_geometricas;
public class Triangulo implements Figuras_geometricas{
    private String Nombre;
    private int pos_x, pos_y;
    
    public Triangulo(){        
    }
    
    @Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    public String getNombre(){
        return Nombre;
    }
     
    @Override
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public void getposicion(){
       System.out.println("Altura del triangulo..." + this.pos_y);
       System.out.println("Base del triangulo...." + this.pos_x);  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Triangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
}
