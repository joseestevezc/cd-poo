package com.campusdual.exercisespoo.Exercise09;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");
        System.out.println("El nombre de la persona es: "+ p1.name + "y su apellido es: " + p1.surname);
    }

}
