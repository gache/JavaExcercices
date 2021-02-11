package com.formation.tableau.matrice.exercices;

public class Matrice {
    public static void main(String[] args) {

        int[][] ages;
        ages = new int[3][2];

        ages[0][0] = 30;
        ages[0][1] = 15;
        ages[1][0] = 20;
        ages[1][1] = 45;
        ages[2][0] = 5;
        ages[2][1] = 38;

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.print("\t" + ages[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        String[][] prenoms = {{"Marie", "Cesar", "Willian"}, {"Yesenia", "Esteban", "Tereza"}};

        for (int i = 0; i < prenoms.length; i++) {
            for (int j = 0; j < prenoms[i].length; j++) {
                System.out.print("\t" + prenoms[i][j]);
            }
            System.out.println();
        }


    }
}
