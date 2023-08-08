/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package japplicationb;

/**
 *
 * @author Usuario
 */
public class Articulo {

    public Articulo(){
        
    }
    
    public Articulo(String CodArticulo, String NomArticulo, double PrecioArticulo) {
        this.CodArticulo = CodArticulo;
        this.NomArticulo = NomArticulo;
        this.PrecioArticulo = PrecioArticulo;
    }

    private String CodArticulo;
    
    private String NomArticulo;
    
    private double PrecioArticulo;
    
    public String getCodArticulo() {
        return CodArticulo;
    }

    public void setCodArticulo(String CodArticulo) {
        this.CodArticulo = CodArticulo;
    }

    public String getNomArticulo() {
        return NomArticulo;
    }

    public void setNomArticulo(String NomArticulo) {
        this.NomArticulo = NomArticulo;
    }

    public double getPrecioArticulo() {
        return PrecioArticulo;
    }

    public void setPrecioArticulo(double PrecioArticulo) {
        this.PrecioArticulo = PrecioArticulo;
    }
    
    
    
}
