package com.campusdual.exercisespoo;

public class Exercise02 {
    public static void main(String[] args) {
        //Área de un circulo = PI * r * r
        //Longitud de una circunferencia = PI * 2 * r
        //Área de un cuadrado = lado * lado

        double r = 7;
        double lado = 2.15;

        System.out.print("Area del círculo: ");
        System.out.println(Math.PI * Math.pow(r, 2));  //para elevar a un exponente
        System.out.print("Longitud de la circunferencia: ");
        System.out.println(Math.PI * 2 * r);
        System.out.print("Área de un cuadrado: ");
        System.out.println(Math.pow(lado, 2));


    }
}
