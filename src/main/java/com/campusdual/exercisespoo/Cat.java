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


    public static String changeColour() {
        colour = Utils.string("Introduce el color del pelo: ");
        return colour;
    }

    public void changeEyeColour() {
        this.eyeColour = Utils.string("Introduce el color de ojos: ");
    }

    public static void changeAge() {
        age = Utils.integer("Introduce la edad del gato: ");
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
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Cat gatoGrizi = new Cat("Grizi", "bobtail", "Macho", "pelo corto", false);
        Cat gatoFiona = new Cat("Fiona", "siames", "Hembra", "pelo largo", false);
        Cat gatoNiño = new Cat("Niño", "persa", "Macho", "pelo largo", false);

        gatoGrizi.chageCastrated();
        gatoFiona.chageCastrated();
        gatoGrizi.colour = Cat.changeColour();
        gatoFiona.colour = Cat.changeColour();
        Cat.changeAge();
        gatoGrizi.age= gatoGrizi.obtenerAge();
        Cat.changeAge();
        gatoFiona.age=gatoFiona.obtenerAge();
        gatoNiño.changeEyeColour();
        System.out.println("---------------");
        gatoGrizi.catDetails();
        gatoFiona.catDetails();
        gatoNiño.catDetails();
    }
}