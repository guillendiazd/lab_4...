package davidguillen_lab4;
import java.util.ArrayList;
import java.util.Scanner;
public class DavidGuillen_Lab4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Jugadores> lista_juga = new ArrayList();
        int opcion = 0;
        while(opcion==0){
            System.out.println("Ingrese Opcion:\n"
                    + "1. Agregar Jugador\n"
                    + "2. Listar Jugadores\n"
                    + "3. Eliminar Jugadores\n"
                    + "4. Juego\n");
            opcion = read.nextInt();
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
            if (opcion==2) {
                int num=0;
                for ( Jugadores t : lista_juga) {
                    System.out.println(num + "" + t);
                }
            }
            if (opcion==3) {
                int num=0;
                for ( Jugadores t : lista_juga) {
                    System.out.println(num + "" + t);
                }
                System.out.println("Ingrese a que jugador desea eliminar:");
                int num_jug = read.nextInt();
                lista_juga.remove(num_jug);
            }
            if (opcion==4) {
                Tablero tab = new Tablero();
                tab.tablero();
            }
            
        }
    }
    
}
