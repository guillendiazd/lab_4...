package davidguillen_lab4;

import java.util.ArrayList;

public class Tablero {
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
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println(" ");
        }
    }
}
