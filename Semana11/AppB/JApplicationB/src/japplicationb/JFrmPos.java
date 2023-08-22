/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package japplicationb;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class JFrmPos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrmPos
     */
    Articulo auxArticulo;
    DefaultTableModel modeloTblDetalleVenta;
    Cliente auxCliente;
    
    
    public JFrmPos() {
        initComponents();
        InicializarModeloTablaVenta();
        CargarModeloTablaVenta();
        TxtIdVenta.setText(Integer.toString(Main.IdVenta));
        
    }
    
    void BuscarCliente(){
        
        //112070954 
        //112070954
        String idenCliente = TxtIdeCliente.getText().trim();
        
        int posicion = -1;
        
        for (int i = 0; i < Main.ListadoClientes.size(); i++) {
            
            
            if (Main.ListadoClientes.get(i).getIdeCliente().equals(idenCliente)){
                posicion = i;
                break;
            }
        }
        
       if (posicion >= 0){
           auxCliente = Main.ListadoClientes.get(posicion);
           TxtNomCliente.setText(auxCliente.getNomCliente());
           String leyendaTipoCliente = auxCliente.getTipoCliente() == 'N' ? "Nacional" : "Extranjero";
                   
           TxtTipoCliente.setText(leyendaTipoCliente);
           TxtCodArticulo.requestFocus();
       } else{
           JOptionPane.showMessageDialog(null,"Cliente no encontrado");
       }        
    }
    
    void BuscarArticulo(){
        
        String CodArticulo = TxtCodArticulo.getText().trim().toUpperCase();
        
        int posicion = -1;
        
        for (int i = 0; i < Main.ListadoArticulos.size(); i++) {
            
            if (Main.ListadoArticulos.get(i).getCodArticulo().equals(CodArticulo)){
                posicion = i;
                break;
            }
        }
        
       if (posicion >= 0){
           auxArticulo = new Articulo();
           auxArticulo = Main.ListadoArticulos.get(posicion);
           TxtNomArticulo.setText(auxArticulo.getNomArticulo().toUpperCase());
           TxtPrecioArticulo.setText(Double.toString(auxArticulo.getPrecioArticulo()));
           TxtCantArticulo.requestFocus();
       } else{
           JOptionPane.showMessageDialog(null,"Articulo no encontrado");
       }        
    }
    
    
    
    void RegistrarVenta(){
        
        DetalleVenta aux = new DetalleVenta();
        aux.setIdVenta(Main.IdVenta);
        aux.setIdeCliente(TxtIdeCliente.getText());
        aux.setCodArticulo(TxtCodArticulo.getText());
        aux.setNomArticulo(TxtNomArticulo.getText());
        aux.setPrecioArticulo(auxArticulo.getPrecioArticulo());
        aux.setCantArticulo(Integer.parseInt(TxtCantArticulo.getText()));
        aux.setTipoCliente(auxCliente.getTipoCliente());
        Double subTotal = aux.getPrecioArticulo() * aux.getCantArticulo();
        aux.setSubTotal(subTotal);
        Main.ListaDetalleVenta.add(aux);
        
        
    }
    
    void InicializarControles(){
        
        TxtIdeCliente.setText("");
        TxtNomCliente.setText("");
        TxtNomArticulo.setText("");
        TxtPrecioArticulo.setText("");
        TxtCantArticulo.setText("");
        TxtCodArticulo.setText("");
    }
    
    void NuevaVenta(){
        Main.IdVenta = Main.IdVenta + 1;
        TxtIdVenta.setText(Integer.toString(Main.IdVenta));
    }
    
    void InicializarModeloTablaVenta(){
        
        modeloTblDetalleVenta = new DefaultTableModel();
        modeloTblDetalleVenta.addColumn("Codigo");
        modeloTblDetalleVenta.addColumn("Articulo");
        modeloTblDetalleVenta.addColumn("Precio");
        modeloTblDetalleVenta.addColumn("Cantidad");        
        modeloTblDetalleVenta.addColumn("SubTotal");        
        JTblDetalleVenta.setModel(modeloTblDetalleVenta);
    }
    
    void CargarModeloTablaVenta(){        
       
        Object [] fila;
        
        for (DetalleVenta oDetalleVenta : Main.ListaDetalleVenta) {
            fila = new Object[5];
            fila[0] = oDetalleVenta.getCodArticulo();
            fila[1] = oDetalleVenta.getNomArticulo();
            fila[2] = oDetalleVenta.getPrecioArticulo();
            fila[3] = oDetalleVenta.getCantArticulo();
            fila[4] = oDetalleVenta.getSubTotal();
            modeloTblDetalleVenta.addRow(fila);
        }
        
    }
    
    void GuardarVenta(){
        
        for (DetalleVenta detalleVenta : Main.ListaDetalleVenta) {
            Main.ListaDetalleVentaGuardada.add(detalleVenta);
        }
        
        Main.ListaDetalleVenta = new ArrayList<DetalleVenta>();
    }
    
    Double ObtenerTotal(){
        
        Double TotalVenta = 0.00 ;
        
        for (DetalleVenta detalleVenta : Main.ListaDetalleVenta) {
            TotalVenta += detalleVenta.getSubTotal();
        }
        
        return TotalVenta;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtIdeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNomCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCodArticulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtNomArticulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtCantArticulo = new javax.swing.JTextField();
        TxtPrecioArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblDetalleVenta = new javax.swing.JTable();
        BtnRegistrarVenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtIdVenta = new javax.swing.JTextField();
        TxtTotalVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnBuscarCliente = new javax.swing.JButton();
        BtnBuscarArticulo = new javax.swing.JButton();
        TxtTipoCliente = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Punto de venta");

        jLabel1.setText("Identificación");

        jLabel2.setText("Cliente");

        TxtNomCliente.setEnabled(false);

        jLabel3.setText("Codigo Articulo");

        jLabel4.setText("Articulo");

        TxtNomArticulo.setEnabled(false);

        jLabel5.setText("Cantidad");

        TxtPrecioArticulo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtPrecioArticulo.setEnabled(false);

        JTblDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Articulo", "Precio", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTblDetalleVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTblDetalleVenta);

        BtnRegistrarVenta.setText("Incluir articulo");
        BtnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Id Venta");

        TxtIdVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TxtIdVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtIdVenta.setEnabled(false);

        TxtTotalVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Total venta");

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnBuscarCliente.setText("Buscar");
        BtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarClienteActionPerformed(evt);
            }
        });

        BtnBuscarArticulo.setText("Buscar");
        BtnBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCantArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtNomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnBuscarArticulo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TxtIdVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxtIdeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BtnBuscarCliente)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(TxtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(82, 82, 82)
                        .addComponent(TxtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(BtnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(BtnRegistrarVenta)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtIdeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarArticulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrecioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtCantArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarVenta)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(26, 26, 26)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
        BuscarCliente();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    private void BtnBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarArticuloActionPerformed
        if (TxtIdeCliente.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Debe indicar un cliente");
            return;
        }
        
        BuscarArticulo();
        
    }//GEN-LAST:event_BtnBuscarArticuloActionPerformed

    private void BtnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarVentaActionPerformed
        
        if (TxtCantArticulo.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Debe indicar la cantidad del articulo a comprar");
            return;
        }
        
        RegistrarVenta();
        InicializarModeloTablaVenta();
        CargarModeloTablaVenta();
        Double TotalVenta = ObtenerTotal();
        TxtTotalVenta.setText(Double.toString(TotalVenta));
        
        TxtNomArticulo.setText("");
        TxtPrecioArticulo.setText("");
        TxtCantArticulo.setText("");
        TxtCodArticulo.setText("");
        TxtCodArticulo.requestFocus();
        
        
    }//GEN-LAST:event_BtnRegistrarVentaActionPerformed

    
    
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       
       int option = JOptionPane.showConfirmDialog(null, "¿Quieres guardar la venta?", "Confirmación", JOptionPane.YES_NO_OPTION);
       
       if (option == JOptionPane.YES_OPTION) {
            GuardarVenta();
            InicializarControles();
            NuevaVenta();
            InicializarModeloTablaVenta();
            CargarModeloTablaVenta();
            Double TotalVenta = ObtenerTotal();
            TxtTotalVenta.setText(Double.toString(TotalVenta));
            
        } 
       
       TxtIdeCliente.requestFocus();
       
      
    }//GEN-LAST:event_BtnGuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarArticulo;
    private javax.swing.JButton BtnBuscarCliente;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnRegistrarVenta;
    private javax.swing.JTable JTblDetalleVenta;
    private javax.swing.JTextField TxtCantArticulo;
    private javax.swing.JTextField TxtCodArticulo;
    private javax.swing.JTextField TxtIdVenta;
    private javax.swing.JTextField TxtIdeCliente;
    private javax.swing.JTextField TxtNomArticulo;
    private javax.swing.JTextField TxtNomCliente;
    private javax.swing.JTextField TxtPrecioArticulo;
    private javax.swing.JTextField TxtTipoCliente;
    private javax.swing.JTextField TxtTotalVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
