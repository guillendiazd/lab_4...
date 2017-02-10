package davidguillen_lab4;
public class Jugadores {
    private String nombre;
    private String nombre_usuario;
    private int puntos = 0;
    private String luga_naci;
    private int edad;
    private String sexo;

    public Jugadores() {
    }

    public Jugadores(String nombre, String nombre_usuario, String luga_naci, int edad, String sexo) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.luga_naci = luga_naci;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getLuga_naci() {
        return luga_naci;
    }

    public void setLuga_naci(String luga_naci) {
        this.luga_naci = luga_naci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("hombre") || sexo.equalsIgnoreCase("mujer")) {
            this.sexo = sexo;
        } else {
            System.out.println("Valor Invalido");
        }
        
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", nombre_usuario=" + nombre_usuario + ", puntos=" + puntos + ", luga_naci=" + luga_naci + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}
