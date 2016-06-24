/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_Principal;

/**
 *
 * @author administrador
 */
public class Controlador_FRM_Principal implements ActionListener{
    FRM_Principal fRM_Principal;

    public Controlador_FRM_Principal(FRM_Principal fRM_Principal) {
        this.fRM_Principal = fRM_Principal;
    }
       
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            System.out.println("escucha");
        }
        if(e.getSource()==fRM_Principal.radio7600)
        {
            System.out.println("7600");
        }
        if(e.getSource()==fRM_Principal.radioNormal)
        {
            System.out.println("Normal");
        }
    }
}
