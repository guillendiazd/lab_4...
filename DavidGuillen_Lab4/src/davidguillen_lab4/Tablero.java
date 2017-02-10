package davidguillen_lab4;

import java.util.ArrayList;
import java.util.Scanner;
public class Tablero {
    Scanner read = new Scanner(System.in);
    public String[][] tablero(){
        String[][] tab = new String[10][10];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i==0 && j==0) {
                    tab[i][j] = "CB";
                } else if (i==0 && j==2) {
                    tab[i][j] = "FB";
                } else if (i==0 && j==3) {
                    tab[i][j] = "AB";
                } else if (i==0 && j==4) {
                    tab[i][j] = "RB";
                } else if (i==0 && j==5) {
                    tab[i][j] = "MB";
                } else if (i==0 && j==6) {
                    tab[i][j] = "AB";
                } else if (i==0 && j==7) {
                    tab[i][j] = "FB";
                } else if (i==0 && j==9) {
                    tab[i][j] = "CB";
                } else if (i==1 && j==0) {
                    tab[i][j] = "DB";
                } else if (i==1 && j==2) {
                    tab[i][j] = "AB";
                } else if (i==1 && j==3) {
                    tab[i][j] = "DB";
                } else if (i==1 && j==4) {
                    tab[i][j] = "CB";
                } else if (i==1 && j==5) {
                    tab[i][j] = "FB";
                } else if (i==1 && j==6) {
                    tab[i][j] = "DB";
                } else if (i==1 && j==7) {
                    tab[i][j] = "AB";
                } else if (i==1 && j==9) {
                    tab[i][j] = "DB";
                } else if (i==9 && j==0) {
                    tab[i][j] = "CN";
                } else if (i==9 && j==2) {
                    tab[i][j] = "FN";
                } else if (i==9 && j==3) {
                    tab[i][j] = "AN";
                } else if (i==9 && j==4) {
                    tab[i][j] = "RN";
                } else if (i==9 && j==5) {
                    tab[i][j] = "MN";
                } else if (i==9 && j==6) {
                    tab[i][j] = "AN";
                } else if (i==9 && j==7) {
                    tab[i][j] = "FN";
                } else if (i==9 && j==9) {
                    tab[i][j] = "CN";
                } else if (i==8 && j==0) {
                    tab[i][j] = "DN";
                } else if (i==8 && j==2) {
                    tab[i][j] = "AN";
                } else if (i==8 && j==3) {
                    tab[i][j] = "DN";
                } else if (i==8 && j==4) {
                    tab[i][j] = "CN";
                } else if (i==8 && j==5) {
                    tab[i][j] = "FN";
                } else if (i==8 && j==6) {
                    tab[i][j] = "DN";
                } else if (i==8 && j==7) {
                    tab[i][j] = "AN";
                } else if (i==8 && j==9) {
                    tab[i][j] = "DN";
                } else {
                    tab[i][j] = " ";
                }
            }
        }
        imp_tab(tab);
        return tab;
    }
    public void imp_tab(String[][] tab){
        char r ='s';
        while(r=='s'){
            String[][] tab_tem = new String[10][10];
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    System.out.print(tab[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println("Pieza que desea mover");
            System.out.println("Ingrese Coordenada de x: ");
            int x = read.nextInt();
            System.out.println("Ingrese Coordenada de y: ");
            int y = read.nextInt();
            System.out.println("Donde lo desea mover");
            System.out.println("Ingrese Coordenada i:");
            int i = read.nextInt();
            System.out.println("Ingrese Coordenada en j: ");
            int j = read.nextInt();
            tab_tem = imp(x, y , i, j, tab);
            for (int e = 0; e < tab_tem.length; e++) {
                for (int o = 0; o < tab.length; o++) {
                    System.out.print(tab_tem[e][o]);
                }
                System.out.println(" ");
            }
            System.out.println("Desea continuar[s/n]:");
            r = read.next().charAt(0);
        }
    }
    public String[][] imp(int x, int y, int i, int j, String[][] tab){
        String[][] tab_2 = new String[10][10];
        tab_2=tab;
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                if (i==k && j==l) {
                    tab_2[k][l] = tab[x][y];
                    tab[x][y] = " ";
                }
            }
        }
        return tab_2;
    }
}
