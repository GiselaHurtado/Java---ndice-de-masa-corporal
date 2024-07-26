package dev.gisela.models;

public class CalculatorImc {

    public static String calcularIMC(int masa, double estatura) {
        double IMC = masa / Math.pow(estatura, 2);
        if (IMC < 16) {
            return "La persona tiene delgadez severa.";
        } else if (IMC < 17) {
            return "La persona tiene delgadez moderada.";
        } else if (IMC < 18.5) {
            return "La persona tiene delgadez leve.";
        } else if (IMC < 25) {
            return "La persona tiene peso normal.";
        } else if (IMC < 30) {
            return "La persona tiene sobrepeso.";
        } else if (IMC < 35) {
            return "La persona tiene obesidad leve.";
        } else if (IMC < 40) {
            return "La persona tiene obesidad media.";
        } else {
            return "La persona tiene obesidad mórbida.";
        }
    }

    public static void main(String[] args) {
        int masa = 97; 
        double estatura = 1.75; 
        System.out.println("La persona tiene una masa = " + masa + " kilogramos y estatura = " + estatura + " metros");
        System.out.println(calcularIMC(masa, estatura));
    }
}

