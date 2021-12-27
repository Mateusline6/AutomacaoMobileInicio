package br.com.chronosAcademy.logica;

public class Logica {

    public String getTipoTerreno(int Terreno) {

        if (Terreno > 100) {

            return "Terreno grande";

        } else {

            return "Terreno pequeno";
        }
    }
}
