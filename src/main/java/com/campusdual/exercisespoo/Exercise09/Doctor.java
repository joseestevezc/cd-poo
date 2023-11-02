package com.campusdual.exercisespoo.Exercise09;

public class Doctor extends Person {
    private String especializacion;

    public Doctor(String name, String surname, String especializacion) {
        super(name, surname);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }


    public void showDetails() {
        System.out.println(this.getName()+ " " + this.getSurname() + " " + this.getEspecializacion().toLowerCase());
    }
}