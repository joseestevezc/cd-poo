package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

public class Coche {

    public String marca;
    public String modelo;
    public int velocidadMaxima;
    public String tipoCombustible;
    public int velocimetro=0;
    public int tacometro=0;
    private boolean encendido= false;

    private int volante=0;
    private String direccion;

    public Coche(String marca, String modelo, int velocidadMaxima, String tipoCombustible){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima= velocidadMaxima;
        this.tipoCombustible= tipoCombustible;


    }

    public void arrancar() {
        this.encendido= true;
        this.tacometro=1000;

    }
    public void apagar(){
        if(this.velocimetro==0) {
            this.encendido = false;
            this.tacometro = 0;
        }
    }

    public int acelerar(){
        if(this.encendido==true) {
            if(this.velocimetro<this.velocidadMaxima) {
                this.velocimetro += 10;
            }
        }
        return this.velocimetro;
    }
    public int frenar(){
        if(this.velocimetro>0) {
            this.velocimetro -= 10;
        }
        return this.velocimetro;
    }
    public void girarVolante(){
        int giro= Utils.integer("Introduce el ángulo de giro en grados de -180 a 180");
        this.volante+= giro;
    }

    public void darMarchaAtras(){
        this.direccion="Atrás";

    }

    public void mostrarDetalles(){
        System.out.println(this.marca+ " "+ this.modelo + " " + this.velocidadMaxima + " " + this.tipoCombustible);
        System.out.println(this.velocimetro+ " km/h - "+ this.tacometro + " Rpm - "+ this.volante+"º");


    }
    public static void main(String[] args) {
        Coche miCoche= new Coche("Mercedes", "Clase A", 120, "Gasolina");
//        System.out.println(miCoche);
        miCoche.mostrarDetalles();
        miCoche.arrancar();
        for(int i=0;i<15;i++) {
            miCoche.acelerar();
        }
        miCoche.mostrarDetalles();
        Coche coche2= new Coche("Ferrari", "F90", 300, "Gasolina");
        coche2.mostrarDetalles();
        coche2.arrancar();

        for(int i=0;i<15;i++) {
            coche2.acelerar();
        }
        coche2.mostrarDetalles();
        miCoche.apagar();
        coche2.apagar();
        coche2.mostrarDetalles();
        for(int i=0;i<20;i++) {
            miCoche.frenar();
            coche2.frenar();
        }
        miCoche.mostrarDetalles();
        coche2.mostrarDetalles();
        coche2.apagar();
        coche2.mostrarDetalles();
    }
}