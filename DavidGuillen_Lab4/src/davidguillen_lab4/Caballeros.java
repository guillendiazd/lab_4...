package davidguillen_lab4;
import java.awt.Color;
public class Caballeros extends Piezas {

    public int horizontal;
    public int vertical;
    private String nombre;


    public int posicion1;
    public int posicion2;
    public int actualposicion1;
    public int actualposicion2;

    public Caballeros() {
        super();
    }

    public Caballeros(int posicion1, int posicion2, int actualposicion1, int actualposicion2) {
        this.posicion1 = posicion1;
        this.posicion2 = posicion2;
        this.actualposicion1 = actualposicion1;
        this.actualposicion2 = actualposicion2;
    }

    @Override
    public int movimiento(int numer1, int numero2, int numero3, int numero4) {
        if (numero3-1 ==numer1  && numero2==numero4 || numero3 ==numer1  && numero2-1==numero4) {
            return 0;
        }else{return 1;
        }
        
    }

    @Override
    public int comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
