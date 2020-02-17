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
public class llenoException extends Exception{
    @Override
    public String getMessage(){
        return "Capacidad de agentes llena";
    }
}
