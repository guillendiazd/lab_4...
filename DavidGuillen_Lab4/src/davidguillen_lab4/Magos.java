/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidguillen_lab4;

import java.awt.Color;

/**
 *
 * @author macbookpro
 */
public class Magos extends Piezas{

    public int[] direccion;
    private String nombre;

    public Magos() {
    super();
    }

    public Magos(int[] direccion, String nombre, Color color_pieza, String material_pieza) {
        super(color_pieza, material_pieza);
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int[] getDireccion() {
        return direccion;
    }

    public void setDireccion(int[] direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Magos{" + "direccion=" + direccion + ", nombre=" + nombre + '}';
    }

    @Override
    public int movimiento(int numer1, int numero2, int numero3, int numero4) {
         if (numer1>=0 && numero2>=0) {
            
        } else {
        }
    }

    @Override
    public int comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
