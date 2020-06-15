package com.pom.base.steps;

import com.pom.base.pageobjects.BooksObject;
import com.pom.base.pageobjects.HomeObject;
import com.pom.base.pageobjects.IframesTestObject;
import com.pom.base.pageobjects.LoginObject;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class SahiTestStep extends PageObject {

    private HomeObject homeObject;
    private IframesTestObject iframesTestObject;
    private LoginObject loginObject;
    private BooksObject booksObject;


    public void abrirPaginaPrincipal() {
        homeObject.open();
    }

    public void clickLinkIframeTest() {
        homeObject.getIframesTestlink().click();
    }

    public void seleccionLinkIframe() {
        getDriver().switchTo().frame(iframesTestObject.getSecondIframe());
        iframesTestObject.getLinkWindowOpenTest().click();

        //seleccion pestaña abierta
        ArrayList<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(browserTabs.get(1));
    }

    public void validarAperturaVentana() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(getDriver().getCurrentUrl().contains("/demo/framesTest.htm"));
    }

    public void seleccionLinkErrorIframe() {
        getDriver().switchTo().frame(iframesTestObject.getSecondIframe());
        iframesTestObject.getLinkErrorPage().click();
        iframesTestObject.getLink404Error().click();
    }

    public void validarMensajeError() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat(iframesTestObject.getTitleNotFound().getText(), containsText("Not Found"));

    }

    public void abrirPaginaLogin() {
        loginObject.open();
    }

    public void ingresoCredenciales() {
        loginObject.getTextBoxUsername().sendKeys("test");
        loginObject.getTextBoxPassword().sendKeys("secret");
        loginObject.getButtonLogin().click();
    }

    public void verificoLoginCorrecto() {
        shouldBeVisible(booksObject.getTextWelcome());
    }

    public void login() {
        loginObject.open();
        loginObject.getTextBoxUsername().sendKeys("test");
        loginObject.getTextBoxPassword().sendKeys("secret");
        loginObject.getButtonLogin().click();
    }

    public void agregarProductos() {
        booksObject.getBookJava().sendKeys("2");
        booksObject.getBookRuby().sendKeys("5");
        booksObject.getBookPython().sendKeys("2");
        booksObject.getBtnAdd().click();
    }

    public void verificoValorProductos() {
        assertTrue(booksObject.getTextResult().getValue().equals("2300"));
    }
}
