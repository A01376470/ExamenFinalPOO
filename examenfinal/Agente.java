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
public class Agente {
    
    private final int ID;
    private final String NAME;
    private final String PLANETA;
    private String puesto;
    
    public Agente(int id, String name, String planeta, String puesto){
        this.ID = id;
        this.NAME = name;
        this.PLANETA = planeta;
        this.puesto = puesto;
    }
    
    public int getId(){
        return ID;
    }
    
    public String getName(){
        return NAME;
    }
    
    public String getPlaneta(){
        return PLANETA;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    
    @Override
    public String toString(){
        return "Agente: " + NAME + ", ID: " + ID + ", proveniente de: " + PLANETA + ", puesto: " + puesto;
    }
}
