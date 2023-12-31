/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jappsemana11;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class jFrmInternalVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form jFrmInternalVentas
     */
    
    //DefaultListModel listaModel;
    DefaultListModel listaClienteFiltrado;
    
    public jFrmInternalVentas() {
        initComponents();
        //listaModel = new DefaultListModel();
        //ListaVentasHechas.setModel(listaModel);
        listaClienteFiltrado = new DefaultListModel();
        ListaVentasHechas.setModel(listaClienteFiltrado);
    }
    
    void CargarClientes(){
        
        ArrayList<Cliente> ListaFiltrada = (ArrayList<Cliente>) Main.ListadoClientes.stream()
                                                .filter(cliente -> cliente.TipoCliente == 'V')
                                                .collect(Collectors.toList());
        
        
        for (Cliente cliente : ListaFiltrada) {
            String IdeCliente = cliente.IdeCliente;
            String NomCliente = cliente.NomCliente;
            listaClienteFiltrado.addElement(IdeCliente+" "+NomCliente);
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaVentasHechas = new javax.swing.JList<>();

        setClosable(true);
        setTitle("Ventas");

        jButton1.setText("Ventas hechas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaVentasHechas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      CargarClientes();
        /*
        for (String NomCliente : Main.ListaVentas) {
            listaModel.addElement(NomCliente);
            
        }*/
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaVentasHechas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
