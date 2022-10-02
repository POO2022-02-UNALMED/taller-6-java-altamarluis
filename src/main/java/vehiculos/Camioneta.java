/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author LENOVO
 */
public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int contador = 0;
    
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante f,boolean a){
        super(placa,puertas,90,nombre,precio,peso,"4X4",f);
        volco = a;
        contador++;
    }
    
    public void setVolco(boolean b){
        volco = b;
    }
    
    public boolean isVolco(){
        return volco;
    }
    
    public static int getContador(){
        return contador;
    }
}
