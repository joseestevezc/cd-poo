package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;
    private String eyeColour = "blue";

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour,
                           boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        int age = Utils.integer("Introduzca la edad del gato: ");

        if (age > 0) {
            this.age = age;
        } else {
            while (age < 0) {
                System.out.println("La edad introducida debe ser un número positivo.");
                age = Utils.integer("Introduzca la edad del gato: ");
            }
            this.age = age;
        }
    }


    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return colour;
    }

    public void setColour() {
        String colour = Utils.string("Introduzca el color de pelo de  " + this.name + " :");
        this.colour = colour;
        System.out.println("El color de pelo de " + this.name + " ha sido cambiado a " + this.colour);
    }

    public String isCastrated() {
        if (this.castrated ) {
            return "castrado";
        } else {
            return "sin castrar";
        }
    }

    public void setCastrated() {
        this.castrated = true;
        System.out.println("El gato " + this.name + " ha sido castrado");
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour() {
        String eyeColour = Utils.string("Introduzca el color de ojos de " + this.name + " :");
        this.eyeColour = eyeColour;
        System.out.println("El color de ojos de " + this.name + " ha sido cambiado a " + this.eyeColour);
    }

    public void catEncapsulatedDetails() {
        System.out.println("Nombre: " + this.name + "   Edad: " + this.age + " Años" + "   Sexo: " + this.sex + "     "
                + "Raza: " + this.breed);
        System.out.println("Color de los ojos: " + this.eyeColour + "     Tipo de pelo: " + this.hair);
        System.out.println("Color del pelo: " + this.colour + "     Está: " + isCastrated());

        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        CatEncapsulated gatoGrizi = new CatEncapsulated("Grizi", "bobtail", "Macho", 7, "pelo corto",
                "blue", false);
        CatEncapsulated gatoFiona = new CatEncapsulated("Fiona", "persa", "Hembra", 9, "pelo largo",
                "yellow", false);
        CatEncapsulated gatoNiño = new CatEncapsulated("Niño", "esfinge", "Macho", 12, "pelo largo", "grey",
                false);

        gatoGrizi.setCastrated();
        gatoFiona.setCastrated();
        gatoGrizi.setColour();
        gatoFiona.setColour();
        gatoNiño.setEyeColour();
        gatoNiño.setAge();
        System.out.println("--------------------------------------------------------------------------------------");
        gatoGrizi.catEncapsulatedDetails();
        gatoFiona.catEncapsulatedDetails();
        gatoNiño.catEncapsulatedDetails();

    }
}