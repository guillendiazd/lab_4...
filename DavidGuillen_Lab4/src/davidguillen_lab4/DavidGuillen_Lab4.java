package davidguillen_lab4;
import java.util.ArrayList;
import java.util.Scanner;
public class DavidGuillen_Lab4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList lista_juga = new ArrayList();
        int opcion = 0;
        while(opcion==0){
            System.out.println("Ingrese Opcion:\n"
                    + "1.Agregar Jugador\n");
            if (opcion==1) {
                System.out.println("Ingrese Nombre:");
                String nombre = read.next();
                System.out.println("Ingrese Nombre de Usuario:");
                String nom_usu = read.next();
                System.out.println("Ingrese Lugar de Nacimiento:");
                String lug_nac = read.next();
                System.out.println("Ingrese Edad:");
                int edad = read.nextInt();
                System.out.println("Ingrese Sexo:\n"
                        + ". Hombre\n"
                        + ". Mujer");
                String sexo = read.next();
                lista_juga.add(new Jugadores(nombre, nom_usu, lug_nac, edad, sexo));
            }
        }
    }
    
}
