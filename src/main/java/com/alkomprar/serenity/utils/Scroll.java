package com.alkomprar.serenity.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Scroll {
    public void scrollElemento(WebDriver driver, By elemento) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elemento);
        jse.executeScript("arguments[0].scrollIntoView()", element);

       }
}
