package com.formation.constante;

public class DriverExerciceConst {
    public static void main(String[] args) {
        ExerciceConst exerciceConst = new ExerciceConst("Maud");
        ExerciceConst exerciceConst2 = new ExerciceConst("Erick");
        exerciceConst2.setNom("Delgado");

        System.out.println(exerciceConst.getNomComplet());
        System.out.println(exerciceConst2.getNomComplet());


    }
}
