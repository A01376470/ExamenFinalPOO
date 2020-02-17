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
public class Secreto extends Agente{
    private int numPlanetas;
    
    public Secreto(int id, String name, String planeta, String puesto, int numPlanetas){
        super(id, name, planeta, puesto);
        this.numPlanetas = numPlanetas;
    }
    
    public int getNumPlanetas(){
        return numPlanetas;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", número de planetas adoctrinados: " + numPlanetas;
    }
}
