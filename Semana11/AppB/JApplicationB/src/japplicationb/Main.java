/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package japplicationb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    static ArrayList<Cliente> ListadoClientes; //Declare
    
    
    
    
    
    static int IdVenta;
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListadoClientes = new ArrayList<Cliente>();
        FrmPrincipal oFrmPrincipal = new FrmPrincipal();
        oFrmPrincipal.setVisible(true);
        oFrmPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        IdVenta = 1;
        
        Cliente aux = new Cliente();
        aux.setIdeCliente("112070954");
        aux.setNomCliente("Carlos");
        aux.setTipoCliente('M');
        
        
        
        
        
    }
    
}
