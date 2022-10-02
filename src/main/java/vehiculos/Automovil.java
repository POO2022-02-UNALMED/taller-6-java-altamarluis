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
public class Automovil extends Vehiculo {
    private int puestos;
    private static int contador = 0;
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante f,int algo){
        super(placa,4,100,nombre,precio,peso,"FWD",f);
        puestos = algo;
        contador++;
    }
    
    public void setPuestos(int n){
        puestos = n;
    }
    
    public int getPuestos(){
        return puestos;
    }
    
    public static int getContador(){
        return contador;
    }
}
