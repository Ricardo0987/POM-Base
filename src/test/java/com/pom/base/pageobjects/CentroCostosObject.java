package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CentroCostosObject extends PageObject {


    @FindBy(id = "MainContent_GrvCC")
    private WebElementFacade tableCentroCostos;

    public WebElementFacade getTableCentroCostos() {
        return tableCentroCostos;
    }
}
