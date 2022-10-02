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
public class Camion extends Vehiculo {
    int ejes;
    private static int contador = 0;
        
    public Camion(String placa, String nombre, int precio, int peso, Fabricante f,int algo){
        super(placa,2,80,nombre,precio,peso,"4x2",f);
        ejes = algo;
        contador++;
    }
    
    public void setEjes(int e){
        ejes = e;
    }
    
    public int getEjes(){
        return ejes;
    }
    
    public static int getContador(){
        return contador;
    }
    
}
