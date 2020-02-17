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
public class tipoException extends Exception {
    @Override
    public String getMessage(){
        return "Tipo de Especialidad inválida o nivel Inválido";
    }
}
