/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicopractico3;

/**
 *
 * @author Jimena
 */
public class Productos {
    private String nombreproducto;
    private int ventas;
    
//Constructores
    
    public Productos(String nombreproducto){
        this.nombreproducto = nombreproducto;
        this.ventas = 0;
    }
//Metodos
public String getNombreProducto(){
    return nombreproducto;
}
public void setVentas (int ventas){
    this.ventas += ventas;
}
public int getVentas (int ventas){
    this.ventas += ventas;
}

}

     


        
        
        