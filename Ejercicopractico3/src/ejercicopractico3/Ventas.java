/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicopractico3;

/**
 *
 * @author Jimena
 */
public class Ventas {
    private int[][] ventas;
    private String[] productos;
    private String [] dia; 

//Contructores
    
    public Ventas(String productos, int ventas){
        this.productos = productos;
        this.ventas = ventas;
        this.dia = dia;


//Codigo del total de ventas  por producto

public String mostrarVentadeProducto(){
System.out.println("Total de ventas por cada producto:");
for (int j = 0; j < productos.length; j++) {
    int total = 0;
    for (int i = 0; i < ventas.length; i++) {
        total += ventas[i][j];
        }
        System.out.println(productos[j] + ": " + total);
        }
    }
//Codigo para mostrar el dia con mayor ventas

public String mayorVenta(){
    int maxVentas = 0;
    int diamasventa = 0;
for (int i = 0; i< 7; i++){
    int sumaDias = 0;
    for(int j = 0; j <productos.length; j++){
        sumaDias += ventas[i][j];
    }
if (sumaDias > maxVentas ){
maxVentas = sumaDias;
diamasventa = i;
    }
}
String [] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
return dia[diamasventa]+ " (con un total de " + maxVentas + " ventas.)";

}

//Codigo para mostrar producto mas vendido de la semana
public void mostrarProductoMasVendido() {
    int maxVentas = 0;
    int indiceProductoMayor = 0;
for (int j = 0; j < productos.length; j++) {
    int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i][j];
            }
if (total > maxVentas) {
    maxVentas = total;
    indiceProductoMayor = j;
            }
        }

    System.out.println("El producto más vendido es " + productos[indiceProductoMayor] +
                " con un total de " + maxVentas + " unidades.");
    }
}
       

//Codigo para mostrar la matriz

public void mostrarmatriz (){
System.out.println("La matriz de ventas semanales es:");
    String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    for (int i =0; i < 7; i++){
        System.out.print(dias[i] + " ");
    }
    for(int j = 0; j < ventas.length; j++){
        Ventas [i][j] = random.nextInt(10);
        productos[j].setTotalVentas(ventas.length[i][j]);


           
    } 

    }
    
   
}      
    
    

    

