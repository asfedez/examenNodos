/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Metodos_Personas;
import vista.FRM_Principal;

/**
 *
 * @author administrador
 */
public class Controlador_FRM_Principal implements ActionListener{
    FRM_Principal fRM_Principal;
    String prioridad="";
    Metodos_Personas metodos_Personas = new Metodos_Personas();

    public Controlador_FRM_Principal(FRM_Principal fRM_Principal) {
        this.fRM_Principal = fRM_Principal;
    }
       
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            if(prioridad.equals("7600"))
                metodos_Personas.agregarṔersona7600(fRM_Principal.getInformacionIngresada());
            
            if(prioridad.equals("Normal"))
                metodos_Personas.agregarPersonaNormal(fRM_Principal.getInformacionIngresada());
            
            fRM_Principal.mostrarInformacion(metodos_Personas.mostrarInformacion());
            fRM_Principal.inicializarGUI();
        }
        
        if(e.getSource()==fRM_Principal.radio7600)
        {
            
            prioridad="7600";
            fRM_Principal.colocarCodigo(metodos_Personas.devolverCodigo7600());
        }
        if(e.getSource()==fRM_Principal.radioNormal)
        {
            prioridad="Normal";
            fRM_Principal.colocarCodigo(metodos_Personas.devolverCodigoNormal());
        }
        
        if(e.getActionCommand().equals("Siguiente"))
        {
            JOptionPane.showMessageDialog(fRM_Principal, metodos_Personas.atenderPrimero());
            fRM_Principal.mostrarInformacion(metodos_Personas.mostrarInformacion());
            
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos_Personas.eliminarPersona(fRM_Principal.getCedula());
            fRM_Principal.mostrarInformacion(metodos_Personas.mostrarInformacion());
            fRM_Principal.inicializarGUI();
        }
        
        if(e.getActionCommand().equals("Buscar"))
        {
            if(metodos_Personas.buscarPersona(fRM_Principal.getInformacionIngresada()))
            {
                fRM_Principal.setInformacionConsultada(metodos_Personas.getInformacionCOnsultada());
                fRM_Principal.modoEdicion();
            }

            fRM_Principal.mostrarInformacion(metodos_Personas.mostrarInformacion());
           
            
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos_Personas.modificarPersona(fRM_Principal.getInformacionIngresada());
            fRM_Principal.mostrarInformacion(metodos_Personas.mostrarInformacion());
            fRM_Principal.inicializarGUI();
        }
        if(e.getActionCommand().equals("Reportes"))
        {
            fRM_Principal.mostrarInformacion(metodos_Personas.reportes());
        }
    }
    
    public String getPrioridad()
    {
        return prioridad;
    }
}
