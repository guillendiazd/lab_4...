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
public class Duendes extends Piezas {
    public int paso;
    private String nombre;

    public Duendes() {
    super();
    }

    public Duendes(int paso, String nombre, Color color_pieza, String material_pieza) {
        super(color_pieza, material_pieza);
        this.paso = paso;
        this.nombre = nombre;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Duendes{" + "paso=" + paso + ", nombre=" + nombre + '}';
    }
    
    
}
