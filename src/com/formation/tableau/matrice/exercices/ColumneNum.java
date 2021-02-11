package com.formation.tableau.matrice.exercices;

public class ColumneNum {

    public static void main(String[] args) {

        int[][] num;
        num = new int[4][5];

        num[0][0] = 20;
        num[0][1] = 18;
        num[0][2] = 22;
        num[0][3] = 20;
        num[0][4] = 16;
        num[1][0] = 18;
        num[1][1] = 20;
        num[1][2] = 18;
        num[1][3] = 21;
        num[1][4] = 20;

        num[2][0] = 16;
        num[2][1] = 18;
        num[2][2] = 16;
        num[2][3] = 20;
        num[2][4] = 14;

        num[3][0] = 25;
        num[3][1] = 24;
        num[3][2] = 22;
        num[3][3] = 24;
        num[3][4] = 25;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("| " +num[i][j]  +  " | " );
            }
            System.out.println();
        }


    }
}
