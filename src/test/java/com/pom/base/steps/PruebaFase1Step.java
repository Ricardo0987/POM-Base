package com.pom.base.steps;

import com.pom.base.pageobjects.CentroCostosObject;
import com.pom.base.pageobjects.LoginObject;
import com.pom.base.pageobjects.MenuObject;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;


public class PruebaFase1Step extends PageObject {

    private LoginObject loginobject;
    private MenuObject menuObject;
    private CentroCostosObject centroCostosObject;


    public void abrirPaginaPrincipal() {
        loginobject.open();
    }

    public void ingresoCentroCostos() {
        menuObject.getItemMaestros().click();
        menuObject.getItemUsuarios().click();
        menuObject.getItemCentroCostos().click();
    }

    public void validarCentroCostos() {
        assertThat(centroCostosObject.getTableCentroCostos().getText(), containsText("SUFI"));
    }
}
