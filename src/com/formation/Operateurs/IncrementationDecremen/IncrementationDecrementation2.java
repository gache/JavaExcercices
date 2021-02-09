package com.formation.Operateurs.IncrementationDecremen;

public class IncrementationDecrementation2 {
    public static void main(String[] args) {
//        int x = 10;
//        System.out.println("La valeur de x est : " + x);
//        x = x + 1;
//        System.out.println("La valeur de x est : " + x);
//        System.out.println();
//        System.out.println();
//        System.out.println("La valeur de x est : " + ++x);
//        System.out.println("La valeur de x est : " + x++);
//        System.out.println();
//        System.out.println();
//        System.out.println("La valeur de x est : " + x);
//        System.out.println("La valeur de x est : " + x++);
//        System.out.println("La valeur de x est : " + ++x);
//        System.out.println("La valeur de x est : " + ++x);
//        System.out.println("La valeur de x est : " + x);
//        ++x;
//        x++;
//        System.out.println(++x);
//        System.out.println(x++);
//        System.out.println(++x);


//        char A = 'c';
//        char B;
//
//        System.out.println(A);
//        System.out.println(A++);
//        System.out.println(A);
//        System.out.println(A++);
//        System.out.println(A);
//        System.out.println(++A);
//        System.out.println(A);
//        B = --A;
//        System.out.println(B);
//        System.out.println(A);
//
//        System.out.println();
//        System.out.println(A++);
//        A++;
//        --B;
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println();
//        System.out.println();
//
//        System.out.println(B++);
//        System.out.println(++B);
//        System.out.println(++A);
//        System.out.println(B--);
//        System.out.println(A);
//        System.out.println(B);

        int i = 1, j = 1, k = 1;
        i = ++j;
        System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = k++;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = k + ++j;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = i + j++;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = j + ++k;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = ++j + k++;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        j = k-- + --i;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = k + 1 + ++j;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        i = ++i + --j + k--;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);
        k = j-- + ++k;
         System.out.println("i =\t"+ i + ";" +" j =\t" + j + ";" + " k =\t" + k);


    }


}
