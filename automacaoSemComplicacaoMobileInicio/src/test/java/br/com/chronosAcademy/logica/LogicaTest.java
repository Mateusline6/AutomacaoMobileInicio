package br.com.chronosAcademy.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {

    Logica logica = new Logica();
    @Test
    public void validaTerrenoGrande(){

        logica.getTipoTerreno(101);
        assertEquals("Terreno grande", logica.getTipoTerreno(101));
    }
    @Test
    public void validaTerrenoPequeno(){
        logica.getTipoTerreno(99);
        assertEquals("Terreno pequeno", logica.getTipoTerreno(99));

    }


}