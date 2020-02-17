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
public class Prueba {
    
    public static void main(String[] args){
        Federacion federacionGalactica = new Federacion();
        System.out.println(federacionGalactica);
        try{
            
            federacionGalactica.reclutarAgente("Bla", "Tierra", "jefe", 20);
            federacionGalactica.reclutarAgente("Blu", "Marte", "novato", "Economía", 3);
            System.out.println(federacionGalactica.getAgentesSecretos());
            System.out.println(federacionGalactica.getAgentesPaz());
            System.out.println(federacionGalactica.getSueldoTotal());
            federacionGalactica.eliminarAgente(2);
            System.out.println(federacionGalactica.getAgentesSecretos());
            System.out.println(federacionGalactica.getSueldoAgente(federacionGalactica.getAgentes()[1]));
        }catch (llenoException l){
            System.out.println(l);
        }catch (tipoException t){
            System.out.println(t);
                    }catch(vacioException v){
            System.out.println(v);
        }
        }
}
