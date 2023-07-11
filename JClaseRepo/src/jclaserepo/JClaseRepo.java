/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jclaserepo;

/**
 *
 * @author Usuario
 */
public class JClaseRepo {

   
    static Geometria oGeometria; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
          oGeometria = new Geometria();
          oGeometria.RomboGeometrico();
          
        }
        catch(Exception e){           
            System.out.println("No se puede divir entre cero "+e.getMessage());
        
        }
        
        
    }
    
}
