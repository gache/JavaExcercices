package com.formation.Operateurs.ternaire;

public class OperateurTernaire {
    public static void main(String[] args) {

        int a = 10;
        // La construction ternaire renvoie expression1 en tant que sortie si le premier opérande est évalué à true , expression2 sinon.
        String res = (a % 2 == 0) ? "Le numero est pair" : "Le numero est impaire";

        boolean res2 = (a % 2 == 0) ? true : false;
        if (res2) {
            System.out.println("Le numero est pair");
        } else {
            System.out.println("Le numero est impaire");
        }
        System.out.println(res);
        System.out.println(res2);

        int a1 = 2;
        int b = 3;
        int res3 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        System.out.println(res3);


    }
}
