/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Fabricante {
    private String nombre;
    private Pais pais;
    private int contador;
    private static ArrayList<Fabricante> listado = new ArrayList();
    
    public Fabricante(String n, Pais p){
        nombre = n;
        pais = p;
        contador = 0;
        listado.add(this);
    }
   
    public void setNombre(String n){
       nombre = n;
    }
    
    public void setPais(Pais n){
       pais = n;
    }
   
    public String getNombre(){
       return nombre;
    }
    
    public Pais getPais(){
       return pais;
    }
    
    public void contar(){
        contador++;
    }
    
    public int getContador(){
        return contador;
    }
    
    public static Fabricante fabricaMayorVentas(){
        int s = 0;
        Fabricante f = null;
        for(int i = 0; i < listado.size(); i++){
            if (listado.get(i).getContador() > s){
               s = listado.get(i).getContador();
               f = listado.get(i);
            }      
        }
        return f;
    }

}
