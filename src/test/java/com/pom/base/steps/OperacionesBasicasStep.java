package com.pom.base.steps;

import com.pom.base.pageobjects.CalculadoraEstandarObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import java.io.File;
import java.io.IOException;


public class OperacionesBasicasStep extends PageObject {
    CalculadoraEstandarObject calculadoraEstandar;
    private WiniumDriver driver = null;
    private WiniumDriverService service = null;

    @Step
    public void abrirCalculadora() {

        System.out.println("llamado para abrir calculadora");
        //Inicializar driver winium
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        File driverPath = new File("C:\\Users\\rospinap\\Desktop\\Proyectos\\repaso\\Winium_selenium_gradle\\src\\test\\resources\\driver\\Winium.Desktop.Driver.exe");
        service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
            service.stop();

        }

        driver = new WiniumDriver(service, option);

    }

    @Step
    public void sumarNumeros() {
        waitFor(3).seconds();
        driver.findElement(By.id("num7Button")).click();
        driver.findElement(By.id("plusButton")).click(); //+ id
        driver.findElement(By.id("num8Button")).click();
        driver.findElement(By.id("equalButton")).click();// = id
    }

    public void visualizoSuma() {
        String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println("Result is =" + result);
        service.stop();
    }
}
