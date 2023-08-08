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
    
    static ArrayList<Articulo> ListadoArticulos; //Declare
    
    static ArrayList<DetalleVenta> ListaDetalleVenta; //Declare
    
    static ArrayList<DetalleVenta> ListaDetalleVentaGuardada; //Declare
    
    static int IdVenta;
    
    public static void main(String[] args) {
        
        ListaDetalleVenta = new ArrayList<DetalleVenta>();
        ListaDetalleVentaGuardada = new ArrayList<DetalleVenta>();
        
        // TODO code application logic here
        ListadoClientes = new ArrayList<Cliente>();
        
        Cliente aux = new Cliente();
        aux.setIdeCliente("112070954");
        aux.setNomCliente("Carlos Gonzalez Romero");
        aux.setTipoCliente('M');
        
        ListadoClientes.add(aux);
        
        aux = new Cliente();
        aux.setIdeCliente("222070954");
        aux.setNomCliente("Mario Villalta Robles");
        aux.setTipoCliente('M');
        
        ListadoClientes.add(aux);
        
        aux = new Cliente();
        aux.setIdeCliente("332070954");
        aux.setNomCliente("Rosibel Cordoba Castro");
        aux.setTipoCliente('M');
        
        ListadoClientes.add(aux);
        
        ListadoArticulos = new ArrayList<Articulo>();
        
        Articulo auxArt = new Articulo("A100","Nintendo",200);
        ListadoArticulos.add(auxArt);
        
        auxArt = new Articulo("A200","Super Nintendo",300);
        ListadoArticulos.add(auxArt);
        
        auxArt = new Articulo("A300","Sega",400);
        ListadoArticulos.add(auxArt);
        
        auxArt = new Articulo("A400","PlayStation",500);
        ListadoArticulos.add(auxArt);
        
        
        FrmPrincipal oFrmPrincipal = new FrmPrincipal();
        oFrmPrincipal.setVisible(true);
        oFrmPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        IdVenta = 1;
        
       
        
        
        
        
        
    }
    
}
