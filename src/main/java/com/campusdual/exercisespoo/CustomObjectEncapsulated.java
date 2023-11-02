package com.campusdual.exercisespoo;

public class CustomObjectEncapsulated {

    private int actualFuel = 10;
    private static String fuelLabel = "Gasolina";
    public int getActualFuel() {
        return this.actualFuel;
    }
    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("A capacidade non pode ser negativa.");
        }
    }
    public static String getFuelLabel() {
        return CustomObjectEncapsulated.fuelLabel;
    }
    public static void setFuelLabel(String fuelLabel) {
        CustomObjectEncapsulated.fuelLabel = fuelLabel;
    }
    public void showDetails() {
        System.out.println("O tipo de combustible é: " + CustomObjectEncapsulated.getFuelLabel());
    }
    public static void main(String[] args) {
        CustomObjectEncapsulated cO = new CustomObjectEncapsulated(); //cremos una instancia de la clase CustomObject
        cO.showDetails(); //accedemos de forma no estática al método del objeto (de la instancia)
        CustomObjectEncapsulated.setFuelLabel("Diésel"); //accedemos de forma estática al método de la clase
        cO.showDetails();
        System.out.println("O tipo de combustible da clase é: " + CustomObjectEncapsulated.getFuelLabel());
    }
}