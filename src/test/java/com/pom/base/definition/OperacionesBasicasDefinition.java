package com.pom.base.definition;

import com.pom.base.steps.OperacionesBasicasStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class OperacionesBasicasDefinition {

    private OperacionesBasicasStep operacionesBasicas;

    @Steps
    private OperacionesBasicasStep loginStep = null;

    @Dado("^tengo el aplicativo calculadora abierto$")
    public void tengoElAplicativoCalculadoraAbierto() {
        operacionesBasicas.abrirCalculadora();
    }

    @Cuando("^realizo la suma de dos numeros$")
    public void realizoLaSumaDeDosNumeros() {
        operacionesBasicas.sumarNumeros();
    }

    @Entonces("^visualizo correctamente el resultado$")
    public void visualizoCorrectamenteElResultado() {
        operacionesBasicas.visualizoSuma();
    }
}
