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
public abstract class Piezas {

    private Color color_pieza;
    private String material_pieza;

    public Piezas() {
    }

    public Piezas(Color color_pieza, String material_pieza) {
        this.color_pieza = color_pieza;
        this.material_pieza = material_pieza;
    }

    public abstract void movimiento();

    public abstract void comer();

    public Color getColor_pieza() {
        return color_pieza;
    }

    public void setColor_pieza(Color color_pieza) {
        this.color_pieza = color_pieza;
    }

    public String getMaterial_pieza() {
        return material_pieza;
    }

    public void setMaterial_pieza(String material_pieza) {
        this.material_pieza = material_pieza;
    }

    @Override
    public String toString() {
        return "Piezas{" + "color_pieza=" + color_pieza + ", material_pieza=" + material_pieza + '}';
    }

}
