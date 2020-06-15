package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo")
public class HomeObject extends PageObject {

    @FindBy(xpath = "//a[text()= 'IFrames Test']")
    private WebElementFacade IframesTestlink;

    public WebElementFacade getIframesTestlink() {
        return IframesTestlink;
    }


}
