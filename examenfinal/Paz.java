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
public class Paz extends Agente{
    private Especialidad especialidad;
    
    public Paz(int id, String name, String planeta, String puesto, String tipo, int nivel){
        super(id, name, planeta, puesto);
        especialidad = new Especialidad(tipo, nivel);
    }
    
    public Especialidad getEspecialidad(){
        return especialidad;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", especialidad en " + especialidad.toString();
    }
}
