package com.campusdual.exercisespoo;

import java.sql.SQLOutput;

public class Exercise05 {
    //Comprobar si un número es positivo o negativo.
    //Comprobar si un número es múltiplo de otro.
    //Comprobar si un número es menor a otro

    public static void main(String[] args) {
        System.out.print("Comprobar si el numero es positivo o negativo: ");
        esPositivo(4);
    }

    public static void esPositivo(int numero) {
        if (numero >= 0) {
            System.out.println("Es un numero positivo");

        } else {
            System.out.println("Es un numero negativo");

        }
    }

    public static void esMultiplo(int n, int m) {
        if (n % m == 0){
            System.out.println("Es un múltiplo");
        }else {
            System.out.println("No es múltiplo");
        }

    }

    public static void esMayor(int n, int n2){
        if (n > n2){
            System.out.println("Es mayor");
        } else if (n<n2) {
            System.out.println("Es menor");
        }else{
            System.out.println("Es igual");
        }
    }
}

