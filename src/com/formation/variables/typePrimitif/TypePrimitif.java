package com.formation.variables.typePrimitif;

public class TypePrimitif {
    public static void main(String[] args) {
        //  Variables qui stoke numeros entier
        // byte, short, int, long

        System.out.println("--------- Byte ---------");
        System.out.println("bits type de byte: " + Byte.SIZE);
        System.out.println("bytes type de byte: " + Byte.BYTES);
        System.out.println("Valeur Max type byte: " + Byte.MAX_VALUE);
        System.out.println("Valeur Min type byte: " + Byte.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Short ---------");
        System.out.println("bits type de Short: " + Short.SIZE);
        System.out.println("bytes type de Short: " + Short.BYTES);
        System.out.println("Valeur Max type Short: " + Short.MAX_VALUE);
        System.out.println("Valeur Min type Short: " + Short.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Int ---------");
        System.out.println("bits type de Int: " + Integer.SIZE);
        System.out.println("bytes type de Int: " + Integer.BYTES);
        System.out.println("Valeur Max type Int: " + Integer.MAX_VALUE);
        System.out.println("Valeur Min type Int: " + Integer.MIN_VALUE);

        System.out.println();

        System.out.println("--------- Long ---------");
        System.out.println("bits type de Long: " + Long.SIZE);
        System.out.println("bytes type de Long: " + Long.BYTES);
        System.out.println("Valeur Max type Long: " + Long.MAX_VALUE);
        System.out.println("Valeur Min type Long: " + Long.MIN_VALUE);
        System.out.println();
        System.out.println();


        byte entier;
        entier = 80;
        short entier2 = 1800;
        int entier3 = 15000;
        long entier4 = 1500000;

        System.out.println("Le Numéro byte est: " + entier);
        System.out.println("Le Numéro short deux  est: " + entier2);
        System.out.println("Le Numéro int trois est: " + entier3);
        System.out.println("Le Numéro long quatre est: " + entier4);


        //  Variables qui stoke numeros decimal

        float decimal = 1.5f; // Quand je declere une variable de type float je dois mettre à fin de la déclaration la lettre f pour indiquer float

        double decimal2 = 34.55154; //con este tipo de variable no tengo necesidad de colocar la letra f
        System.out.println("Le Numero float est: " + decimal);
        System.out.println("Le Numero double est: " + decimal2);

        // un caractère (entre '\u0000' et '\uffff').
        char caracter = '1';
        System.out.println("El Caracter char es: " + caracter); // pour stoker un charecter on utilise ''

        // un booléen  qui ne pourra prendre que les valeurs true ou false
        boolean decision = true;
        System.out.println("La Decision boolean es : " + decision);
    }
}
