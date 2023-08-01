/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud_clientes;

import javax.swing.table.DefaultTableModel;
import Entidades.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class JFrmClientes extends javax.swing.JFrame {

    
    // <editor-fold defaultstate="collapsed" desc="Variables Globales">
    DefaultTableModel modeloTablaClientes;
    ArrayList<Cliente> ListadoClientes;
    int Contador;
    //</editor-fold>
    
    
    public JFrmClientes() {
        initComponents();
        grpOpcionesEstado.add(rbnActivo);
        grpOpcionesEstado.add(rbnInactivo);
        CargaClientesBd();
        InicializarModeloTabla();
        CargarJTabla();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Metodos locales">
    void ModificarCliente(){
        
         int filaSeleccionada = jTblClientes.getSelectedRow();
        
        //casteo / casting - conversion de un tipo a otro tipo
        String idenficacion = (String)modeloTablaClientes.getValueAt(filaSeleccionada, 0);
        
        int posicion = -1;
        
        for (int i = 0; i < ListadoClientes.size(); i++) {
            
            if (ListadoClientes.get(i).getIdentificacion().equals(idenficacion)){
                posicion = i;
                break;
            }
                
        }
        
        if (posicion >= 0){
            Cliente aux = ListadoClientes.get(posicion);  //ubicamos el objeto en la colección          
            ListadoClientes.remove(aux); // removemos el objeto identificado
            
            //creamos el nuevo objeto con los datos modificados, rescribiendo los valores excepto la identificación
            aux.setNombre(txtNombre.getText());
            aux.setPrimerApellido(txtApe1.getText());
            aux.setSegundoApellido(txtApe2.getText());
            char Genero = cmbGenero.getSelectedIndex() == 0 ? 'M' : 'F';
            aux.setGenero(Genero);
            boolean Estado = rbnActivo.isSelected();
            aux.setEstado(Estado);
            ListadoClientes.add(aux);
            
        }
        
        
    }
    
    void EliminarCliente(){
      
        int filaSeleccionada = jTblClientes.getSelectedRow();
        
        //casteo / casting - conversion de un tipo a otro tipo
        String idenficacion = (String)modeloTablaClientes.getValueAt(filaSeleccionada, 0);
        
        int posicion = -1;
        
        for (int i = 0; i < ListadoClientes.size(); i++) {
            
            if (ListadoClientes.get(i).getIdentificacion().equals(idenficacion)){
                posicion = i;
                break;
            }
                
        }
        
        if (posicion >= 0){
            Cliente aux = ListadoClientes.get(posicion);            
            ListadoClientes.remove(aux);           
            
        }
        
        
        
        
        
    }
    
     void RegistarCliente(){
        
        Cliente oCliente = new Cliente();
        oCliente.setIdentificacion(txtIdentificacion.getText());
        oCliente.setNombre(txtNombre.getText());
        oCliente.setPrimerApellido(txtApe1.getText());
        oCliente.setSegundoApellido(txtApe2.getText());
        char Genero = cmbGenero.getSelectedIndex() == 0 ? 'M' : 'F';
        oCliente.setGenero(Genero);
        boolean Estado = rbnActivo.isSelected();
        oCliente.setEstado(Estado);
        ListadoClientes.add(oCliente);
        
        
    }
    
    void CargarJTabla(){
        
        //[0,1,2,3,]
        //["112070954","Carlos Gonzalez Romero",'M',"Activo]
        
        Object [] fila;
        
        for (Cliente oCliente : ListadoClientes) {
            fila = new Object[4];
            fila[0] = oCliente.getIdentificacion();
            fila[1] = oCliente.getNombre()+" "+oCliente.getPrimerApellido()+" "+oCliente.getSegundoApellido();
            fila[2] = oCliente.getGenero();
            fila[3] = oCliente.isEstado() ? "Activo" : "Inactivo";
            modeloTablaClientes.addRow(fila);
        }
        
        
        
        
    }
    
    void InicializarModeloTabla(){
        
        modeloTablaClientes = new DefaultTableModel();
        modeloTablaClientes.addColumn("Indentificacion");
        modeloTablaClientes.addColumn("Cliente");
        modeloTablaClientes.addColumn("Genero");
        modeloTablaClientes.addColumn("Estado");
        jTblClientes.setModel(modeloTablaClientes);
        
        
    }
    
    void CargaClientesBd(){
     
        //Tendria la programación para conectarse a una BD y obtener el listado clientes
        
        ListadoClientes = new ArrayList<Cliente>();
        Cliente oCliente = new Cliente();
        oCliente.setIdentificacion("112070956");
        oCliente.setNombre("Carlos");
        oCliente.setPrimerApellido("Gonzalez");
        oCliente.setSegundoApellido("Romero");
        oCliente.setGenero('M');
        oCliente.setEstado(true);
        ListadoClientes.add(oCliente);
        
        oCliente = new Cliente("245712458","Maria","Rojas","Fernanez",'F',true);
        ListadoClientes.add(oCliente);
        
        oCliente = new Cliente("245678942", "Paula", "Brenes", "Castillo", 'F', true);
        ListadoClientes.add(oCliente);
        
        oCliente = new Cliente("742548795", "Helena", "Coto", "Suarez", 'F', false);
        ListadoClientes.add(oCliente);
        
        
        
    }
    
    //</editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpOpcionesEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApe1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApe2 = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbnActivo = new javax.swing.JRadioButton();
        rbnInactivo = new javax.swing.JRadioButton();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Identificacion");

        txtIdentificacion.setEditable(false);
        txtIdentificacion.setName(""); // NOI18N

        jLabel2.setText("Nombre");

        jLabel3.setText("Primer Apellido");

        jLabel4.setText("Segundo Apellido");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel5.setText("Genero");

        jLabel6.setText("Estado");

        rbnActivo.setText("Activo");
        rbnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnActivoActionPerformed(evt);
            }
        });

        rbnInactivo.setText("Inactivo");

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\5402373_write_modify_tool_edit_pen_icon.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\285657_floppy_guardar_save_icon (1).png")); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\3669361_delete_ic_icon.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(201, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbnActivo)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbnInactivo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnModificar)
                                .addGap(33, 33, 33)))
                        .addComponent(btnEliminar)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(btnRegistrar)
                    .addContainerGap(314, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbnActivo)
                    .addComponent(rbnInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(btnRegistrar)
                    .addContainerGap()))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Cliente", "Genero", "Estado"
            }
        ));
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbnActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnActivoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistarCliente();
        InicializarModeloTabla();
        CargarJTabla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        EliminarCliente();
        InicializarModeloTabla();
        CargarJTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        float n = (float) 0.00;
        
       
        
        
        int filaSeleccionada = jTblClientes.getSelectedRow();
        
        //casteo / casting - conversion de un tipo a otro tipo
        String idenficacion = (String)modeloTablaClientes.getValueAt(filaSeleccionada, 0);
        
        int posicion = -1;
        
        for (int i = 0; i < ListadoClientes.size(); i++) {
            
            if (ListadoClientes.get(i).getIdentificacion().equals(idenficacion)){
                posicion = i;
                break;
            }
                
        }
        
        if (posicion >= 0){
            Cliente aux = ListadoClientes.get(posicion);
            txtIdentificacion.setText(aux.getIdentificacion());
            txtNombre.setText(aux.getNombre());
            txtApe1.setText(aux.getPrimerApellido());
            txtApe2.setText(aux.getSegundoApellido());
            int indiceGenero = aux.getGenero() == 'M'?0:1;
            cmbGenero.setSelectedIndex(indiceGenero);
            boolean Estado = aux.isEstado();
            if (Estado){
                rbnActivo.setSelected(true);
            }
            else{
                rbnInactivo.setSelected(true);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_jTblClientesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModificarCliente();
        InicializarModeloTabla();
        CargarJTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.ButtonGroup grpOpcionesEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JRadioButton rbnActivo;
    private javax.swing.JRadioButton rbnInactivo;
    private javax.swing.JTextField txtApe1;
    private javax.swing.JTextField txtApe2;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
