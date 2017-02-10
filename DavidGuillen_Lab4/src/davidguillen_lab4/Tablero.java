package davidguillen_lab4;
public class Tablero {
    public void tablero(){
        char[][] tab = new char[10][10];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println(" ");
        }
    }
}
