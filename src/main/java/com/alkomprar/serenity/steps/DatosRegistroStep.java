package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.DatosRegistroPageObject;
import com.alkomprar.serenity.utils.Excel;
import com.alkomprar.serenity.utils.Scroll;
import net.thucydides.core.annotations.Step;


import java.io.IOException;

public class DatosRegistroStep {

    DatosRegistroPageObject datosRegistroPageObject=new DatosRegistroPageObject();
    Excel excel = new Excel();
    Scroll scroll = new Scroll();
    @Step
    public void ingresarNombre() throws IOException {
        datosRegistroPageObject.getDriver().findElement(datosRegistroPageObject.getTxtNombres())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "DatosCuenta", 1, 0));
    }

    @Step
    public void ingresarApellidos() throws IOException {
        datosRegistroPageObject.getDriver().findElement(datosRegistroPageObject.getTxtApellidos())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "DatosCuenta", 1, 1));
    }

    @Step
    public void ingresarCelular() throws IOException {
        datosRegistroPageObject.getDriver().findElement(datosRegistroPageObject.getTxtCelular())
                .sendKeys(excel.leerDatosExcel("Datos.xlsx", "DatosCuenta", 1, 3));

    }

    @Step
    public void clicTerminosCondiciones(){
        scroll.scrollElemento(datosRegistroPageObject.getDriver(),datosRegistroPageObject.getTxtNombres());
        datosRegistroPageObject.getDriver().findElement(datosRegistroPageObject.getChkTerminosCondiccion()).click();
    }

    @Step
    public void clicContinuar(){
        datosRegistroPageObject.getDriver().findElement(datosRegistroPageObject.getBtnContinuar()).click();
    }
}
