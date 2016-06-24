/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class Metodos_Personas {
    Persona aux=null;
    Persona primero=null;
    String informacion[]= new String[6];
    ArrayList<Object> arregloCodigoClientesNormal = new ArrayList<Object>();
    ArrayList<Object> arregloCodigoClientes7600 = new ArrayList<Object>();
    int contador=0, promedio=0;
    
    public void agregarPersonaNormal(String arreglo[])
    {
        if(primero==null)
        primero = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null);
        
        else
        getUltimaPersona().setSiguiente(new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null));            
    }
    
    public void agregarṔersona7600(String arreglo[])
    {
        if(primero==null)
        primero = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], null);
        
        else
        {
            aux = new Persona(arreglo[0], arreglo[1], arreglo[2], Integer.parseInt(arreglo[3]), arreglo[4], arreglo[5], primero);
             primero=aux;
        }  
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
        
        while(aux!=null)
        {
            informacion+=aux.getInformacion()+"\n";
            aux=aux.getSiguiente();
        }
        return informacion;
    }
    
    public String atenderPrimero()
    {
        String informacion="";
        
        informacion=primero.getInformacion();
        primero = primero.getSiguiente();
        
        return informacion;      
    }
    
    
    public void eliminarPersona(String cedula)
    {
        Persona aux = primero;

        if(aux.getCedula().equals(cedula))
            primero=primero.getSiguiente();
       
        else{
            while(aux.getSiguiente()!=null)
            {
                        
                if(aux.getSiguiente().getCedula().equals(cedula))
                {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                     break;
                }
            
                aux=aux.getSiguiente();
            }
            if(cedula.equals(getUltimaPersona().getCedula()))
            {
                aux=primero;           
                while(aux.getSiguiente()!=null)
                {  
                        if(aux.getSiguiente().getSiguiente()==null)
                        {
                            aux.getSiguiente().setSiguiente(null);
                            break;
                        }
                    aux=aux.getSiguiente();
                }
            }
        }
    }
    
    public boolean buscarPersona(String arreglo[])
    {
        boolean encontrado=false;
        aux=primero;
        while(aux!=null)
        {
            if(aux.getCedula().equals(arreglo[1]))
            {
                encontrado=true;
                informacion[0]=aux.getCodigo();
                informacion[1]=aux.getCedula();
                informacion[2]=aux.getNombre();
                informacion[3]=""+aux.getEdad();
                informacion[4]=aux.getFecha();
                informacion[5]=aux.getPrioridad();
            }
            aux=aux.getSiguiente();
        }
        
       return encontrado;
    }
    
    public String[] getInformacionCOnsultada()
    {
        return informacion;
    }
    
    public void modificarPersona(String arreglo[])
    {
        aux = primero;
        
        while(aux!=null)
        {
            if(aux.getCedula().equals(arreglo[1]))
            {
                aux.setNombre(arreglo[2]);
                aux.setEdad(Integer.parseInt(arreglo[3]));
                aux.setFecha(arreglo[4]);
            }
            aux=aux.getSiguiente();
        }
    }
    
    
    public void llenarArreglo()
    {
        aux=primero;
        int contador=0;
        if (primero==null)
            System.out.println("Vacio");
        else
        {
            while(aux!=null)
            {
                if(aux.getPrioridad().equals("Normal"))
                {
                    contador++;
                   arregloCodigoClientesNormal.add(contador);
                }
                aux = aux.getSiguiente();
            }
        }             
    }
    
    public void llenarArreglo7600()
    {
        aux=primero;
        int contador=0;
        if(primero==null)
            System.out.println("Vacio");
        else{
            
            while(aux!=null)
            {
                if(aux.getPrioridad().equals("7600"))
                {
                    contador++;
                    arregloCodigoClientes7600.add(contador);
                    
                }
                aux = aux.getSiguiente();
            }
        }
        
        
    }
    
    public String devolverCodigoNormal()
    {
        llenarArreglo();
        String codigo= "N000";
        if(arregloCodigoClientesNormal.size()==0)
        {
            codigo+=1;
        }
        else
        {
            int numero= (int) arregloCodigoClientesNormal.get(arregloCodigoClientesNormal.size()-1);
            numero++;
            codigo="N000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5, codigo.length());
        return codigo; 
    }
    
    public String devolverCodigo7600()
    {
        llenarArreglo7600();
        String codigo= "E000";
        if(arregloCodigoClientes7600.size()==0)
        {
            codigo+=1;
        }
        else
        {
            int numero= (int) arregloCodigoClientes7600.get(arregloCodigoClientes7600.size()-1);
            numero++;
            codigo="E000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5, codigo.length());
        return codigo; 
    }
    public int getCandidadDePersonas()
    {
        aux=primero;        
        while(aux!=null)
        {
            contador++;
            aux=aux.getSiguiente();
        }
        return contador;
    }
    public int promedioEdad()
    {
        int suma=0;
        aux=primero;
        
        while(aux!=null)
        {
            suma+= aux.getEdad();
            aux=aux.getSiguiente();
        }
        
       return promedio= suma/contador;
    }
    
    public String reportes()
    {
        String informacion="******************REPORTES*******************\n";
        informacion+="Cantidad de personas en la cola----> "+getCandidadDePersonas()+"\n";
        informacion+="Promedio de edad de las personas en la cola----> "+promedioEdad()+"\n";
        informacion+="Personas en la lista:\n";
        informacion+=mostrarInformacion();
        
        return informacion;        
    }
    
    
    public void ordenarDeMayorAMenor()
    {
        aux=primero;
        String tem[]= new String[6];
        for(int contador=0;contador<getCandidadDePersonas();contador++)
        {
            aux=primero;
            while(aux.getSiguiente()!=null)
            {
                if(aux.getEdad()<aux.getSiguiente().getEdad())
                {
                    
                    tem[0]=aux.getCodigo();
                    tem[1]=aux.getCedula();
                    tem[2]=aux.getNombre();
                    tem[3]=""+aux.getEdad();
                    tem[4]=aux.getFecha();
                    tem[5]=aux.getPrioridad();
                   
                    
                    aux.setCodigo(aux.getSiguiente().getCodigo());
                    aux.setCedula(aux.getSiguiente().getCedula());
                    aux.setNombre(aux.getSiguiente().getNombre());
                    aux.setEdad(aux.getSiguiente().getEdad());
                    aux.setFecha(aux.getSiguiente().getFecha());
                    aux.setPrioridad(aux.getSiguiente().getPrioridad());
                    
                    aux.getSiguiente().setCodigo(tem[0]);
                    aux.getSiguiente().setCedula(tem[1]);
                    aux.getSiguiente().setNombre(tem[2]);
                    aux.getSiguiente().setEdad(Integer.parseInt(tem[3]));
                    aux.getSiguiente().setFecha(tem[4]);
                    aux.getSiguiente().setPrioridad(tem[5]);
                    
                                     
                }
                aux=aux.getSiguiente();
            }
                   
        }
    }
    
     public void ordenarDeMenorAMayor()
    {
        aux=primero;
        String tem[]= new String[6];
        for(int contador=0;contador<getCandidadDePersonas();contador++)
        {
            aux=primero;
            while(aux.getSiguiente()!=null)
            {
                if(aux.getEdad()>aux.getSiguiente().getEdad())
                {
                    
                    tem[0]=aux.getCodigo();
                    tem[1]=aux.getCedula();
                    tem[2]=aux.getNombre();
                    tem[3]=""+aux.getEdad();
                    tem[4]=aux.getFecha();
                    tem[5]=aux.getPrioridad();
                   
                    
                    aux.setCodigo(aux.getSiguiente().getCodigo());
                    aux.setCedula(aux.getSiguiente().getCedula());
                    aux.setNombre(aux.getSiguiente().getNombre());
                    aux.setEdad(aux.getSiguiente().getEdad());
                    aux.setFecha(aux.getSiguiente().getFecha());
                    aux.setPrioridad(aux.getSiguiente().getPrioridad());
                    
                    aux.getSiguiente().setCodigo(tem[0]);
                    aux.getSiguiente().setCedula(tem[1]);
                    aux.getSiguiente().setNombre(tem[2]);
                    aux.getSiguiente().setEdad(Integer.parseInt(tem[3]));
                    aux.getSiguiente().setFecha(tem[4]);
                    aux.getSiguiente().setPrioridad(tem[5]);
                    
                                     
                }
                aux=aux.getSiguiente();
            }
                   
        }
    }
    
    
}
