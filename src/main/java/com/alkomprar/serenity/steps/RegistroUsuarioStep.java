package com.alkomprar.serenity.steps;

import com.alkomprar.serenity.pageObject.RegistroUsuarioPageObject;
import com.alkomprar.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;

public class RegistroUsuarioStep {

  @Page
  RegistroUsuarioPageObject registroUsuarioPageObject;


  Excel excel = new Excel();

  @Step("abrir navegador")
  public void abrirUrl()  {
    registroUsuarioPageObject.open();

  }
  @Step("Clic Mi Cuenta")
  public void clicMiCuenta(){
    registroUsuarioPageObject.getDriver().findElement(registroUsuarioPageObject.getBtnMiCuenta()).click();
  }
  @Step("Limpiar campo correo")
  public void limpiarCampoCorreo(){
    registroUsuarioPageObject.getDriver().findElement(registroUsuarioPageObject.getTxtCorrreo()).clear();

  }

  @Step("Ingresar correo")
  public void ingresarCorreo() throws IOException {
    registroUsuarioPageObject.getDriver().findElement(registroUsuarioPageObject.getTxtCorrreo())
            .sendKeys(excel.leerDatosExcel("Datos.xlsx","DatosCuenta",1,2));
  }
  @Step("Clic en continuar")
  public void clicContinuar(){
    registroUsuarioPageObject.getDriver().findElement(registroUsuarioPageObject.getBtnContinuar()).click();
  }

}
