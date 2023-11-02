package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Cat {
    public String name;
    public String breed;
    public String sex;
    public static int age;
    public String hair;
    public static String colour;
    public boolean castrated;
    private String eyeColour = "blue";

    public Cat(String name, String breed, String sex, String hair, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.hair = hair;
        this.castrated = castrated;
    }


    public static String changeColour(String color) {
       colour = color;
        return colour;
    }

    public void changeEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static void changeAge(int edad) {
        age = edad;
    }

    public int obtenerAge() {
        return age;
    }

    public void chageCastrated() {
        this.castrated = true;
    }

    public void isCastrated() {
        if (this.castrated == true) {
            System.out.println("El gato está castrado");
        } else {
            System.out.println("El gato no está castrado");
        }
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + age + "   Sexo: " + this.sex + "     Raza: " +
                this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + colour);
        isCastrated();

    }

    public static void main(String[] args) {
        Cat gatoGrizi = new Cat("Grizi", "bobtail", "Macho", "pelo corto", false);
        Cat gatoFiona = new Cat("Fiona", "siames", "Hembra", "pelo largo", false);
        Cat gatoNiño = new Cat("Niño", "persa", "Macho", "pelo largo", false);

        gatoGrizi.chageCastrated();
        gatoFiona.chageCastrated();
        Cat.changeAge(10);
        Cat.changeAge(7);
        Cat.changeColour("green");
        Cat.changeColour("brown");
        gatoNiño.changeEyeColour("blue");
        gatoGrizi.catDetails();
        gatoFiona.catDetails();
        gatoNiño.catDetails();
    }
}