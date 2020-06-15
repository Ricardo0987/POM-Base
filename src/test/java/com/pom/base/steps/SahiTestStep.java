package com.pom.base.steps;

import com.pom.base.pageobjects.*;
import net.serenitybdd.core.pages.PageObject;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class SahiTestStep extends PageObject {

    private HomeObject homeObject;
    private IframesTestObject iframesTestObject;
    private LoginObject loginObject;
    private BooksObject booksObject;
    private JsPopUpObject jsPopUpObject;


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

    public void validarAperturaVentana() throws InterruptedException {
        Thread.sleep(2000);
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

    public void abrirPaginaJsPopUp() {
        jsPopUpObject.open();
    }

    public void navegarOpciones() throws AWTException, InterruptedException {
        jsPopUpObject.getBtnAllPopUp().click();
        Robot r = new Robot();
        for (int i = 0; i < 4; ++i) {
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
        }
        jsPopUpObject.getBtnGoBack().click();
    }

    public void validarPaginaPrincipal() {
        assertThat(homeObject.getTextHome().getText(), containsText("Sahi Tests"));
    }
}
