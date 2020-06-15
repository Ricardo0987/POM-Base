package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IframesTestObject extends PageObject {

    @FindBy(xpath = "//div[@id='another']//iframe")
    private WebElementFacade secondIframe;

    @FindBy(xpath = "//a[text()= 'Window Open Test']")
    private WebElementFacade linkWindowOpenTest;

    public WebElementFacade getLinkWindowOpenTest() {
        return linkWindowOpenTest;
    }

    public WebElementFacade getSecondIframe() {
        return secondIframe;
    }


}
