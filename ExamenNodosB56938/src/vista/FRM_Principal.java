/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Principal;

/**
 *
 * @author administrador
 */
public class FRM_Principal extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Principal
     */
    Controlador_FRM_Principal controlador_FRM_Principal;
    public FRM_Principal() {
        initComponents();
        cargarEdad();
        agregarAlGrupoDeBotones();
        controlador_FRM_Principal=new Controlador_FRM_Principal(this);
        agregarEventos();
        txtCodigo.setEnabled(false);
    }
    
    public void agregarEventos()
    {
        btnAgregar.addActionListener(controlador_FRM_Principal);
        radio7600.addActionListener(controlador_FRM_Principal);
        radioNormal.addActionListener(controlador_FRM_Principal);
        btnSiguiente.addActionListener(controlador_FRM_Principal);
        btnEliminar.addActionListener(controlador_FRM_Principal);
        btnBuscar.addActionListener(controlador_FRM_Principal);
        btnModificar.addActionListener(controlador_FRM_Principal);
        btnReportes.addActionListener(controlador_FRM_Principal);
    }

    public void cargarEdad()
    {
        jcbEdad.removeAllItems();
        
        for (int i = 1; i <=120; i++) {
            jcbEdad.addItem(i);
        }
        
        jcbEdad.setSelectedIndex(30);
    }
    public void agregarAlGrupoDeBotones()
    {
        grupoDeBotones.add(radio7600);
        grupoDeBotones.add(radioNormal);
    }
    
    public String[] getInformacionIngresada()
    {
        String informacion[]= new String[6];
        informacion[0] = txtCodigo.getText();
        informacion[1]= txtCedula.getText();
        informacion[2]= txtNombre.getText();
        informacion[3]= ""+jcbEdad.getSelectedItem();
        informacion[4]= txtFechaCita.getText();
        informacion[5]= controlador_FRM_Principal.getPrioridad();
        return informacion;
    }
    
    public void mostrarInformacion(String texto)
    {
        txtPizarra.setText("");
        txtPizarra.setText(texto);
    }
    
    public String getCedula()
    {
        return txtCedula.getText();
    }
    
    public void setInformacionConsultada(String arreglo[])
    {
        txtCodigo.setText(arreglo[0]);
        txtCedula.setText(arreglo[1]);
        txtNombre.setText(arreglo[2]);
        jcbEdad.setSelectedItem(Integer.parseInt(arreglo[3]));
        txtFechaCita.setText(arreglo[4]);
    }
    
    
    public void colocarCodigo(String codigo)
    {
        txtCodigo.setText(codigo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radio7600 = new javax.swing.JRadioButton();
        radioNormal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbEdad = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPizarra = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        radio7600.setText("7600");

        radioNormal.setText("Normal");

        jLabel3.setText("Prioridad");

        jLabel4.setText("Edad");

        jLabel5.setText("Fecha de cita");

        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("Agregar");

        txtPizarra.setColumns(20);
        txtPizarra.setRows(5);
        jScrollPane1.setViewportView(txtPizarra);

        jLabel6.setText("Codigo");

        btnSiguiente.setText("Siguiente");

        btnEliminar.setText("Eliminar");

        btnBuscar.setText("Buscar");

        btnModificar.setText("Modificar");

        btnReportes.setText("Reportes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio7600)
                                    .addComponent(radioNormal))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2)
                                                            .addComponent(jLabel4))
                                                        .addGap(30, 30, 30)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(37, 37, 37)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtCodigo)
                                                            .addComponent(txtCedula))))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBuscar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnEliminar)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnModificar)
                                                .addGap(28, 28, 28)
                                                .addComponent(btnReportes)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radio7600)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNormal)
                        .addGap(19, 19, 19)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSiguiente)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnReportes))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Principal().setVisible(true);
            }
        });
    }
    
    public void modoEdicion()
    {
        txtCodigo.setEnabled(false);
        txtCedula.setEnabled(false);
        radio7600.setEnabled(false);
        radioNormal.setEnabled(false);
    }
    
    public void inicializarGUI()
    {
        txtCodigo.setEnabled(false);
        txtCodigo.setText("");
        
        txtCedula.setEnabled(true);
        txtCedula.setText("");
        
        txtNombre.setText("");
        
        txtFechaCita.setText("");
        jcbEdad.setSelectedItem(30);
        radio7600.setEnabled(true);
        radioNormal.setEnabled(true);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbEdad;
    public javax.swing.JRadioButton radio7600;
    public javax.swing.JRadioButton radioNormal;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtPizarra;
    // End of variables declaration//GEN-END:variables
}
