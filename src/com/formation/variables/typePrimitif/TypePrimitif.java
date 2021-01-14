package com.formation.variables.typePrimitif;

public class TypePrimitif {
    public static void main(String[] args) {
        // Stoke numeros entier
        // byte, short, int, long

        System.out.println("--------- Byte ---------");
        System.out.println("bits type byte: " + Byte.SIZE);
        System.out.println("bytes type byte: " + Byte.BYTES);
        System.out.println("Valeur Max type byte: " + Byte.MAX_VALUE);
        System.out.println("Valeur Min type byte: " + Byte.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Short ---------");
        System.out.println("bits type Short: " + Short.SIZE);
        System.out.println("bytes type Short: " + Short.BYTES);
        System.out.println("Valeur Max type Short: " + Short.MAX_VALUE);
        System.out.println("Valeur Min type Short: " + Short.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Int ---------");
        System.out.println("bits type Int: " + Integer.SIZE);
        System.out.println("bytes type Int: " + Integer.BYTES);
        System.out.println("Valeur Max type Int: " + Integer.MAX_VALUE);
        System.out.println("Valeur Min type Int: " + Integer.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Long ---------");
        System.out.println("bits type Long: " + Long.SIZE);
        System.out.println("bytes type Long: " + Long.BYTES);
        System.out.println("Valeur Max type Long: " + Long.MAX_VALUE);
        System.out.println("Valeur Min type Long: " + Long.MIN_VALUE);
        System.out.println();
        System.out.println();

        System.out.println("***** exemples *****");
        byte entier;
        entier = 80;
        short entier2 = 1800;
        int entier3 = 15000;
        long entier4 = 1500000;

        System.out.println("Le Numéro byte est: " + entier);
        System.out.println("Le Numéro short deux  est: " + entier2);
        System.out.println("Le Numéro int trois est: " + entier3);
        System.out.println("Le Numéro long quatre est: " + entier4);

        // **************************************   ***********************************

        // Float, double
        // stoke numeros decimal

        System.out.println();
        System.out.println("--------- Float ---------");
        System.out.println("bits type Float: " + Float.SIZE);
        System.out.println("bytes type Float: " + Float.BYTES);
        System.out.println("Valeur Max type Float: " + Float.MAX_VALUE);
        System.out.println("Valeur Min type Float: " + Float.MIN_VALUE);
        System.out.println();

        System.out.println("--------- Double ---------");
        System.out.println("bits type Double: " + Double.SIZE);
        System.out.println("bytes type Double: " + Double.BYTES);
        System.out.println("Valeur Max type Double: " + Double.MAX_VALUE);
        System.out.println("Valeur Min type Double: " + Double.MIN_VALUE);
        System.out.println();

        System.out.println("***** exemples *****");
        float decimal = 1.5f; // Quand je declere une variable de type float je dois mettre à fin de la déclaration la lettre f pour indiquer float

        double decimal2 = 34.55154; // je n'ai pas besoin de mettre la lettre f
        System.out.println("Le Numero float est: " + decimal);
        System.out.println("Le Numero double est: " + decimal2);


        // Char stoke caractères
        // un caractère (entre '\u0000' et '\uffff').
        System.out.println();
        System.out.println("--------- Char ---------");
        System.out.println("bits type Char: " + Character.SIZE);
        System.out.println("bytes type Char: " + Character.BYTES);
        System.out.println("Valeur Max type Char: " + Character.MAX_VALUE);
        System.out.println("Valeur Min type Char: " + Character.MIN_VALUE);
        System.out.println();

        System.out.println("***** exemples *****");
        char caracter = '1'; // En utilisant le caractere
        char caracter2 = 49; // En utilisant le numero decimail
        char caracter3 = '\u0031'; // En utilisant la table ascii


        System.out.println("Le caractère 1  char est: " + caracter); // pour stoker un charecter on utilise ''
        System.out.println("Le caractère 2 char est: " + caracter2);
        System.out.println("Le caractère 3 char est: " + caracter3);

        // Boolean
        // un booléen  qui ne pourra prendre que les valeurs true ou false
        System.out.println();
        System.out.println("--------- Boolean ---------");
        System.out.println("True type Boolean: " + Boolean.TRUE);
        System.out.println("False type Boolean: " + Boolean.FALSE);
        System.out.println();


        System.out.println("***** exemples *****");
        boolean decision = true;

        if (decision) {
            System.out.println("La Decision boolean es : " + decision);
        } else {
            System.out.println("La Decision boolean es : " + decision);
        }


    }
}
