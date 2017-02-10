package davidguillen_lab4;
import java.awt.Color;
public class Caballeros extends Piezas{
    public int horizontal;
    public int vertical;
    private String nombre;

    public Caballeros() {
        super();
    }

    public Caballeros(int horizontal, int vertical, Color color_pieza, String material_pieza) {
        super(color_pieza, material_pieza);
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Caballeros{" + "horizontal=" + horizontal + ", vertical=" + vertical + ", nombre=" + nombre + '}';
    }
    
}
