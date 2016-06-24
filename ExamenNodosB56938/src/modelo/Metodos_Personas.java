/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author administrador
 */
public class Metodos_Personas {
    Persona aux=null;
    Persona primero=null;
    
    public void agregarPersonaNormal(String arreglo[])
    {
        if(primero==null)
        primero = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null);
        else
        getUltimaPersona().setSiguiente(new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null));            
    }
    
    public void agregarṔersona7600(String arreglo[])
    {
        if(primero == null)
        primero = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null);
        else
        {
            aux = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], primero);
        }   primero=aux;
    }
    
    public Persona getUltimaPersona()
    {
        aux=primero;
        
        while(aux.getSiguiente()!=null)
        {
            aux = aux.getSiguiente();
        }
        return aux;
    }
    
    public String mostrarInformacion()
    {
        String informacion="";
        aux=primero;
        
        while(aux.getSiguiente()!=null)
        {
            informacion+=aux.getInformacion()+"\n";
            aux=aux.getSiguiente();
        }
        return informacion;
    }
}
