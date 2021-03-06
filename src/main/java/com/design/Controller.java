package com.design;

import java.io.IOException;
import java.util.ArrayList;

import com.design.Model.Carrera;
import com.design.Model.Formulario;
import com.design.Model.Sede;
import com.design.Model.TEstado;
import com.design.Model.TGrado;
import com.design.Providers.GestorCarreras;
import com.design.Providers.GestorFormulario;

import javafx.fxml.FXML;

public class Controller {

    // JavaFX: Atributos y metodos

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("ViewCarreras");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("ViewFormularios");
    }

    // Logica de Negocio: Atributos y metodos.

    private GestorCarreras gCarreras;
    private GestorFormulario gFormularios;

    public Controller() {
        this.gCarreras = new GestorCarreras();
        this.gFormularios = new GestorFormulario();
    }

    public boolean crearCarrera(String pCodigo, String pNombre, int pPuntajeAdmin,
            int pCapacidadMax, TGrado pGrado, Sede pLaSede) {
        try {
            Carrera carrera = new Carrera(pCodigo, pNombre, pPuntajeAdmin, pCapacidadMax, pGrado, pLaSede);
            gCarreras.agregarCarreras(carrera);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }

    public ArrayList<Carrera> visualizarCarreras() {
        ArrayList<Carrera> resultado;
        resultado = gCarreras.buscarCarreras();
        return resultado;

    }

    public ArrayList<Carrera> visualizarCarrerasPorSede() {
        ArrayList<Carrera> resultado;
        resultado = gCarreras.buscarCarrerasPorSede();
        return resultado;

    }

    public Carrera getCarrera(String pCodigo, String pCodigoSede) {
        return gCarreras.buscarCarrera(pCodigo, pCodigoSede);
    }

    public boolean editarCarrera(Carrera pCarrera, String pCodigoSede) {
        return gCarreras.modificarCarrera(pCarrera, pCodigoSede);
    }

    public boolean crearFormulario(Formulario pUnFormulario) {
        return gFormularios.agregarFormulario(pUnFormulario);
    }

    public boolean simularAplicacionExamen() {
        try {

            return true;
        } catch (Exception e) {
            // TODO: handle exception

            return false;
        }
    }

    public boolean procesarResultados() {
        try {

            return true;
        } catch (Exception e) {
            // TODO: handle exception

            return false;
        }
    }

    public ArrayList<Formulario> visualizarSolicitudes() {
        return gFormularios.getSolicitudes();
    }

    public ArrayList<Formulario> verFormularios(TEstado pEstado, boolean pPorNombre) {
        if (pPorNombre) {
            return gFormularios.getSolicitudesPorNombre(pEstado);
        }
        return gFormularios.getSolicitudesPorPuntaje(pEstado);
    }

    public int getCantidadSolicitudes(TEstado pEstado) {
        return 2000;
    }

    public Formulario visualizarFormulario(int pNum, TEstado pEstado, Carrera pCarrera, int pPuntuaje) {
        Formulario formulario = new Formulario(pNum, pEstado, pCarrera, pPuntuaje);
        return formulario;
    }

}
