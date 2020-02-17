/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.examenfinal;

/**
 *
 * @author luis_
 */
public class Especialidad {
    private String tipo;
    private int nivel;
    
    public Especialidad(String tipo, int nivel){
        
        this.tipo = tipo;
        this.nivel= nivel;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    @Override
    public String toString(){
        return tipo + " nivel " + nivel;
    }
}
