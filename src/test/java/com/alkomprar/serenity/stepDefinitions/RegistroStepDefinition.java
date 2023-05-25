package com.alkomprar.serenity.stepDefinitions;

import com.alkomprar.serenity.steps.DatosRegistroStep;
import com.alkomprar.serenity.steps.RegistroUsuarioStep;
import com.alkomprar.serenity.steps.ValidacionRegistroStep;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinition {

    @Steps
    RegistroUsuarioStep registroUsuarioStep;

    @Steps
    DatosRegistroStep datosRegistroStep;

    @Steps
    ValidacionRegistroStep validacionRegistroStep;

    @Dado("^que el usuario se encuentra en la pagina alkomprar$")
    public void que_el_usuario_se_encuentra_en_la_pagina_alkomprar() {
        registroUsuarioStep.abrirUrl();

    }

    @Cuando("^ingrese el correo$")
    public void ingrese_el_correo() throws IOException {
        registroUsuarioStep.clicMiCuenta();
        registroUsuarioStep.limpiarCampoCorreo();
        registroUsuarioStep.ingresarCorreo();
        registroUsuarioStep.clicContinuar();


    }

    @Cuando("^se llene la informacion de registro$")
    public void se_llene_la_informacion_de_registro() throws IOException {
        datosRegistroStep.ingresarNombre();
        datosRegistroStep.ingresarApellidos();
        datosRegistroStep.ingresarCelular();
        datosRegistroStep.clicTerminosCondiciones();
        datosRegistroStep.clicContinuar();
    }

    @Entonces("^se puede visualizar que la cuenta fue creada con exito$")
    public void se_puede_visualizar_que_la_cuenta_fue_creada_con_exito() {
        validacionRegistroStep.validacionRegistroUsuario();
    }

}
