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
public class Pais {
   private String nombre;
   private static ArrayList<Pais> listado = new ArrayList();
   private int contador;
   
   public Pais(String n){
       nombre = n;
       listado.add(this);
       contador = 0;
   }
   
   public void setNombre(String n){
       nombre = n;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void contar(){
        contador++;
    }
   
   public int getContador(){
        return contador;
    }
   
   public static Pais paisMasVendedor(){
        int s = 0;
        Pais p = null;
        for(int i = 0; i < listado.size(); i++){
            if (listado.get(i).getContador() > s){
               s = listado.get(i).getContador();
               p = listado.get(i);
            }      
        }
        return p;
   }
    
}
