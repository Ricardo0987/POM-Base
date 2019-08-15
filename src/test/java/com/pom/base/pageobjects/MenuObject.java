package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuObject extends PageObject {

    @FindBy(xpath = "//*[@id=\"LeftMenu\"]/li[2]")
    private WebElementFacade itemMaestros;

    @FindBy(xpath = "//*[@id=\"LeftMenu\"]/li[2]/ul/li[2]/a")
    private WebElementFacade itemUsuarios;

    @FindBy(xpath = "//*[@id=\"LeftMenu\"]/li[2]/ul/li[2]/ul/li[1]/a")
    private WebElementFacade itemCentroCostos;

    public WebElementFacade getItemMaestros() {
        return itemMaestros;
    }

    public WebElementFacade getItemUsuarios() {
        return itemUsuarios;
    }

    public WebElementFacade getItemCentroCostos() {
        return itemCentroCostos;
    }
}
