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
public class Federacion {
     private Agente[] agentes;
     private int idCount = 0;
     private int numAgentes = 0;
     
     public Federacion(){
         agentes = new Agente[50];
         
     }
     
     public Agente[] getAgentes(){
         return agentes;
     }
     
     public void reclutarAgente(String name, String planeta, String puesto, String tipo, int nivel) throws tipoException, llenoException{
         if(!tipo.equalsIgnoreCase("Educación") && !tipo.equalsIgnoreCase("Economía") && !tipo.equalsIgnoreCase("Energía")){
             throw new tipoException();
         }
         if(nivel <1 || nivel>5){
             throw new tipoException();
         }
         if (numAgentes == agentes.length){
             throw new llenoException();
         }
         Agente agente = new Paz(idCount, name, planeta, puesto, tipo, nivel);
         int count=0;
         for (Agente agent: agentes){
             if (agent== null){
                 agentes[count] = agente;
                 break;
             }
             
             count++;
             
         }
         idCount++;
         numAgentes++;
     }
     
     public void reclutarAgente(String name, String planeta, String puesto, int numPlanetas) throws llenoException{
         if (numAgentes == agentes.length){
             throw new llenoException();
         }
         Agente agente = new Secreto(idCount, name, planeta, puesto, numPlanetas);
         int count=0;
         for (Agente agent: agentes){
             if (agent== null){
                 agentes[count] = agente;
                 idCount++;
                 numAgentes++;
                 break;
             }
             
             count++;
             
         }
         
     }
     
     public double getSueldoAgente(Agente agente){
         if(agente instanceof Paz){
             Paz pazAgente = (Paz)agente;
             if (pazAgente.getEspecialidad().getTipo().equalsIgnoreCase("Educación")){
                 return pazAgente.getEspecialidad().getNivel();  
             } else if(pazAgente.getEspecialidad().getTipo().equalsIgnoreCase("Economía")){
                 return 2* pazAgente.getEspecialidad().getNivel();
             }else if(pazAgente.getEspecialidad().getTipo().equalsIgnoreCase("Energía")){
                 return 3* pazAgente.getEspecialidad().getNivel();
             }
         }else if(agente instanceof Secreto){
             Secreto sAgente= (Secreto)agente;
             return sAgente.getNumPlanetas();
         }
         
         return 0;
     }
     
     public double getSueldoTotal(){
         int sueldoTotal = 0;
         for(Agente agente: agentes){
             sueldoTotal += getSueldoAgente(agente);
         }
         return sueldoTotal;
     }
     
     public String getAgentesPaz(){
        if(numAgentes ==0){
            return "no hay agentes";
        }
         String paz ="";
         for(Agente agente: agentes){
             if(agente instanceof Paz){
                 Paz pazAgente = (Paz)agente;
                 paz+=pazAgente.toString();
             }
         }
         if(paz.equals("")){
             return "No hay agentes de paz";
         }
         return paz;
     }
     
     public String getAgentesSecretos(){
         
        String secretos ="";
        if(numAgentes ==0){
            return "no hay agentes";
        }
         for(Agente agente: agentes){
             if(agente instanceof Secreto){
                 Secreto sAgente = (Secreto)agente;
                 secretos += sAgente.toString() + ". ";
             }
         }
         if(secretos.equals("")){
             return "No hay agentes secretos";
         }
         return secretos;
     }
     
     
     public void eliminarAgente(int id) throws vacioException{
         if(numAgentes == 0){
             throw new vacioException();
         }
         for(int i = 0;i<agentes.length; i++){
             if(agentes[i]!= null){
                if(id == agentes[i].getId()){
                    agentes[i] = null;
                    numAgentes--;
                }
             }
         }
         
     }
}
